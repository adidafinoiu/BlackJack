package ro.adi.blackjack;
/**
 * Interface that defines functionality for output and input for the game
 *
 * @author adrian.dafinoiu
 * @since 24.01.2017
 */
public interface IO {

    /**
     * This method obtains the action from the user
     * @return the obtained action
     */
    Action getAction();

    /**
     * This method prints the player options
     */
    void printPlayOptions();

    /**
     * This method obtaines the player name
     * @return the player name
     */
    String getPlayerName();

    /**
     * This method outputs a message
     * @param mesage is the message to be printed
     */
    void printMesage(String mesage);

    /**
     * This method outputs the player hand
     * @param player is the player for whom his hand will be printed
     */
    void printPlayerHand(Player player);

    /**
     * This method outputs the hand value
     * @param hand the hand
     * @param playerName the player name
     */
    void printHandValue(Hand hand, String playerName);

    /**
     * This method checks to see if the player wants to quit
     * @return true if the player wants to quit or false otherwise
     */
    boolean quit();
}
