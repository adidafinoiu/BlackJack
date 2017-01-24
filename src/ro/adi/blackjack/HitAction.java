package ro.adi.blackjack;

import ro.adi.blackjack.equipment.Face;

/**
 * Hit Action implementation
 *
 * @author adrian.dafinoiu
 * @since 24.01.2017
 */
public class HitAction implements Action {

    @Override
    public void execute(Player player, Dealer dealer, IO console) {
        console.printMesage(player.getName() + " draws another card.");

        // Deal one card
        dealer.dealCard(player, Face.UP);

        // Print hand
        console.printPlayerHand(player);
    }
}
