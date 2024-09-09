import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int attempts = 5;
        int randomInt = rand.nextInt(100) + 1; // Generate a random number between 1 and 100
        int i = 0;


        while (i < attempts) {
            System.out.println("Please pick a number between 1 and 100");
            int guess = scanner.nextInt();
            // Compare guess to the random number
            if (guess < 1 || guess > 100) {
                System.out.println("Your guess is not between 1 and 100, please try again");
                continue;

            }
            if (guess < randomInt) {
                System.out.println("Please pick a higher number.");
            } else if (guess > randomInt) {
                System.out.println("Please pick a lower number.");
            } else {
                System.out.println("You win!");
                return;
            }
            i++;

        }//if (attempts == 0) You lose message at end
        System.out.println("You Lose" + "The number was: " + randomInt);

        scanner.close();

        }

    }
