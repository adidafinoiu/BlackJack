package ro.adi.blackjack.equipment;

/**
 * PlayingCard implementation
 *
 * @author adrian.dafinoiu
 * @since 24.01.2017
 */
public class PlayingCard implements Card {

    private Face cardFace;
    private CardSuit cardSuit;
    private CardNumber cardNumber;

    public PlayingCard() {
    }

    public PlayingCard(CardSuit cardSuit, CardNumber cardNumber) {
        this.cardFace = Face.DOWN;
        this.cardSuit = cardSuit;
        this.cardNumber = cardNumber;
    }

    @Override
    public int getCardValue() {
        return this.cardNumber.getDefaultValue();
    }

    @Override
    public Face getCardFace() {
        return cardFace;
    }

    @Override
    public CardSuit getCardSuit() {
        return cardSuit;
    }

    @Override
    public void setCardFace(Face cardFace) {
        this.cardFace = cardFace;
    }

    public void setCardSuit(CardSuit cardSuit) {
        this.cardSuit = cardSuit;
    }

    public CardNumber getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(CardNumber cardNumber) {
        this.cardNumber = cardNumber;
    }

}
