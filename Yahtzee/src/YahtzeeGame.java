import java.util.Scanner;

public class YahtzeeGame
{
	private YahtzeeDie die1;
	private YahtzeeDie die2;
	private YahtzeeDie die3;
	private YahtzeeDie die4;
	private YahtzeeDie die5;
	private YahtzeeScorecard y;
	private int NUM_SIDES;

	/* instance data should include the five yahtzee dice, a scoreboard, and a CONSTANT (static final) variable NUM_SIDES
	which should be set to six (the number of sides on a yahtzee die) */


	/* initializes the dice and scoreboard */
	public YahtzeeGame()
	{
		die1 = new YahtzeeDie(6);
		die2 = new YahtzeeDie(6);
		die3 = new YahtzeeDie(6);
		die4 = new YahtzeeDie(6);
		die5 = new YahtzeeDie(6);
		y = new YahtzeeScorecard();

		/* your code here */

	}

	/* check to see if the game is over, and while the game is not over call the method takeTurn()
	once the game ends (hint: there are 13 turns in a game of Yahtzee), the method should print a
	final scorecard and return the grand total */
	public int playGame()
	{
		y.ResetScoreCard();
		System.out.println("Starting game");
		for (int i = 0; i <13; i++){
			takeTurn();
		}
		y.printScoreCard();
		return 0;
	}

	public int GetScore(){
		return y.getGrandTotal();
	}

	/* 	1. call rollDice()
		2. call printDice()
		3. Ask the user if they are satisfied with their roll, or if they would like to roll again.
		   If they are not satisfied continue, otherwise call markScore()
		4. call chooseFrozen()
		5. call rollDice()
		6. call printDice()
		7. Ask the user if they are satisfied with their roll, or if they would like to roll again.
		   If they are not satisfied continue, otherwise call markScore()
		8. call chooseFrozen()
		9. call rollDice()
		10. call printDice()
		11. call markScore()
	*/
	private void takeTurn()
	{
		Scanner s = new Scanner(System.in);
		rollDice();
		printDice();
		System.out.println("Are you satisfied with your roll? y/n");
		String h = s.nextLine();
		if (h.equals("n")){
			chooseFrozen();
			rollDice();
			printDice();
		}
		System.out.println("are you satisfied with your roll? y/n");
		h = s.nextLine();
		if (h.equals("n")){
			chooseFrozen();
			rollDice();
			printDice();
		}
		markScore();
	}

	/* Rolls all unfrozen dice.  Also resets all dice to the unfrozen state after the roll */
	private void rollDice()
	{
		if (!die1.isFrozen()){
			die1.rollDie();
		}
		if (!die2.isFrozen()){
			die2.rollDie();
		}
		if (!die3.isFrozen()){
			die3.rollDie();
		}
		if (!die4.isFrozen()){
			die4.rollDie();
		}
		if (!die5.isFrozen()){
			die5.rollDie();
		}
		die1.unfreezeDie();
		die2.unfreezeDie();
		die3.unfreezeDie();
		die4.unfreezeDie();
		die5.unfreezeDie();
	}

	/* Asks the user which dice should be frozen 1-5 (should be read in in one line) */
	private void chooseFrozen() {
		System.out.println("Which die do you want to be frozen?");
		Scanner s = new Scanner(System.in);
		String one = s.nextLine();
		if (one.indexOf("1") != -1) {
			die1.freezeDie();
		}
		if (one.indexOf("2") != -1) {
			die2.freezeDie();
		}
		if (one.indexOf("3") != -1) {
			die3.freezeDie();
		}
		if (one.indexOf("4") != -1) {
			die4.freezeDie();
		}
		if (one.indexOf("5") != -1) {
			die5.freezeDie();
		}


	}


	/* Should print the value of all five dice separated by a tab (\t) to the console */
	private void printDice()
	{
		System.out.println(die1.getValue() + "\t" + die2.getValue() + "\t" +die3.getValue() + "\t" +die4.getValue() + "\t" +die5.getValue());
	}

