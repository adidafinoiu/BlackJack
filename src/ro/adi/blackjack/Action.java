package ro.adi.blackjack;

/**
 * Interface that defines a player action
 *
 * @author adrian.dafinoiu
 * @since 24.01.2017
 */
public interface Action {

    /**
     * This method represents the action that a player has to do
     *
     * @param player the player that takes the action
     * @param dealer the dealer
     * @param console the console
     */
    void execute(Player player, Dealer dealer, IO console);

}
