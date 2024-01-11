package codesoft_project;

// we use Random package to generate random number
import java.util.Random;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // create object of Random class for use.
        Random rand = new Random();

        int total_win = 0;
        int curr_round = 0;
        while (true) {
            // for multiple rounds
            curr_round++;
            System.out.println("-----------------------");
            System.out.println("|       ROUND " + curr_round + "        |");
            System.out.println("-----------------------");
            int total_attempts = 10;
            boolean isWon = false;

            // we generate a random number from 1 to 100 range.
            int r_num = rand.nextInt(1, 100);
            int curr_attempt = 1;
            while (curr_attempt <= total_attempts) {
                // for one round
                System.out.println("Total number of attempts left " + (total_attempts - curr_attempt + 1));
                System.out.print("Enter the guess number (1 to 100) : ");
                int user_num = sc.nextInt();
                if (user_num == r_num) {
                    System.out.println("guess is correct");
                    System.out.println("Total number of attempt used is " + curr_attempt);
                    isWon = true;
                    break;
                } else if (user_num > r_num) {
                    System.out.println("!!!! guess is too high !!!!");
                    // System.out.println();
                } else {
                    System.out.println("!!!! guess is too low !!!!");
                    // System.out.println();
                }
                curr_attempt++;
            }

            if (isWon) {
                System.out.println();
                System.out.println("!!!! YOU WIN !!!! ");
                System.out.println();
                total_win++;
            } else {
                System.out.println();
                System.out.println("!!!! YOU LOSS !!!!");
                System.out.println();
            }

            System.out.println("You want to play again (y or n)");
            char choice = sc.next().charAt(0);
            if (choice == 'n') {
                System.out.println("You win " + total_win + " rounds out of " + curr_round);
                System.out.println();
                System.out.println("!!!!!!!! GAME OVER !!!!!!!!");
                break;
            }
        }
        sc.close();
    }
}