	/* 1. Print a scoreboard
	   2. Ask the user where they would like to mark their score.
	   3. Call appropriate function
	   4. If false is returned the user entered an invalid number, so ask the user to try again	*/
	private void markScore()
	{
		Scanner s = new Scanner(System.in);
		y.printScoreCard();
		System.out.println("where do you want to mark your score?");
		String k = s.nextLine();
		while(!(k.equals("Ones")||k.equals("ones")||k.equals("Twos")||k.equals("twos")||k.equals("Threes")||k.equals("threes")||k.equals("Fours")||k.equals("fours")||k.equals("Fives")||k.equals("fives")||k.equals("Sixes")||k.equals("sixes")||k.equals("ThreeOfAKind") || k.equals("3 of a kind")||k.equals("FourOfAKind") || k.equals("4 of a kind")||k.equals("Full House") || k.equals("full house")||k.equals("Small Straight") || k.equals("sm Straight")||k.equals("Large Straight")||k.equals("lg Straight")||k.equals("Yahtzee")||k.equals("yahtzee")||k.equals("Chance")||k.equals("chance"))){
			System.out.println("Invalid entry");
			System.out.println("where do you want to mark your score?");
			k = s.nextLine();
		}
		if (k.equals("Ones")||k.equals("ones")){
			if (!y.markOnes(die1.getValue(), die2.getValue(), die3.getValue(), die4.getValue(), die5.getValue())){
				while (!(k.equals("Twos")||k.equals("twos")||k.equals("Threes")||k.equals("threes")||k.equals("Fours")||k.equals("fours")||k.equals("Fives")||k.equals("fives")||k.equals("Sixes")||k.equals("sixes")||k.equals("ThreeOfAKind") || k.equals("3 of a kind")||k.equals("FourOfAKind") || k.equals("4 of a kind")||k.equals("Full House") || k.equals("full house")||k.equals("Small Straight") || k.equals("sm Straight")||k.equals("Large Straight")||k.equals("lg Straight")||k.equals("Yahtzee")||k.equals("yahtzee")||k.equals("Chance")||k.equals("chance"))) {
					System.out.println("Invalid entry");
					System.out.println("where do you want to mark your score?");
					k = s.nextLine();
				}
			}else{
				y.markOnes(die1.getValue(), die2.getValue(), die3.getValue(), die4.getValue(), die5.getValue());
			}
		}else if (k.equals("Twos")||k.equals("twos")){
			if (!y.markTwos(die1.getValue(), die2.getValue(), die3.getValue(), die4.getValue(), die5.getValue())){
				while (!(k.equals("Ones")||k.equals("ones")||k.equals("Threes")||k.equals("threes")||k.equals("Fours")||k.equals("fours")||k.equals("Fives")||k.equals("fives")||k.equals("Sixes")||k.equals("sixes")||k.equals("ThreeOfAKind") || k.equals("3 of a kind")||k.equals("FourOfAKind") || k.equals("4 of a kind")||k.equals("Full House") || k.equals("full house")||k.equals("Small Straight") || k.equals("sm Straight")||k.equals("Large Straight")||k.equals("lg Straight")||k.equals("Yahtzee")||k.equals("yahtzee")||k.equals("Chance")||k.equals("chance"))) {
					System.out.println("Invalid entry");
					System.out.println("where do you want to mark your score?");
					k = s.nextLine();
				}
			}else{
				y.markTwos(die1.getValue(), die2.getValue(), die3.getValue(), die4.getValue(), die5.getValue());
			}
		}else if (k.equals("Threes")||k.equals("threes")){
			if (!y.markThrees(die1.getValue(), die2.getValue(), die3.getValue(), die4.getValue(), die5.getValue())){
				while (!(k.equals("Ones")||k.equals("ones")||k.equals("Twos")||k.equals("twos")||k.equals("Fours")||k.equals("fours")||k.equals("Fives")||k.equals("fives")||k.equals("Sixes")||k.equals("sixes")||k.equals("ThreeOfAKind") || k.equals("3 of a kind")||k.equals("FourOfAKind") || k.equals("4 of a kind")||k.equals("Full House") || k.equals("full house")||k.equals("Small Straight") || k.equals("sm Straight")||k.equals("Large Straight")||k.equals("lg Straight")||k.equals("Yahtzee")||k.equals("yahtzee")||k.equals("Chance")||k.equals("chance"))) {
					System.out.println("Invalid entry");
					System.out.println("where do you want to mark your score?");
					k = s.nextLine();
				}
			}else{
				y.markThrees(die1.getValue(), die2.getValue(), die3.getValue(), die4.getValue(), die5.getValue());
			}
		} else if (k.equals("Fours")||k.equals("fours")){
			if (!y.markFours(die1.getValue(), die2.getValue(), die3.getValue(), die4.getValue(), die5.getValue())){
				while (!(k.equals("Ones")||k.equals("ones")||k.equals("Twos")||k.equals("twos")||k.equals("Threes")||k.equals("threes")||k.equals("Fives")||k.equals("fives")||k.equals("Sixes")||k.equals("sixes")||k.equals("ThreeOfAKind") || k.equals("3 of a kind")||k.equals("FourOfAKind") || k.equals("4 of a kind")||k.equals("Full House") || k.equals("full house")||k.equals("Small Straight") || k.equals("sm Straight")||k.equals("Large Straight")||k.equals("lg Straight")||k.equals("Yahtzee")||k.equals("yahtzee")||k.equals("Chance")||k.equals("chance"))) {
					System.out.println("Invalid entry");
					System.out.println("where do you want to mark your score?");
					k = s.nextLine();
				}
			}else{
				y.markFours(die1.getValue(), die2.getValue(), die3.getValue(), die4.getValue(), die5.getValue());
			}
		}else if (k.equals("Fives")||k.equals("fives")){
			if (!y.markFives(die1.getValue(), die2.getValue(), die3.getValue(), die4.getValue(), die5.getValue())){
				while (!(k.equals("Ones")||k.equals("ones")||k.equals("Twos")||k.equals("twos")||k.equals("Threes")||k.equals("threes")||k.equals("Fours")||k.equals("fours")||k.equals("Sixes")||k.equals("sixes")||k.equals("ThreeOfAKind") || k.equals("3 of a kind")||k.equals("FourOfAKind") || k.equals("4 of a kind")||k.equals("Full House") || k.equals("full house")||k.equals("Small Straight") || k.equals("sm Straight")||k.equals("Large Straight")||k.equals("lg Straight")||k.equals("Yahtzee")||k.equals("yahtzee")||k.equals("Chance")||k.equals("chance"))) {
					System.out.println("Invalid entry");
					System.out.println("where do you want to mark your score?");
					k = s.nextLine();
				}
			}else{
				y.markFives(die1.getValue(), die2.getValue(), die3.getValue(), die4.getValue(), die5.getValue());
			}
		}else if (k.equals("Sixes")||k.equals("sixes")){
			if (!y.markSixes(die1.getValue(), die2.getValue(), die3.getValue(), die4.getValue(), die5.getValue())){
				while (!(k.equals("Ones")||k.equals("ones")||k.equals("Twos")||k.equals("twos")||k.equals("Threes")||k.equals("threes")||k.equals("Fours")||k.equals("fours")||k.equals("Fives")||k.equals("fives")||k.equals("ThreeOfAKind") || k.equals("3 of a kind")||k.equals("FourOfAKind") || k.equals("4 of a kind")||k.equals("Full House") || k.equals("full house")||k.equals("Small Straight") || k.equals("sm Straight")||k.equals("Large Straight")||k.equals("lg Straight")||k.equals("Yahtzee")||k.equals("yahtzee")||k.equals("Chance")||k.equals("chance"))) {
					System.out.println("Invalid entry");
					System.out.println("where do you want to mark your score?");
					k = s.nextLine();
				}
			}else{
				y.markSixes(die1.getValue(), die2.getValue(), die3.getValue(), die4.getValue(), die5.getValue());
			}
		}else if (k.equals("ThreeOfAKind") || k.equals("3 of a kind")) {
			if (!y.markThreeOfAKind(die1.getValue(), die2.getValue(), die3.getValue(), die4.getValue(), die5.getValue())) {
				while (!(k.equals("Ones")||k.equals("ones")||k.equals("Twos")||k.equals("twos")||k.equals("Threes")||k.equals("threes")||k.equals("Fours")||k.equals("fours")||k.equals("Fives")||k.equals("fives")||k.equals("Sixes")||k.equals("sixes")||k.equals("FourOfAKind") || k.equals("4 of a kind")||k.equals("Full House") || k.equals("full house")||k.equals("Small Straight") || k.equals("sm Straight")||k.equals("Large Straight")||k.equals("lg Straight")||k.equals("Yahtzee")||k.equals("yahtzee")||k.equals("Chance")||k.equals("chance"))) {
					System.out.println("Invalid entry");
					System.out.println("where do you want to mark your score?");
					k = s.nextLine();
				}
			} else {
				y.markThreeOfAKind(die1.getValue(), die2.getValue(), die3.getValue(), die4.getValue(), die5.getValue());
			}
		}else if (k.equals("FourOfAKind") || k.equals("4 of a kind")) {
			if (!y.markFourOfAKind(die1.getValue(), die2.getValue(), die3.getValue(), die4.getValue(), die5.getValue())) {
				while (!(k.equals("Ones")||k.equals("ones")||k.equals("Twos")||k.equals("twos")||k.equals("Threes")||k.equals("threes")||k.equals("Fours")||k.equals("fours")||k.equals("Fives")||k.equals("fives")||k.equals("Sixes")||k.equals("sixes")||k.equals("ThreeOfAKind") || k.equals("3 of a kind")||k.equals("Full House") || k.equals("full house")||k.equals("Small Straight") || k.equals("sm Straight")||k.equals("Large Straight")||k.equals("lg Straight")||k.equals("Yahtzee")||k.equals("yahtzee")||k.equals("Chance")||k.equals("chance"))) {
					System.out.println("Invalid entry");
					System.out.println("where do you want to mark your score?");
					k = s.nextLine();
				}
			} else {
				y.markFourOfAKind(die1.getValue(), die2.getValue(), die3.getValue(), die4.getValue(), die5.getValue());
			}
		} else if (k.equals("Full House") || k.equals("full house")) {
			if (!y.markFullHouse(die1.getValue(), die2.getValue(), die3.getValue(), die4.getValue(), die5.getValue())) {
				while (!(k.equals("Ones")||k.equals("ones")||k.equals("Twos")||k.equals("twos")||k.equals("Threes")||k.equals("threes")||k.equals("Fours")||k.equals("fours")||k.equals("Fives")||k.equals("fives")||k.equals("Sixes")||k.equals("sixes")||k.equals("ThreeOfAKind") || k.equals("3 of a kind")||k.equals("FourOfAKind") || k.equals("4 of a kind")||k.equals("Small Straight") || k.equals("sm Straight")||k.equals("Large Straight")||k.equals("lg Straight")||k.equals("Yahtzee")||k.equals("yahtzee")||k.equals("Chance")||k.equals("chance"))) {
					System.out.println("Invalid entry");
					System.out.println("where do you want to mark your score?");
					k = s.nextLine();
				}
			} else {
				y.markFullHouse(die1.getValue(), die2.getValue(), die3.getValue(), die4.getValue(), die5.getValue());
			}
		}else if (k.equals("Small Straight") || k.equals("sm Straight")) {
			if (!y.markSmallStraight(die1.getValue(), die2.getValue(), die3.getValue(), die4.getValue(), die5.getValue())) {
				while (!(k.equals("Ones")||k.equals("ones")||k.equals("Twos")||k.equals("twos")||k.equals("Threes")||k.equals("threes")||k.equals("Fours")||k.equals("fours")||k.equals("Fives")||k.equals("fives")||k.equals("Sixes")||k.equals("sixes")||k.equals("ThreeOfAKind") || k.equals("3 of a kind")||k.equals("FourOfAKind") || k.equals("4 of a kind")||k.equals("Full House") || k.equals("full house")||k.equals("Large Straight")||k.equals("lg Straight")||k.equals("Yahtzee")||k.equals("yahtzee")||k.equals("Chance")||k.equals("chance"))) {
					System.out.println("Invalid entry");
					System.out.println("where do you want to mark your score?");
					k = s.nextLine();
				}
			} else {
				y.markSmallStraight(die1.getValue(), die2.getValue(), die3.getValue(), die4.getValue(), die5.getValue());
			}
		}else if (k.equals("Large Straight")||k.equals("lg Straight")) {
			if (!y.markLargeStraight(die1.getValue(), die2.getValue(), die3.getValue(), die4.getValue(), die5.getValue())) {
				while (!(k.equals("Ones")||k.equals("ones")||k.equals("Twos")||k.equals("twos")||k.equals("Threes")||k.equals("threes")||k.equals("Fours")||k.equals("fours")||k.equals("Fives")||k.equals("fives")||k.equals("Sixes")||k.equals("sixes")||k.equals("ThreeOfAKind") || k.equals("3 of a kind")||k.equals("FourOfAKind") || k.equals("4 of a kind")||k.equals("Full House") || k.equals("full house")||k.equals("Small Straight") || k.equals("sm Straight")||k.equals("Yahtzee")||k.equals("yahtzee")||k.equals("Chance")||k.equals("chance"))) {
					System.out.println("Invalid entry");
					System.out.println("where do you want to mark your score?");
					k = s.nextLine();
				}
			} else{
				y.markLargeStraight(die1.getValue(), die2.getValue(), die3.getValue(), die4.getValue(), die5.getValue());
			}
		}else if (k.equals("Yahtzee")||k.equals("yahtzee")) {
			if (!y.markYahtzee(die1.getValue(), die2.getValue(), die3.getValue(), die4.getValue(), die5.getValue())) {
				while (!(k.equals("Ones")||k.equals("ones")||k.equals("Twos")||k.equals("twos")||k.equals("Threes")||k.equals("threes")||k.equals("Fours")||k.equals("fours")||k.equals("Fives")||k.equals("fives")||k.equals("Sixes")||k.equals("sixes")||k.equals("ThreeOfAKind") || k.equals("3 of a kind")||k.equals("FourOfAKind") || k.equals("4 of a kind")||k.equals("Full House") || k.equals("full house")||k.equals("Small Straight") || k.equals("sm Straight")||k.equals("Large Straight")||k.equals("lg Straight")||k.equals("Chance")||k.equals("chance"))) {
					System.out.println("Invalid entry");
					System.out.println("where do you want to mark your score?");
					k = s.nextLine();
				}
			} else{
				y.markYahtzee(die1.getValue(), die2.getValue(), die3.getValue(), die4.getValue(), die5.getValue());
			}
		}else if (k.equals("Chance")||k.equals("chance")) {
			if (!y.markChance(die1.getValue(), die2.getValue(), die3.getValue(), die4.getValue(), die5.getValue())) {
				while (!(k.equals("Ones")||k.equals("ones")||k.equals("Twos")||k.equals("twos")||k.equals("Threes")||k.equals("threes")||k.equals("Fours")||k.equals("fours")||k.equals("Fives")||k.equals("fives")||k.equals("Sixes")||k.equals("sixes")||k.equals("ThreeOfAKind") || k.equals("3 of a kind")||k.equals("FourOfAKind") || k.equals("4 of a kind")||k.equals("Full House") || k.equals("full house")||k.equals("Small Straight") || k.equals("sm Straight")||k.equals("Large Straight")||k.equals("lg Straight")||k.equals("Yahtzee")||k.equals("yahtzee"))) {
					System.out.println("Invalid entry");
					System.out.println("where do you want to mark your score?");
					k = s.nextLine();
				}
			} else{
				y.markChance(die1.getValue(), die2.getValue(), die3.getValue(), die4.getValue(), die5.getValue());
			}
		}else{
			System.out.println("Entry invalid");
		}

	}
}