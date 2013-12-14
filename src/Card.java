/**
 * A class that models a playing card.
 *
 * @author Carl Poole
 */
public class Card implements Comparable{

    /**
     * The suit of the card, E.G: HEARTS.
     */
    Suit suit;

    /**
     * The card point value.
     */
    String value;

    /**
     * The card rank.
     */
    int rank;

    /**
     * The card color.
     */
    String color;

    /**
     * Constructs a new default card (Joker).
     */
    public Card(){
        this(Suit.JOKER,"Joker",1);
    }

    /**
     * Constructs a new card.
     *
     * @param suit The suit of the card.
     * @param value The value of the card.
     * @param rank The rank of the card.
     */
    public Card(Suit suit, String value, int rank){
        this.suit = suit;
        this.value = value;
        this.rank = rank;

        if(suit == Suit.DIAMONDS || suit == Suit.HEARTS)
            color = "Red";
        else
            color = "Black";
    }

    /**
     * Gets the suit of the card.
     *
     * @return The suit of the card.
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * Gets the card color.
     *
     * @return The color of the card.
     */
    public String getColor() {
        return color;
    }

    /**
     * Gets the value of the card.
     *
     * @return The card value.
     */
    public String getValue() {
        return value;
    }

    /**
     * Get the rank of the card.
     *
     * @return The card rank.
     */
    public int getRank() {
        return rank;
    }

    /**
     * Gets a string description of the card's value and suit.
     *
     * @return The value and suit of the card.
     */
    public String toString(){
        return this.value + " of " + this.suit;
    }

    /**
     * Comparator that utilizes card rank.
     *
     * @param obj Object to compare to.
     * @return 1 if less-than, 0 if equal, -1 if greater-than.
     */
    public int compareTo(Object obj){

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
