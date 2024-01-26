import java.util.Random;
import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(101); // Random number between 0 and 100

        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100");

        while(true) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();

            if(userGuess < numberToGuess) {
                System.out.println("Your guess is too low");
            } else if(userGuess > numberToGuess) {
                System.out.println("Your guess is too high");
            } else {
                System.out.println("Yes, the number is " + userGuess);
                break; // exit the loop
            }
        }

        scanner.close();
    }
}
