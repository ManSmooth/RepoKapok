package MiniProject;

import java.util.Scanner;

/*
Deprecated Main class (Command-line based game)
*/

public class DeprecatedMain {
    public static void main(String[] args) {
        boolean mainLoop = true;
        boolean natural = false;
        Scanner in = new Scanner(System.in);
        Hand dealer = new Hand();
        Hand player = new Hand();
        dealer.draw(1, 1);
        player.draw(2, 0);
        if (player.cardSum() == 21) {
            System.out.println("Dealer: " + dealer);
            System.out.println("Player: " + player);
            System.out.println("Natural Blackjack!");
            System.out.println();
            mainLoop = false;
            natural = true;
        }
        while (mainLoop) {
            showMenu();
            System.out.println("Dealer: " + dealer);
            int temp = dealer.cardSum();
            if (temp == 21) {
                System.out.println("Blackjack!");
            } else if (temp > 21) {
                System.out.print("Bust!");
            }
            System.out.println("Player: " + player);
            temp = player.cardSum();
            if (temp == 21) {
                System.out.println("Blackjack!");
                mainLoop = false;
            } else if (temp > 21) {
                System.out.println("Bust!");
                mainLoop = false;
            }
            if (mainLoop) {
                char menu = in.next().toLowerCase().charAt(0);
                if (menu == 's') {
                    mainLoop = false;
                } else if (menu == 'h') {
                    player.draw(1, 0);
                }
            }
            System.out.println();
        }
        dealer.show();
        System.out.println("Dealer: " + dealer);
        if (dealer.cardSum() == 21) {
            System.out.println("Natural Blackjack!");
        }
        System.out.println("Player: " + player);
        enterContinue();
        if (!natural) {
            if (player.cardSum() <= 21) {
                while (dealer.cardSum() <= player.cardSum() && dealer.cardSum() < 21) {
                    dealer.draw(1, 0);
                    System.out.println("Dealer: " + dealer);
                    if (dealer.cardSum() == 21) {
                        System.out.println("Blackjack!");
                    }
                    if (dealer.cardSum() > 21) {
                        System.out.println("Bust!");
                    }
                    System.out.println("Player: " + player);
                    enterContinue();
                    System.out.println();
                }
            }
        }
        if (dealer.cardSum() > 21 && player.cardSum() > 21) {
            System.out.println("Draw.");
        } else if (dealer.cardSum() == player.cardSum()) {
            System.out.println("Draw.");
        } else if (dealer.cardSum() > 21) {
            System.out.println("Win.");
        } else if (player.cardSum() > 21) {
            System.out.println("Lose.");
        } else if (dealer.cardSum() < player.cardSum()) {
            System.out.println("Win.");
        } else if (dealer.cardSum() > player.cardSum()) {
            System.out.println("Lose.");
        }
        in.close();
    }

    private static void showMenu() {
        System.out.println("    's' to stand\n    'h' to hit");
    }

    private static void enterContinue() {
        System.out.println("Enter to continue.");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}
