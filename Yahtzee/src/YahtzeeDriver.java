import java.util.Scanner;

public class YahtzeeDriver {
	/*
	1. Creates a new instance of the YahtzeeGame class
	2. Calls the playGame method on the Yahtzee object
	3. Asks user if they would like to play again
	4. When the user is done playing, prints the number of games played, min, max, and average score
	*/
	public static void main(String [] args)
	{
		int counter = 0;
		int max = 0;
		int min = 999999;
		int total = 0;
		int average = 0;
		int gameTotal;
			int score;
			YahtzeeGame myGame=new YahtzeeGame();
			System.out.println("Welcome to Max's APCSA Yahtzee Game!");
		System.out.println("Would you like to play?");
		Scanner s = new Scanner(System.in);
		String word = s.nextLine();
		while (word.equals("yes") ||word.equals("y")|| word.equals("Yes") || word.equals("k") || word.equals("sure") || word.equals("Sure why not") || word.equals("But of course")||word.equals("Of course")||word.equals("absofruitly")) {
			counter +=1;
			score = myGame.playGame();
			gameTotal = myGame.GetScore();
			System.out.println(myGame.GetScore());
			System.out.println("Would you like to play?");
			word = s.nextLine();
			if (gameTotal < min){
				min = gameTotal;
			}
			if (gameTotal > max){
				max = gameTotal;
			}
			total += gameTotal;
			average = total/counter;
		}

		System.out.println("Your average is " + average);
		System.out.println("Your max was " + max);
		System.out.println("Your min was " + min);

	}
}
