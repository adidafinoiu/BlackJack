package ro.adi.blackjack;

/**
 * Interface that contains some game constants
 *
 * @author adrian.dafinoiu
 * @since 24.01.2017
 */
public interface GameConstants {
    int BLACK_JACK_SCORE = 21;
    int DEALER_STAND_SCORE = 17;
    String BLACK_JACK = "Black Jack!!!";
    String DEFEAT = "Dealer Wins!!!";
    String DEFEAT_BUST = "Player Busts, Dealer wins!!!";
    String WIN_BUST = "Dealer Busts, Player wins!!!";
    String WIN = "Player Wins!!!";
    String DRAW = "Draw!!!";
    String PLAYER_HAND = "%s hand has : %s.";
    String PLAYER_HAND_WITH_VALUE = "%s hand has : %s. Hand value is %d.";
    String PLAYER_HAND_VALUE = "%s hand value is %d.";
    String HIT = "hit";
    String STAND = "stand";
    String HIDDEN = "hidden";
    String INIT = "Initial Draw";
}
