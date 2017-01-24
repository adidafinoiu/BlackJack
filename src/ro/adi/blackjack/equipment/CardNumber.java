package ro.adi.blackjack.equipment;

/**
 * This enum contains all possible card numbers
 *
 * @author adrian.dafinoiu
 * @since 24.01.2017
 */
public enum CardNumber {
    TWO("2", 2, null),
    THREE("3", 3, null),
    FOUR("4", 4, null),
    FIVE("5", 5, null),
    SIX("6", 6, null),
    SEVEN("7", 7, null),
    EIGHT("8", 8, null),
    NINE("9", 9, null),
    TEN("10", 10, null),
    JACK("J", 10, null),
    QUEEN("Q", 10, null),
    KING("K", 10, null),
    ACE("A", 11, 1);

    private final Integer defaultValue;
    private final String name;
    private final Integer optionalValue;


    CardNumber(String name, int defaultValue, Integer optionalValue) {
        this.name = name;
        this.defaultValue = defaultValue;
        this.optionalValue = optionalValue;
    }

    public Integer getDefaultValue() {
        return defaultValue;
    }

    public String getName() {
        return name;
    }

    public Integer getOptionalValue() {
        return optionalValue;
    }
}
