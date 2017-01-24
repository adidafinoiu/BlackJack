package ro.adi.blackjack;

/**
 * Stand Action implementation
 *
 * @author adrian.dafinoiu
 * @since 24.01.2017
 */
public class StandAction implements Action {

    @Override
    public void execute(Player player, Dealer dealer, IO console) {
        console.printMesage(player.getName() + " stands.");
    }
}
