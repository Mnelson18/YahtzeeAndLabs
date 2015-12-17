public class YahtzeeScorecard
{
	/* instance data given */
	private int ones;
	private int twos;
	private int threes;
	private int fours;
	private int fives;
	private int sixes;
	private int threeKind;
	private int fourKind;
	private int fiveKind;
	private int chance;
	private int fullHouse;
	private int smStraight;
	private int lgStraight;
	private boolean bonus;
	private int upTotal;
	private int loTotal;
	private int grTotal;

	/* Sets up a new game.  Sets all instance data to incomplete (-1). Sets bonus to false */

	public YahtzeeScorecard() {
		this.ones = -1;
		this.twos = -1;
		this.threes = -1;
		this.fours = -1;
		this.fives = -1;
		this.sixes = -1;
		this.threeKind = -1;
		this.fourKind = -1;
		this.fiveKind = -1;
		this.chance = -1;
		this.fullHouse = -1;
		this.smStraight = -1;
		this.lgStraight = -1;
		this.bonus = false;
	}

	/* 1. If the field is already full, return false
           2. Set data value ones equal to number of ones rolled multiplied by one.
           3. Update the bonus (call updateBonus())
           4. Return true   */
	public boolean markOnes(int die1, int die2, int die3, int die4, int die5)
	{
		if (ones==-1) {
			ones = 0;
			if (die1 == 1) {
				ones += 1;
			}
			if (die2 == 1) {
				ones += 1;
			}
			if (die3 == 1) {
				ones += 1;
			}
			if (die4 == 1) {
				ones += 1;
			}
			if (die5 == 1) {
				ones += 1;
			}
			ones *=1;
			return true;
		}
		return false;
	}

	/* 1. If the field is already full, return false
	   2. Set data value twos equal to number of twos rolled multiplied by two.
	   3. Update the bonus (call updateBonus())
	   4. Return true   */
	public boolean markTwos(int die1, int die2, int die3, int die4, int die5)
	{
		if (twos==-1) {
			twos = 0;
			if (die1 == 2) {
				twos += 1;
			}
			if (die2 == 2) {
				twos += 1;
			}
			if (die3 == 2) {
				twos += 1;
			}
			if (die4 == 2) {
				twos += 1;
			}
			if (die5 == 2) {
				twos += 1;
			}
			twos *=2;
			return true;
		}
		return false;

	}

	/* 1. If the field is already full, return false
	   2. Set data value threes equal to number of threes rolled multiplied by three.
	   3. Update the bonus (call updateBonus())
	   4. Return true  */
	public boolean markThrees(int die1, int die2, int die3, int die4, int die5)
	{
		if (threes==-1) {
			threes =0;
			if (die1 == 3) {
				threes += 1;
			}
			if (die2 == 3) {
				threes += 1;
			}
			if (die3 == 3) {
				threes += 1;
			}
			if (die4 == 3) {
				threes += 1;
			}
			if (die5 == 3) {
				threes += 1;
			}
			threes *=3;
			return true;
		}
		/* your code here */
		return false;
	}

	/* 1. If the field is already full, the method returns false
	   2. Sets data value fours equal to number of fours rolled multiplied by four.
	   3. Update the bonus (call updateBonus())
	   4. Returns true   */
	public boolean markFours(int die1, int die2, int die3, int die4, int die5)
	{
		if (fours==-1) {
			fours = 0;
			if (die1 == 4) {
				fours += 1;
			}
			if (die2 == 4) {
				fours += 1;
			}
			if (die3 == 4) {
				fours += 1;
			}
			if (die4 == 4) {
				fours += 1;
			}
			if (die5 == 4) {
				fours += 1;
			}
			fours *=4;
			return true;
		}
		/* your code here */
		return false;
	}

	/* 1. If the field is already full, the method returns false
	   2. Sets data value fives equal to number of fives rolled multiplied by five.
	   3. Update the bonus (call updateBonus())
	   4. Returns true   */
	public boolean markFives(int die1, int die2, int die3, int die4, int die5)
	{
		if (fives==-1) {
			fives = 0;
			if (die1 == 5) {
				fives += 1;
			}
			if (die2 == 5) {
				fives += 1;
			}
			if (die3 == 5) {
				fives += 1;
			}
			if (die4 == 5) {
				fives += 1;
			}
			if (die5 == 5) {
				fives += 1;
			}
			fives *=5;
			return true;
		}
		/* your code here */
		return false;
	}

	/* 1. If the field is already full, the method returns false
	   2. Sets data value sixes equal to number of sixes rolled multiplied by six.
	   3. Update the bonus (call updateBonus())
	   4. Returns true */
	public boolean markSixes(int die1, int die2, int die3, int die4, int die5)
	{
		if (sixes==-1) {
			sixes = 0;
			if (die1 == 6) {
				sixes += 1;
			}
			if (die2 == 6) {
				sixes += 1;
			}
			if (die3 == 6) {
				sixes += 1;
			}
			if (die4 == 6) {
				sixes += 1;
			}
			if (die5 == 6) {
				sixes += 1;
			}
			sixes *=6;
			return true;
		}
		/* your code here */
		return false;
	}

	/* 	1. If the field is already full, return false
		2. Check to see if there are actually three of the same value.
		   If there are, set the data value threeKind to the value of all five dice.
		   If there aren�t set the value to 0.
	   	   (Hint: use YahtzeeSortDice class!)
	   	4. Return true   */
	public boolean markThreeOfAKind(int die1, int die2, int die3, int die4, int die5)
	{
		YahtzeeSortDice y = new YahtzeeSortDice(die1,die2,die3,die4,die5);
		if (threeKind==-1){
			threeKind = 0;
			if (y.getFirst()== y.getSecond() && y.getSecond() == y.getThird()||y.getSecond() == y.getThird()&& y.getThird()==y.getFourth()||y.getThird()==y.getFourth()&&y.getFourth()==y.getFifth()){
				threeKind = die1 + die2 + die3 + die4 + die5;
			}
			return true;
		}


		/* your code here */
		return false;
	}

	/* 	1. If the field is already full, return false
		2. Check to see if there are actually four of the same value.
		   If there are, set the data value fourKind to the value of all five dice.
		   If there aren�t set the value to 0;
		   (Hint: use YahtzeeSortDice class!)
		4. Return true  */
	public boolean markFourOfAKind(int die1, int die2, int die3, int die4, int die5)
	{
		YahtzeeSortDice y = new YahtzeeSortDice(die1,die2,die3,die4,die5);
		if (fourKind == -1){
			fourKind = 0;
			if (y.getFirst()== y.getSecond() && y.getSecond() == y.getThird()&& y.getThird() == y.getFourth()||y.getSecond() ==y.getThird() && y.getSecond() == y.getFourth()&& y.getThird() == y.getFifth()){
				fourKind = die1 + die2 + die3 + die4 + die5;
			}
			return true;
		}
		/* your code here */
		return false;
	}

	/* 1. If the field is already full, return false
	   2. Check to see if there are actually three die with the same value, and two with another value.
	      If there are, set the data value fullHouse to 25.
	      If there aren�t set the value to 0.
	      (Hint: Use YahtzeeSortedDice class!)
       3. Return true   */
	public boolean markFullHouse(int die1, int die2, int die3, int die4, int die5)
	{
		YahtzeeSortDice y = new YahtzeeSortDice(die1,die2,die3,die4,die5);
		if (fullHouse==-1) {
			fullHouse = 0;
			if (y.getFirst()==y.getSecond()&&y.getFirst()==y.getThird()){
				if (y.getFifth()==y.getFourth()){
					fullHouse = 25;
				}
			}
			if (y.getThird()==y.getFourth()&&y.getFifth()==y.getFourth()){
				if (y.getFirst()==y.getSecond()){
					fullHouse = 25;
				}
			}
			return true;
		}
		/* your code here */
		return false;
	}

	/* 	1. If the field is already full, return false
		2. Check to see if there are actually four consecutive dice numbers.
		   If there are, set the data value smStraight to 30.
		   If there aren�t set the value to 0.
		   (Hint: Use YahtzeeSortedDice class)
		4. Return true  */
	public boolean markSmallStraight(int die1, int die2, int die3, int die4, int die5)
	{
		YahtzeeSortDice y = new YahtzeeSortDice(die1,die2,die3,die4,die5);
		if (smStraight == -1){
			smStraight = 0;
			if (y.getFirst()+1 == y.getSecond() && y.getSecond()+1 == y.getThird()&&y.getThird()+1==y.getFourth()){
				smStraight = 30;
			}
			if (y.getSecond()+1 == y.getThird() && y.getThird()+1 == y.getFourth() && y.getFourth()+1 == y.getFifth()){
				smStraight = 30;
			}


			return true;
		}
		/* your code here */
		return false;
	}

	/* 	1. If the field is already full, return false
		2. Check to see if there are actually five consecutive dice numbers.
		   If there are, set the data value lgStraight to 40.
		   If there aren�t set the value to 0;
		   (Hint: use YahtzeeSortDice class!)
		3. Return true  */
	public boolean markLargeStraight(int die1, int die2, int die3, int die4, int die5)
	{
		YahtzeeSortDice y = new YahtzeeSortDice(die1,die2,die3,die4,die5);
		if (lgStraight == -1){
			lgStraight = 0;
			if (y.getFirst()+1==y.getSecond()&&y.getSecond()+1==y.getThird()&&y.getThird()+1==y.getFourth()&&y.getFourth()+1==y.getFifth()){
				lgStraight = 40;
			}
			return true;
		}
		/* your code here */
		return false;
	}

	/* 1. If the field is already full, return false
	   2. Checks to see if there are actually five of the same value.  If there are, set the data value fiveKind to 50.  If there aren�t set the value to 0;
       3. Return true   */
	public boolean markYahtzee(int die1, int die2, int die3, int die4, int die5)
	{
		if (fiveKind==-1){
			fiveKind = 0;
			if (die1 == die2 && die1 == die3 && die1 == die4 && die1 == die5){
				fiveKind = 50;
			}
			return true;
		}
		/* your code here */
		return false;
	}

	/* 1. If the field is already full, return false
	   2. Set the data value chance to the value of all five dice.
	   3. Return true  */
	public boolean markChance(int die1, int die2, int die3, int die4, int die5)
	{
		if (chance == -1){
			chance = die1 + die2 + die3 + die4 + die5;
			return true;
		}
		/* your code here */
		return false;
	}

	/* 	1. If the bonus has already been assigned, do nothing
		2. If the upper section�s total is 63 or greater, set the data value bonus to true */
	private void updateBonus()
	{
		if (bonus == false){
			if (ones + twos + threes + fours + fives + sixes >= 63){
				bonus = true;
			}
		}
		/* your code here */
	}

	/* 	returns the upper total, remember incompletes (-1s) should not be factored in! */
	public int getUpperTotal()
	{
		updateBonus();
		upTotal = 0;
		if (ones != -1){
			upTotal +=ones;
		}
		if (twos != -1){
			upTotal +=twos;
		}
		if (threes != -1){
			upTotal += threes;
		}
		if (fours != -1){
			upTotal += fours;
		}
		if (fives != -1){
			upTotal += fives;
		}
		if (sixes != -1){
			upTotal += sixes;
		}
		if (bonus){
			upTotal += 35;
		}
		return upTotal;
	}

	/* 	returns the lower total, remember incompletes (-1s) should not be factored in! */
	public int getLowerTotal()
	{
		loTotal = 0;
		if (threeKind != -1){
			loTotal += threeKind;
		}
		if (fourKind != -1){
			loTotal += fourKind;
		}
		if (fiveKind != -1){
			loTotal += fiveKind;
		}
		if (fullHouse != -1){
			loTotal +=fullHouse;
		}
		if (smStraight != -1){
			loTotal += smStraight;
		}
		if (lgStraight != -1){
			loTotal +=lgStraight;
		}
		if (chance != -1){
			loTotal += chance;
		}
		return loTotal;
	}

	/* 	returns the grand total, remember incompletes (-1s) should not be factored in! */
	public int getGrandTotal()
	{
		updateBonus();
		grTotal = 0;
		if (threeKind != -1){
			grTotal += threeKind;
		}
		if (fourKind != -1){
			grTotal += fourKind;
		}
		if (fiveKind != -1){
			grTotal += fiveKind;
		}
		if (fullHouse != -1){
			grTotal +=fullHouse;
		}
		if (smStraight != -1){
			grTotal += smStraight;
		}
		if (lgStraight != -1){
			grTotal +=lgStraight;
		}
		if (chance != -1){
			grTotal += chance;
		}
		if (ones != -1){
			grTotal +=ones;
		}
		if (twos != -1){
			grTotal +=twos;
		}
		if (threes != -1){
			grTotal += threes;
		}
		if (fours != -1){
			grTotal += fours;
		}
		if (fives != -1){
			grTotal += fives;
		}
		if (sixes != -1){
			grTotal += sixes;
		}
		if (bonus){
			grTotal += 35;
		}


		return grTotal;
	}

	/*	Prints a scorecard with the current total, using "__" to mark uncompleted fields and a number to mark filled fields
		Sample:
		**********************************
		*  	    Yahtzee Score Card		 *
		*  					`		  	 *
		* 	Ones:				__		 *
		* 	Twos:				__		 *
		* 	Threes:				__		 *
		* 	Fours:				__		 *
		* 	Fives:				25		 *
		* 	Sixes:				__		 *
		*								 *
		*	Upper Bonus:		 0		 *
		* 	Upper Total:   		25		 *
		*								 *
		*	3 of Kind:			__		 *
		* 	4 of Kind:			__		 *
		* 	Full House:			25		 *
		* 	Sm Straight:		__		 *
		* 	Lg  Straight:		__		 *
		* 	Yahtzee:	  		 0		 *
		* 	Chance:				__		 *
		*								 *
		* 	Lower Total:		25		 *
		*								 *
		* 	Grand Total:		50		 *
		**********************************
		already implemented
	*/
	public void printScoreCard()
	{
		updateBonus();
		System.out.println();
		System.out.println("*********************************");
		System.out.println("*      Yahtzee Score Card       *");
		System.out.println("*                               *");
		System.out.print("*  Ones:\t\t\t");
		if(ones==-1)System.out.print("__");
		else System.out.print(ones);
		System.out.println("\t\t\t*");
		System.out.print("*  Twos:\t\t\t");
		if(twos==-1)System.out.print("__");
		else System.out.print(twos);
		System.out.println("\t\t    *");
		System.out.print("*  Threes:\t\t\t");
		if(threes==-1)System.out.print("__");
		else System.out.print(threes);
		System.out.println("\t\t\t*");
		System.out.print("*  Fours:\t\t\t");
		if(fours==-1)System.out.print("__");
		else System.out.print(fours);
		System.out.println("\t\t\t*");
		System.out.print("*  Fives:\t\t\t");
		if(fives==-1)System.out.print("__");
		else System.out.print(fives);
		System.out.println("\t\t\t*");
		System.out.print("*  Sixes:\t\t\t");
		if(sixes==-1)System.out.print("__");
		else System.out.print(sixes);
		System.out.println("\t\t\t*");
		System.out.println("*                               *");
		System.out.print("*  Upper Bonus:\t\t");
		if(bonus)System.out.print("35");
		else System.out.print("0");
		System.out.println("\t\t\t*");
		System.out.print("*  Upper Total:\t\t");
		System.out.print(this.getUpperTotal());
		System.out.println("\t\t\t*");
		System.out.println("*                               *");
		System.out.print("*  3 of Kind:\t\t");
		if(threeKind==-1)System.out.print("__");
		else System.out.print(threeKind);
		System.out.println("\t\t\t*");
		System.out.print("*  4 of Kind:\t\t");
		if(fourKind==-1)System.out.print("__");
		else System.out.print(fourKind);
		System.out.println("\t\t\t*");
		System.out.print("*  Full House:\t\t");
		if(fullHouse==-1)System.out.print("__");
		else System.out.print(fullHouse);
		System.out.println("\t\t\t*");
		System.out.print("*  Sm Straight:\t\t");
		if(smStraight==-1)System.out.print("__");
		else System.out.print(smStraight);
		System.out.println("\t\t\t*");
		System.out.print("*  Lg Straight:\t\t");
		if(lgStraight==-1)System.out.print("__");
		else System.out.print(lgStraight);
		System.out.println("\t\t\t*");
		System.out.print("*  Yahtzee:\t\t\t");
		if(fiveKind==-1)System.out.print("__");
		else System.out.print(fiveKind);
		System.out.println("\t\t\t*");
		System.out.print("*  Chance:\t\t\t");
		if(chance==-1)System.out.print("__");
		else System.out.print(chance);
		System.out.println("\t\t\t*");
		System.out.println("*                               *");
		System.out.print("*  Lower Total:\t\t");
		System.out.print(this.getLowerTotal());
		System.out.println("\t\t\t*");
		System.out.println("*                               *");
		System.out.print("*  Grand Total:\t\t");
		System.out.print(this.getGrandTotal());
		System.out.println("\t\t\t*");
		System.out.println("*********************************");
		System.out.println();
	}

	public void ResetScoreCard(){
		this.ones = -1;
		this.twos = -1;
		this.threes = -1;
		this.fours = -1;
		this.fives = -1;
		this.sixes = -1;
		this.threeKind = -1;
		this.fourKind = -1;
		this.fiveKind = -1;
		this.chance = -1;
		this.fullHouse = -1;
		this.smStraight = -1;
		this.lgStraight = -1;
		this.bonus = false;
	}


}