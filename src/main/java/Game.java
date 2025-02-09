import java.util.Random;
import java.util.Scanner;

public class Game {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int maxAttempts = 5;
    int winningNumber = random.nextInt(100) + 1;
    int attempts = 0;

    public void play() {
        while (attempts < maxAttempts) {
        System.out.println("Please pick a number between 1 and 100");
        int guess = scanner.nextInt();
        if (guess < 1 || guess > 100) {
            System.out.println("Your guess is not between 1 and 100, please try again");
            continue;
        }

        if (guess == winningNumber) {
            System.out.println("You win!");
            return;
        }

        if  (attempts != maxAttempts - 1) {
            if (guess < winningNumber) {
                System.out.println("Please pick a higher number.");
            } else if (guess > winningNumber) {
                System.out.println("Please pick a lower number.");
            }
        }
        attempts++;
    }
        System.out.println("You Lose! " + "The number was: " + winningNumber);
        scanner.close();
}
}


