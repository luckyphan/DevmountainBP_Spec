import java.util.*;

public class FindingsList {
    public FindingsList() throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome back!");
//        String [] arr = {"rock","weird rock","smooth rock","not rock"};
        ArrayList <String> rocks = new ArrayList<String>();
        Thread.sleep(500);
        rocks.add("rock");
        rocks.add("weird rock");
        rocks.add("smooth rock");
        rocks.add("not rock");
        System.out.println("Everything is loaded! "+rocks);
//        System.out.println("Everything is loaded!"+ Arrays.toString(arr));
//        for (String element:arr) {
//            System.out.print(element+", ");
//        }
        System.out.println("Wait, theres a not rock!");
        Thread.sleep(500);
        rocks.remove("not rock");
//        String [] newArr = {"rock","weird rock","smooth rock"};
//        System.out.println(Arrays.toString(arr)+"Perfect!");
        System.out.println(rocks+" Perfect!");

        HashMap<String, String> fossils = new HashMap<String, String>();
        fossils.put("Bird Fossil","The fossil has wings implying it was capable of flight");
        fossils.put("Fish Fossil","The fossil is vaguely fish shaped implies there was once water");
        fossils.put("Tooth Fossil","The tooth from an unknown fossil");
        Thread.sleep(500);
        System.out.println("Fossil data is loaded!");
        System.out.println("Which of the fossils would you like to learn more about: bird, fish, or tooth");
        String fossilChoice = scan.nextLine();
        System.out.println("Fossil: "+fossilChoice+"Fossil \nDescription: "+fossils.get((fossilChoice+" Fossil")));

        HashSet <String> supplies = new HashSet<String>();
        supplies.add("toilet paper");
        supplies.add("food");
        supplies.add("water");
        System.out.println("Supplies Before Expedition "+supplies);
        supplies.remove("toilet paper");
        System.out.println("Supplies After Expedition "+supplies);
    }

    public static void main(String[] args) throws InterruptedException {
        new FindingsList();
    }
}
