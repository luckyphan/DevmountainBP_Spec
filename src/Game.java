import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Howdy, what's your name");
        String name = scan.nextLine();
        System.out.println(name+" I'm thinking of a number between 1 and 100.\nTry to guess my number.");
        Random rand = new Random();
        int rando = rand.nextInt(99)+1;
        int guess = scan.nextInt();
        int count =0;
        while(guess != rando){
            count++;
            if(guess > rando){
                System.out.println("Your guess is too high, try again");
                guess = scan.nextInt();
            }else
                System.out.println("Your guess is too low, try again");
                guess = scan.nextInt();
        }
        System.out.println("Well done, "+name+" You found my number in " +count + " tries");
    }

}
