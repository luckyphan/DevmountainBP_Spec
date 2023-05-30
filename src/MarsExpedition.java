import java.util.Scanner;

public class MarsExpedition {
    public MarsExpedition() throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hiyaa. did you know that THE SUN'S MASS TAKES UP 99.86% OF THE SOLAR SYSTEM!!");

        System.out.println("booting up...");
        Thread.sleep(120);
        System.out.println("...");
        Thread.sleep(20);
        System.out.println("...");
        System.out.println("Ready!");
        System.out.println("Ready!");
        System.out.println("Howdy, what's your name");
        String name = scan.nextLine();
        System.out.println("Hi, " + name + "-Welcome to the Expedition prep program. Are you ready to head out into the new world? Type Y or N");
        String input = scan.nextLine();
        if (input.equalsIgnoreCase("Y")) {
            System.out.println("I knew you would say that. You are team leader for a reason.");
        } else {
            System.out.println("Too bad you are team leader. You have to go.");
        }
        System.out.println("How many people do you want on your team?");
        int team = scan.nextInt();
        if (team > 2) {
            System.out.println("That’s way too many people. We can only send 2 more members.");
            team = 2;
        } else if (team < 0) {
            System.out.println("That’s too little people. We should send at most 2  members.");
            team = 2;
        } else if (team == 2) {
            System.out.println("Perfect team right there. Nice!");
        }

        System.out.println("You are allowed to bring one snack with you. What do you want to bring?");
        scan.nextLine();
        String snack = scan.nextLine();
        System.out.println("Nice choice, you will be bringing a " + snack + " with you.");


        System.out.println("Choose between the three modes of transportation:\n" +
                "A.Cinderella's Mice\n" +
                "B.Ditto from Pokemon\n" +
                "C.plane ride piloted by a Granny with dementia\"");
        String vehicleChoice = scan.nextLine();
        String vehicle = "";
        if (vehicleChoice.equalsIgnoreCase("A")) {
            vehicle = "the mice from Cinderella";
        } else if (vehicleChoice.equalsIgnoreCase("B")) {
            vehicle = "Ditto from Pokemon";
        } else if (vehicleChoice.equalsIgnoreCase("C")) {
            vehicle = "a plane ride piloted by a Granny with dementia";
        } else {
            vehicle = "swimming";
        }

        System.out.println("Your expedition team is now ready" +
                "\nLed by " + name + " with " + team + " teammates." +
                "\nTo explore the surface of Mars using " + vehicle + "." +
                "\nThe team is heading out in" +
                "\n3...." +
                "\n2...." +
                "\n1...." +
                "\nBlastoff");
    }


    public static void main(String[] args) throws InterruptedException {
        new MarsExpedition();

    }
}