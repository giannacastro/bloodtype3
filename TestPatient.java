import java.util.Scanner;

public class TestPatient {

  public static void main(String[] args) {
//reads user input
    Scanner input = new Scanner(System.in);

    //patient 1 uses all default values
    Patient patient1 = new Patient();

    //patient 2 uses user input
    System.out.print("Enter ID number: ");
    int id = input.nextInt();

    System.out.print("Enter age: ");
    int age = input.nextInt();

    System.out.print("Enter blood type (A, B, AB, O): ");
    BloodData.BloodType bloodType = BloodData.BloodType.valueOf(input.next());

    //for the Rh factor input
    System.out.print("Enter Rh factor (+ or -): ");
    String rhInput = input.next();

    //initializes the rhFactor
    BloodData.RhFactor rhFactor = BloodData.RhFactor.positive;

    if(rhInput.equals("-")) {
      rhFactor = BloodData.RhFactor.negative;
    }

    BloodData bloodData = new BloodData(bloodType, rhFactor);
    Patient patient2 = new Patient(id, age, bloodData);

    //patient 3 uses user input for id and age but default BloodData
    System.out.print("\nEnter ID number: ");
    id = input.nextInt();

    System.out.print("Enter age: ");
    age = input.nextInt();
// patient 3 with default BloodData
    Patient patient3 = new Patient(id, age, new BloodData());



    //prints out the Patient data
    System.out.println("\nPatient 1 data:");
    displayPatient(patient1);

    System.out.println("\nPatient 2 data:");
    displayPatient(patient2);

    System.out.println("\nPatient 3 data:");
    displayPatient(patient3);

    patient1.donateBlood();

  }
//method that displays patient fields
  public static void displayPatient(Patient patient) {
    System.out.println("ID: " + patient.getIdNumber());
    System.out.println("Age: " + patient.getAge());
    System.out.println("Blood type: " + patient.getBloodData().getBloodType());
    System.out.println("Rh factor: " + patient.getBloodData().getRhFactor());
  }
}
