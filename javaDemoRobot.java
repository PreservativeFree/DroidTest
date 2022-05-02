import java.util.Scanner;
public class javaDemoRobot {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int model;
        System.out.println("Please choose a model type for your Droid");
        model = input.nextInt();
        String soak = input.nextLine();
        DroidFactory broDroid = new DroidFactory("Cathode765", model, "Sorting Subroutines");
        DroidFactory R2Droid = new DroidFactory();
        R2Droid.speak();
        System.out.println("Default Droid info");
        System.out.printf("%s, is my serial number", R2Droid.getSerialNumber());
        System.out.println("\nBro Droid info");
        //broDroid.speak();
        System.out.printf(broDroid.toString());
    }
}
