/**
 *
 * @author carl
 */
public class Card implements Comparable
{

    Suit  suit;
    String  value;
    int     rank;
    String color;

    public Card()
    {
        this(Suit.JOKER,"Joker",1);
    }

    public Card(Suit suit, String value, int rank)
    {
        this.suit = suit;
        this.value = value;
        this.rank = rank;

        if(suit == Suit.DIAMONDS || suit == Suit.HEARTS)
            color = "Red";
        else
            color = "Black";
    }

    public Suit getSuit() {
        return suit;
    }

    public String getColor() {
        return color;
    }

    public String getValue() {
        return value;
    }

    public int getRank() {
        return rank;
    }

    public String toString()
    {
        return this.value + " of " + this.suit;
    }

    public int compareTo(Object obj)
    {

        if(!(obj instanceof Card))
            return 0;

        Card other = (Card)obj;

        if(this.rank < other.rank)
            return 1;
        if(this.rank == other.rank)
            return 0;
        if(this.rank > other.rank)
            return -1;

        return 0;
    }
}
