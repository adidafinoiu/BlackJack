package ro.adi.blackjack.equipment;

/**
 * Interface that defines the functionality of a card
 *
 * @author adrian.dafinoiu
 * @since 24.01.2017
 */
public interface Card {

    /**
     * Method that calculates the card value
     * @return the card value
     */
    int getCardValue();

    /**
     * Getter method to obtain the card suit
     * @return the card suit
     */
    CardSuit getCardSuit();

    /**
     * Getter method to obtain the card number
     * @return the card number
     */
    CardNumber getCardNumber();

    /**
     * Getter method to optain the card face
     * @return the card face
     */
    Face getCardFace();

    /**
     * Setter method to optain the card face
     * @param face is the new card face
     */
    void setCardFace(Face face);


}
