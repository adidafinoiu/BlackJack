package ro.adi.blackjack;

/**
 * Abstract class that defines the common functionality of a player and dealer
 *
 * @author adrian.dafinoiu
 * @since 24.01.2017
 */
public abstract class Player {

    private Hand hand;
    private String name;

    public Player() {
    }

    public Player(Hand hand, String name) {
        this.hand = hand;
        this.name = name;
    }

    public abstract int getThreshHold();

    protected boolean isDealer(){
        return false;
    }

    public void play(IO console, Dealer dealer){

        while(this.getHand().getValue() < getThreshHold()){
            Action action;
            int numberOFCards = this.getHand().getCards().size();

            // Get Action
            if(isDealer()){
                action = new HitAction();
            }else {
                console.printPlayOptions();
                action = console.getAction();
            }

            // Execute Action
            action.execute(this, dealer, console);

            // Stand
            if(numberOFCards == this.getHand().getCards().size()){
                break;
            }

        }

        // Check if BlackJack
        if(this.getHand().getValue() == GameConstants.BLACK_JACK_SCORE){
            console.printMesage(GameConstants.BLACK_JACK);
        }
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && !name.equals(""))
        this.name = name;
    }
}
