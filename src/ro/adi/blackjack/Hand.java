package ro.adi.blackjack;

import ro.adi.blackjack.equipment.Card;

import java.util.List;

/**
 * Interface that defines a player hand
 *
 * @author adrian.dafinoiu
 * @since 24.01.2017
 */
public interface Hand {

    /**
     * This method puts another card in the hand
     * @param card is the addes card
     */
    void addCard(Card card);

    /**
     * This method retrieves the hand value
     * @return the hand value
     */
    int getValue();

    /**
     * Getter method for the list of cards
     * @return the list of cards
     */
    List<Card> getCards();

}
