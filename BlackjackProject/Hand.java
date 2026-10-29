package BlackjackProject;

import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public void addCard(Card card) {

        if (card != null) {
            cards.add(card);
        }
    }

    public int calculateValue() {

        int total = 0;
        int aceCount = 0;

        for (Card card : cards) {

            total = total + card.getValue();

            if (card.getRank().equals("Ace")) {
                aceCount++;
            }
        }

        /*
         * An Ace initially has value 11.
         *
         * If total becomes greater than 21,
         * convert Ace from 11 to 1.
         *
         * Difference between 11 and 1 = 10.
         */
        while (total > 21 && aceCount > 0) {

            total = total - 10;

            aceCount--;
        }

        return total;
    }

    public boolean isBlackjack() {

        return cards.size() == 2
                && calculateValue() == 21;
    }

    public boolean isBust() {

        return calculateValue() > 21;
    }

    public void displayHand() {

        for (Card card : cards) {
            System.out.println(card);
        }

        System.out.println("Total = " + calculateValue());
    }

    public Card getCard(int index) {

        return cards.get(index);
    }

    public void clear() {

        cards.clear();
    }

    public int getCardCount() {

        return cards.size();
    }
}