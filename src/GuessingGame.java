import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public GuessingGame() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Howdy, what's your name");
        String name = scan.nextLine();
        System.out.println(name+" I'm thinking of a number between 1 and 100.\nTry to guess my number.");
        Random rand = new Random();
        int rando = rand.nextInt(99)+1;
        int tries =0;
        while (true) {
            int guess;
            try {
                guess = scan.nextInt();
            } catch (InputMismatchException e) {
                String bad_input = scan.next(); // need to progress past bad input
                System.out.println("That's not an integer, try again");
                continue;
            }

            if (guess < 1 || guess > 100) {
                System.out.println(guess + " is not a valid number, try again");
                continue;
            }

            tries++;

            if (guess < rando) {
                System.out.println("Your guess is too low, try again.");
            } else if (guess > rando) {
                System.out.println("Your guess is too high, try again.");
            } else {
                System.out.println("Well done, "+name+" You found my number in " +tries + " tries");
                break;
            }
        }

    }

}
