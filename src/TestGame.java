import java.util.Scanner;

/**
 * Created by carl on 12/14/13.
 */
public class TestGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

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

        while(d.getDeckCount() > 0)
        {
            newCard = d.draw();

            while(newCard.compareTo(initial) == 0)
                newCard = d.draw();

            System.out.println(initial);

            while(!"H".equals(highLow) && !"L".equals(highLow))
            {

                if("Q".equals(highLow))
                    break;

                System.out.println("H for Higher, L for Lower, Q for Quit: ");
                highLow = move.next();
            }

            if("Q".equals(highLow))
                break;

            if((newCard.compareTo(initial) == 1) && "H".equals(highLow))
            {
                score++;
            }

            if((newCard.compareTo(initial) == -1) && "L".equals(highLow))
            {
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
