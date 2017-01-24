package ro.adi.blackjack;

/**
 * Player implementation
 *
 * @author adrian.dafinoiu
 * @since 24.01.2017
 */
public class BlackJackPlayer extends Player {

    public BlackJackPlayer() {
    }

    public BlackJackPlayer(Hand hand, String name) {
        super(hand, name);
    }

    @Override
    public int getThreshHold() {
        return GameConstants.BLACK_JACK_SCORE;
    }

}
