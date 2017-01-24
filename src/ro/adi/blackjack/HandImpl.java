package ro.adi.blackjack;

import ro.adi.blackjack.equipment.Card;

import java.util.ArrayList;
import java.util.List;

import static ro.adi.blackjack.equipment.CardNumber.ACE;

/**
 * Hand implementation
 *
 * @author adrian.dafinoiu
 * @since 24.01.2017
 */
public class HandImpl implements Hand {

    private List<Card> cardList;

    public HandImpl() {
        cardList = new ArrayList<>();
    }

    @Override
    public int getValue() {
        int handValue = 0;
        int numberOfAces = 0;

        for (Card card : cardList) {
            handValue += card.getCardValue();
            if (ACE.equals(card.getCardNumber())){
                numberOfAces++;
            }
        }

        for (int i = 0; i < numberOfAces; i++) {
            if(GameConstants.BLACK_JACK_SCORE < handValue){
                handValue -= ACE.getDefaultValue() - ACE.getOptionalValue();
            }
        }

        return handValue;
    }

    @Override
    public List<Card> getCards() {
        return cardList;
    }

    @Override
    public void addCard(Card card) {
       cardList.add(card);
    }

}
