package BlackjackProject;

import java.util.Scanner;

public class BlackjackGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int playerWins = 0;
        int dealerWins = 0;
        int draws = 0;

        System.out.println("=================================");
        System.out.println("       WELCOME TO BLACKJACK");
        System.out.println("=================================");

        System.out.print("Enter your name: ");

        String playerName = scanner.nextLine();

        Player player = new Player(playerName);

        Dealer dealer = new Dealer();

        boolean continueGame = true;

        while (continueGame) {

            System.out.println();
            System.out.println("=================================");
            System.out.println("           NEW ROUND");
            System.out.println("=================================");

            /*
             * A new deck is created for each round.
             */
            Deck deck = new Deck();

            deck.shuffle();

            /*
             * Clear the previous cards.
             */
            player.clearHand();

            dealer.clearHand();

            /*
             * Deal cards.
             *
             * Player gets one card.
             * Dealer gets one card.
             * Player gets second card.
             * Dealer gets second card.
             */
            player.receiveCard(deck.drawCard());

            dealer.receiveCard(deck.drawCard());

            player.receiveCard(deck.drawCard());

            dealer.receiveCard(deck.drawCard());

            /*
             * Show dealer's first card.
             */
            System.out.println();

            System.out.println("Dealer's Hand:");

            dealer.showFirstCard();

            /*
             * Show player's complete hand.
             */
            System.out.println();

            System.out.println(player.getName() + "'s Hand:");

            player.showHand();

            /*
             * Check initial Blackjack.
             */
            if (player.isBlackjack()
                    && dealer.isBlackjack()) {

                System.out.println();

                System.out.println("Both have Blackjack!");

                System.out.println("Round is a Draw.");

                draws++;

            } else if (player.isBlackjack()) {

                System.out.println();

                System.out.println("BLACKJACK!");

                System.out.println(player.getName()
                        + " Wins!");

                playerWins++;

            } else if (dealer.isBlackjack()) {

                System.out.println();

                System.out.println("Dealer has Blackjack!");

                System.out.println();

                System.out.println("Dealer's Hand:");

                dealer.showHand();

                System.out.println();

                System.out.println("Dealer Wins!");

                dealerWins++;

            } else {

                /*
                 * PLAYER TURN
                 */

                boolean playerTurn = true;

                while (playerTurn) {

                    System.out.println();

                    System.out.println("-----------------------------");

                    System.out.println(player.getName()
                            + "'s Turn");

                    System.out.println("-----------------------------");

                    System.out.print(
                            "Enter H to Hit or S to Stand: ");

                    String choice = scanner.nextLine();

                    if (choice.equalsIgnoreCase("H")) {

                        Card newCard = deck.drawCard();

                        player.receiveCard(newCard);

                        System.out.println();

                        System.out.println(
                                "You received:");

                        System.out.println(newCard);

                        System.out.println();

                        System.out.println(
                                "Your Hand:");

                        player.showHand();

                        if (player.isBust()) {

                            System.out.println();

                            System.out.println(
                                    "You went over 21!");

                            System.out.println(
                                    "Dealer Wins!");

                            dealerWins++;

                            playerTurn = false;
                        }

                    } else if (
                            choice.equalsIgnoreCase("S")) {

                        System.out.println();

                        System.out.println(
                                "You chose to Stand.");

                        playerTurn = false;

                    } else {

                        System.out.println();

                        System.out.println(
                                "Invalid input.");

                        System.out.println(
                                "Please enter H or S.");
                    }
                }

                /*
                 * Dealer only plays if
                 * player has not busted.
                 */

                if (!player.isBust()) {

                    System.out.println();

                    System.out.println(
                            "=================================");

                    System.out.println(
                            "          DEALER TURN");

                    System.out.println(
                            "=================================");

                    System.out.println();

                    System.out.println(
                            "Dealer reveals the hidden card:");

                    dealer.showHand();

                    /*
                     * Dealer must hit below 17.
                     */
                    while (dealer.shouldHit()) {

                        System.out.println();

                        System.out.println(
                                "Dealer Hits.");

                        Card dealerCard =
                                deck.drawCard();

                        dealer.receiveCard(dealerCard);

                        System.out.println(
                                "Dealer received:");

                        System.out.println(dealerCard);

                        System.out.println();

                        System.out.println(
                                "Dealer's Hand:");

                        dealer.showHand();
                    }

                    /*
                     * Check dealer bust.
                     */
                    if (dealer.isBust()) {

                        System.out.println();

                        System.out.println(
                                "Dealer went over 21!");

                        System.out.println(
                                player.getName()
                                        + " Wins!");

                        playerWins++;

                    } else {

                        System.out.println();

                        System.out.println(
                                "Dealer Stands.");

                        /*
                         * Compare final scores.
                         */

                        int playerScore =
                                player.getScore();

                        int dealerScore =
                                dealer.getScore();

                        System.out.println();

                        System.out.println(
                                "=================================");

                        System.out.println(
                                "           FINAL RESULT");

                        System.out.println(
                                "=================================");

                        System.out.println(
                                player.getName()
                                        + " Score : "
                                        + playerScore);

                        System.out.println(
                                "Dealer Score : "
                                        + dealerScore);

                        if (playerScore > dealerScore) {

                            System.out.println();

                            System.out.println(
                                    player.getName()
                                            + " Wins!");

                            playerWins++;

                        } else if (
                                dealerScore > playerScore) {

                            System.out.println();

                            System.out.println(
                                    "Dealer Wins!");

                            dealerWins++;

                        } else {

                            System.out.println();

                            System.out.println(
                                    "It's a Draw!");

                            draws++;
                        }
                    }
                }
            }

            /*
             * Display overall score.
             */

            System.out.println();

            System.out.println(
                    "=================================");

            System.out.println(
                    "          SCORE BOARD");

            System.out.println(
                    "=================================");

            System.out.println(
                    player.getName()
                            + " Wins : "
                            + playerWins);

            System.out.println(
                    "Dealer Wins : "
                            + dealerWins);

            System.out.println(
                    "Draws       : "
                            + draws);

            /*
             * Ask whether user wants
             * another round.
             */

            while (true) {

                System.out.println();

                System.out.print(
                        "Play another round? (Y/N): ");

                String answer =
                        scanner.nextLine();

                if (answer.equalsIgnoreCase("Y")) {

                    break;

                } else if (
                        answer.equalsIgnoreCase("N")) {

                    continueGame = false;

                    break;

                } else {

                    System.out.println(
                            "Please enter Y or N.");
                }
            }
        }

        /*
         * Final message.
         */

        System.out.println();

        System.out.println(
                "=================================");

        System.out.println(
                "           GAME OVER");

        System.out.println(
                "=================================");

        System.out.println(
                "Final Score:");

        System.out.println(
                player.getName()
                        + " Wins : "
                        + playerWins);

        System.out.println(
                "Dealer Wins : "
                        + dealerWins);

        System.out.println(
                "Draws       : "
                        + draws);

        System.out.println();

        System.out.println(
                "Thanks for playing Blackjack!");

        scanner.close();
    }
}