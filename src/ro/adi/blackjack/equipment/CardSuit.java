package ro.adi.blackjack.equipment;

/**
 * This enum contains all possible card suits
 *
 * @author adrian.dafinoiu
 * @since 24.01.2017
 */
public enum CardSuit{

    HEARTS("Heart"),
    DIAMONDS("Diamonds"),
    CLUBS("Clubs"),
    SPADES("Spades");

    private final String name;

    CardSuit(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}