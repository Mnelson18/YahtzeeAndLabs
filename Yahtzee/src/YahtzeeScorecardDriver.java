/**
 * Created by maxnelson on 12/14/15.
 */
public class YahtzeeScorecardDriver {
    public static void main(String[] args) {
        YahtzeeScorecard y = new YahtzeeScorecard();
        y.markOnes(1,1,1,1,1);
        y.markTwos(2, 2, 2, 2, 2);
        y.markThrees(3, 3, 3, 3, 3);
        y.markFours(4, 4, 4, 4, 4);
        y.markFives(5, 5, 5, 5, 5);
        y.markSixes(6, 6, 6, 6, 6);
        System.out.println(y.getUpperTotal());

        y.markThreeOfAKind(4, 3, 4, 2, 4);
        y.markFourOfAKind(5, 5, 5, 2, 2);
        y.markFullHouse(2, 6, 6, 6, 2);
        y.markChance(4, 3, 2, 1, 2);
        y.markSmallStraight(1,2,3,4,5);
        y.markLargeStraight(1,2,3,4,5);
        y.markYahtzee(6, 6, 6, 6, 6);
        System.out.println(y.getLowerTotal());

        System.out.println(y.getGrandTotal());

        y.printScoreCard();


    }
}
