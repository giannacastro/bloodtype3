import java.util.Scanner;

public class TestBloodData {

    //main method
    public static void main(String[] args) {
// scanner for user input
        Scanner input = new Scanner(System.in);
// bloodData object
        BloodData bloodData1 = new BloodData();
// asks user for blood type
        System.out.print("Enter blood type (A, B, AB, O): ");
        BloodData.BloodType bloodType = BloodData.BloodType.valueOf(input.nextLine());
//asks user for the Rh factor
        System.out.print("Enter Rh factor (+ or -): ");
        BloodData.RhFactor rhFactor = BloodData.RhFactor.valueOf(input.nextLine());
//second BlooData object with user input
        BloodData bloodData2 = new BloodData(bloodType, rhFactor);
//displays the first BloodData objects values
        System.out.println("\nBlood Data 1 (default):");
        System.out.println("Blood type: " + bloodData1.getBloodType());
        System.out.println("Rh factor: " + bloodData1.getRhFactor());
//displays the second BloodDatas oject values
        System.out.println("\nBlood Data 2 (user input):");
        System.out.println("Blood type: " + bloodData2.getBloodType());
        System.out.println("Rh factor: " + bloodData2.getRhFactor());
//updates the first object with user values
        bloodData1.setBloodType(bloodType);
        bloodData1.setRhFactor(rhFactor);
//displays first object to confirm update
        System.out.println("\nUpdated Blood Data 1:");
        System.out.println("Blood type: " + bloodData1.getBloodType());
        System.out.println("Rh factor: " + bloodData1.getRhFactor());

    }

}

