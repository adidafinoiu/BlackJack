package ro.adi.blackjack.equipment;

import java.util.List;

/**
 * Interface that defines the functionality of a card deck
 *
 * @author adrian.dafinoiu
 * @since 24.01.2017
 */
public interface Deck {

    /**
     * This method draws a card from the deck stack
     * @return the card drawn
     */
    Card draw();

    /**
     * This method places back in the deck a list of cards
     * @param cards the list of card to be placed in de deck
     */
    void push(List<Card> cards);

    /**
     * This method shuffles the deck
     */
    void suffle();

    /**
     * This method obtains the remaining number of cards in the deck
     * @return the remaining number eof card in the deck
     */
    int getSize();

}
