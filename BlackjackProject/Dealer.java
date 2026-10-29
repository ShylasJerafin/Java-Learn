package BlackjackProject;

public class Dealer extends Player {

    public Dealer() {

        super("Dealer");
    }

    public boolean shouldHit() {

        return getScore() < 17;
    }

    public void showFirstCard() {

        System.out.println(hand.getCard(0));

        System.out.println("[Hidden Card]");
    }
}