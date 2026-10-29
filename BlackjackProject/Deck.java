package BlackjackProject;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public Deck() {

        cards = new ArrayList<>();

        String[] suits = {
                "Hearts",
                "Diamonds",
                "Clubs",
                "Spades"
        };

        String[] ranks = {
                "Ace",
                "2",
                "3",
                "4",
                "5",
                "6",
                "7",
                "8",
                "9",
                "10",
                "Jack",
                "Queen",
                "King"
        };

        for (String suit : suits) {

            for (String rank : ranks) {

                int value;

                if (rank.equals("Ace")) {

                    value = 11;

                } else if (
                        rank.equals("Jack")
                        || rank.equals("Queen")
                        || rank.equals("King")) {

                    value = 10;

                } else {

                    value = Integer.parseInt(rank);
                }

                Card card = new Card(suit, rank, value);

                cards.add(card);
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card drawCard() {

        if (cards.isEmpty()) {
            return null;
        }

        return cards.remove(0);
    }

    public int getRemainingCards() {
        return cards.size();
    }
}
