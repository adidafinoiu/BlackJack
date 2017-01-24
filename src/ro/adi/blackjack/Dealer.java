package ro.adi.blackjack;

import ro.adi.blackjack.equipment.Card;
import ro.adi.blackjack.equipment.Face;

import java.util.List;

/**
 * Interface that defines a BlackJack dealer
 *
 * @author adrian.dafinoiu
 * @since 24.01.2017
 */
public interface Dealer {

    /**
     * This method suffles the cards in the deck
     */
    void shuffleDeck();

    /**
     * This method deals a card to a specific player facing up or down
     * @param player is the player that receives the card
     * @param face is the face of the dealt card
     */
    void dealCard(Player player, Face face);

    /**
     * This method places back in the deck a list of cards
     * @param cards the list of card to be placed in de deck
     */
    void returnCardsToDeck(List<Card> cards);
}
