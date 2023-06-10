// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

        public static void main(String[] args) throws InterruptedException {
            String colonyName = "Lucky";
            int shipPopulation = 300;
            double meals = 4000.00;
            boolean landing = landingCheck(22);
            //everyone eats .75 meals a day, will take 2 days
            meals -= 2 * (shipPopulation * .75);
            System.out.println(meals);
            meals += meals * 1.5;
            shipPopulation += 5;

            String landingLocation = "The Plain";
            if(landingLocation.equalsIgnoreCase("The Plain")){

                System.out.println("Bbzzz Landing on the Plain");
                new MarsExpedition();
                new GuessingGame();
                new FindingsList();

            }
            else{
                System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");
            }
        }

        public static boolean landingCheck (int minutesLeft) throws InterruptedException{
            for(int minute = 0; minute< minutesLeft; minute++){
                if(minute%2 == 0 && minute%3 == 0){
                    System.out.println("Keep Center");
                }
                else if(minute%2 == 0){
                    System.out.println("Right");
                }
                else if(minute%3 == 0){
                    System.out.println("Left");
                }
                Thread.sleep(250);
            }
            System.out.println("Landed");
            return false;
        }

}