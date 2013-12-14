import java.util.Scanner;

/**
 * A game to test the Deck of Cards classes.
 *
 * This is a simple High/Low card game. The player sees a drawn card
 * and decides whether to bet the next card will be higher or lower.
 * The player wins a point if they guess correctly.
 */
public class TestGame {

    public static void main(String args[]) {

        Deck d = new Deck();
        Card initial;
        Card newCard;
        int score = 0;
        String highLow = "";

        Scanner move = new Scanner(System.in);

        d.shuffle();
        System.out.println(d.getDeckCount());
        System.out.println("");

        initial = d.draw();

        while(d.getDeckCount() > 0) {
            newCard = d.draw();

            while(newCard.compareTo(initial) == 0)
                newCard = d.draw();

            System.out.println(initial);

            while(!"H".equals(highLow) && !"L".equals(highLow)) {

                if("Q".equals(highLow))
                    break;

                System.out.println("H for Higher, L for Lower, Q for Quit: ");
                highLow = move.next();
            }

            if("Q".equals(highLow))
                break;

            if((newCard.compareTo(initial) == 1) && "H".equals(highLow)) {
                score++;
            }

            if((newCard.compareTo(initial) == -1) && "L".equals(highLow)) {
                score++;
            }

            initial = newCard;
            highLow = "";

        }

        System.out.println("");
        System.out.println("Score: " + score);
        System.out.println(d.getDeckCount());

    }
}
