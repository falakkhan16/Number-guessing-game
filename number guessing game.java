
import java.util.Scanner;

 class GuessTheNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 5;
        int rounds = 3;
        int score = 0;

        for (int round = 1; round <= rounds; round++) {
            int randomNumber = (int) (Math.random() * (maxRange - minRange + 1) + minRange);
            int attempts = 0;
            boolean guessed = false;

            System.out.println("Round " + round + ": Guess a number between " + minRange + " and " + maxRange);

            while (attempts < maxAttempts && !guessed) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess == randomNumber) {

                    guessed = true;

                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    score += maxAttempts - attempts + 1; // Award points based on attempts

                } else if (guess < randomNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
            }

            if (!guessed) {
                System.out.println("Sorry, you ran out of attempts. The correct number was " + randomNumber);
            }
        }

        System.out.println("Your final score is: " + score);
    }
}