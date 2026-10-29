package BlackjackProject;

public class Player {

    protected String name;
    protected Hand hand;

    public Player(String name) {

        this.name = name;

        hand = new Hand();
    }

    public String getName() {

        return name;
    }

    public Hand getHand() {

        return hand;
    }

    public void receiveCard(Card card) {

        hand.addCard(card);
    }

    public int getScore() {

        return hand.calculateValue();
    }

    public boolean isBust() {

        return hand.isBust();
    }

    public boolean isBlackjack() {

        return hand.isBlackjack();
    }

    public void showHand() {

        hand.displayHand();
    }

    public void clearHand() {

        hand.clear();
    }
}

