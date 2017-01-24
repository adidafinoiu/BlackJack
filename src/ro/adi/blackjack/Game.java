package ro.adi.blackjack;

import ro.adi.blackjack.equipment.Face;

/**
 * BlackJack game implementation
 *
 * @author adrian.dafinoiu
 * @since 24.01.2017
 */
public class Game {

    private boolean quit;
    private Player player;
    private DealerPlayer dealer;
    private IO console;

    public Game() {
        quit = false;
        player = new BlackJackPlayer(new HandImpl(), "Player");
        dealer = new DealerPlayer(new HandImpl(), "Dealer");
        console = new ConsoleIO();
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.playGame();
    }

    private void playGame() {

        // Player name
        player.setName(console.getPlayerName());

        // Start the game
        while (!quit) {
            // Deal cards
            dealCards();

            // Print cards
            printCards();

            // Player gets to choose his actions
            player.play(console, dealer);

            if (player.getHand().getValue() <= GameConstants.BLACK_JACK_SCORE) {
                // Dealers makes his actions
                dealer.play(console, dealer);
            }

            // Dealer proclaims the winner and finishes the game
            dealerFinalizesGame();

            quit = console.quit();
        }

    }

    private void dealerFinalizesGame() {
        // Declare winner
        declareWinner();

        // Get cards
        getCardsFromPlayers();
    }

    private void printCards() {
        console.printPlayerHand(player);
        console.printPlayerHand(dealer);
    }

    private void printHandValues() {
        console.printHandValue(player.getHand(), player.getName());
        console.printHandValue(dealer.getHand(), dealer.getName());
    }

    private void getCardsFromPlayers() {
        dealer.returnCardsToDeck(player.getHand().getCards());
        player.getHand().getCards().clear();

        dealer.returnCardsToDeck(dealer.getHand().getCards());
        dealer.getHand().getCards().clear();
    }

    private void declareWinner() {
        // Get hand values
        int playerHangValue = player.getHand().getValue();
        int dealerHangValue = dealer.getHand().getValue();

        if (playerHangValue > GameConstants.BLACK_JACK_SCORE) {
            console.printMesage(GameConstants.DEFEAT_BUST);
            return;
        } else if (dealerHangValue > GameConstants.BLACK_JACK_SCORE){
            console.printMesage(GameConstants.WIN_BUST);
            return;
        }

        // Print hand values
        printHandValues();

        if (playerHangValue == dealerHangValue) {
            console.printMesage(GameConstants.DRAW);
        } else if (playerHangValue > dealerHangValue) {
            console.printMesage(GameConstants.WIN);
        } else if (playerHangValue < dealerHangValue) {
            console.printMesage(GameConstants.DEFEAT);
        }
    }

    private void dealCards() {
        dealer.shuffleDeck();

        console.printMesage(GameConstants.INIT);

        dealer.dealCard(player, Face.UP);
        dealer.dealCard(player, Face.UP);

        dealer.dealCard(dealer, Face.UP);
        dealer.dealCard(dealer, Face.DOWN);
    }

}
