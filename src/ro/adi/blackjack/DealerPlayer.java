package ro.adi.blackjack;

import ro.adi.blackjack.equipment.Card;
import ro.adi.blackjack.equipment.CardDeck;
import ro.adi.blackjack.equipment.Deck;
import ro.adi.blackjack.equipment.Face;

import java.util.List;

/**
 * Player implementation
 *
 * @author adrian.dafinoiu
 * @since 24.01.2017
 */
public class DealerPlayer extends Player implements Dealer {

    private Deck deck;

    public DealerPlayer() {
    }

    public DealerPlayer(Hand hand, String name) {
        super(hand, name);
        deck = new CardDeck();
    }

    @Override
    public int getThreshHold() {
        return GameConstants.DEALER_STAND_SCORE;
    }

    @Override
    protected boolean isDealer(){
        return true;
    }

    @Override
    public void returnCardsToDeck(List<Card> cards) {
        deck.push(cards);
    }

    @Override
    public void play(IO console, Dealer dealer) {
        // Flip card
        flipUpCard(console);

        // If dealer cannot hit another card then print the hand
        if (this.getHand().getValue() >= getThreshHold()){
            // Print hand
            console.printPlayerHand(this);
        }

        // Continue with default play
        super.play(console, dealer);
    }

    public void shuffleDeck(){
        deck.suffle();
    }

    public void dealCard(Player player, Face face){
        if(deck.getSize() > 0) {
            Card card = deck.draw();
            card.setCardFace(face);
            player.getHand().addCard(card);
        }
    }

    private void flipUpCard(IO console) {
        for (Card card : getHand().getCards()) {
            if(card.getCardFace().equals(Face.DOWN)){
                console.printMesage("Dealer hidden card was: " + card.getCardNumber().getName() + " " + card.getCardSuit().getName());
                card.setCardFace(Face.UP);
            }
        }
    }

}
