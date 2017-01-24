package ro.adi.blackjack.equipment;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * CardDeck implementation
 *
 * @author adrian.dafinoiu
 * @since 24.01.2017
 */
public class CardDeck implements Deck {

    private LinkedList<Card> playingCards = new LinkedList<>();

    public CardDeck() {
        for (CardNumber cardNumber : CardNumber.values()) {
            for (CardSuit cardSuit : CardSuit.values()) {
                playingCards.add(new PlayingCard(cardSuit, cardNumber));
            }
        }
    }

    @Override
    public Card draw() {
        return playingCards.pop();
    }

    @Override
    public void push(List<Card> cards) {
        for (Card card : cards) {
            playingCards.push(card);
        }
    }

    @Override
    public void suffle() {
        Collections.shuffle(playingCards);
    }

    @Override
    public int getSize(){
        return playingCards.size();
    }
}
