package ro.adi.blackjack;

import ro.adi.blackjack.equipment.Card;
import ro.adi.blackjack.equipment.Face;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * IO implementation
 *
 * @author adrian.dafinoiu
 * @since 24.01.2017
 */
public class ConsoleIO implements IO {

    private static PrintStream output;
    private static Scanner input;

    public ConsoleIO() {
        output = System.out;
        input = new Scanner(System.in);
    }

    @Override
    public Action getAction() {

        Action action = null;
        while(action == null) {
            String next = input.next();

            if (GameConstants.HIT.equalsIgnoreCase(next)) {
                action = new HitAction();
            } else if (GameConstants.STAND.equalsIgnoreCase(next)) {
                action = new StandAction();
            } else {
                output.println("Please write \"hit\" or \"stand\"!");
            }
        }

        return action;

    }

    @Override
    public void printPlayOptions() {
        output.println("Hit or Stand ?");
    }


    @Override
    public String getPlayerName() {
        output.print("Please enter player name : ");
        return input.next();
    }

    @Override
    public void printMesage(String mesage) {
        output.println(mesage);
    }

    @Override
    public void printPlayerHand(Player player) {
        output.println(getHandInfo(player));
    }

    @Override
    public void printHandValue(Hand hand, String playerName) {
        output.println(getHandValue(hand, playerName));
    }

    @Override
    public boolean quit() {
        output.println("Quit? Y/N");
        String quitOption = input.next();
        if ("Y".equalsIgnoreCase(quitOption)) {
            return true;
        } else if ("N".equalsIgnoreCase(quitOption)){
            return false;
        }

        return false;
    }

    private String getHandInfo(Player player) {
        StringBuilder handMesage = new StringBuilder();
        boolean hasHiddenCand = false;
        String comma = " ";

        for (Card card : player.getHand().getCards()) {
            if (card.getCardFace() == Face.UP) {
                handMesage.append(comma)
                        .append(card.getCardNumber().getName())
                        .append(" ")
                        .append(card.getCardSuit().getName());
                comma = ", ";
            } else {
                hasHiddenCand = true;
                handMesage.append(comma)
                        .append(GameConstants.HIDDEN);
            }
        }

        if (hasHiddenCand) {
            return String.format(GameConstants.PLAYER_HAND, player.getName(), handMesage.toString());
        } else {
            return String.format(GameConstants.PLAYER_HAND_WITH_VALUE, player.getName(), handMesage.toString(), player.getHand().getValue());
        }
    }

    private String getHandValue(Hand hand, String playerName) {
            return String.format(GameConstants.PLAYER_HAND_VALUE, playerName, hand.getValue());
    }
}
