import java.util.Scanner;

public class Patient {

  //storage fields

  private int idNumber;
  private int age;
  private BloodData bloodData;

  // constructor and bloodData default values for initialization
  public Patient() {
    this.idNumber = 0;
    this.age = 0;
    this.bloodData = new BloodData();
  }

  // overloaded constructor for setting
  public Patient(int idNumber, int age, BloodData bloodData) {
    this.idNumber = idNumber;
    this.age = age;
    this.bloodData = bloodData;
  }

  // getters
  public int getIdNumber() {
    return idNumber;
  }

  public int getAge() {
    return age;
  }

  public BloodData getBloodData() {
    return bloodData;
  }

  //method to prompt for blood donation (creativity)
  public void donateBlood() {
    Scanner input = new Scanner(System.in);
    System.out.print("Will you donate blood? (y/n): ");
    String choice = input.nextLine();

    if(choice.equalsIgnoreCase("y")) {
      System.out.println("Patient donated blood!");
    } else {
      System.out.println("Patient did not donate blood.");
    }

    input.close();
  }

}
