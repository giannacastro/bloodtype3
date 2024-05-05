import java.util.EnumSet;

public class BloodData {

  //enum for the different blood types

  public enum BloodType {
    A, B, AB, O
  }

  //enum for the Rh factors
  public enum RhFactor {
    positive, negative
  }
//stores blood types and Rh factors
  private BloodType bloodType;
  private RhFactor rhFactor;

  //constructor set the blood type to O and Rh to positive
  public BloodData() {
    this.bloodType = BloodType.O;
    this.rhFactor = RhFactor.positive;
  }
//overload constructor for blood type and Rh factor
  public BloodData(BloodType bloodType, RhFactor rhFactor) {
    this.bloodType = bloodType;
    this.rhFactor = rhFactor;
  }
//getter and setters for blood types and Rh factors
  public BloodType getBloodType() {
    return bloodType;
  }

  public void setBloodType(BloodType bloodType) {
    this.bloodType = bloodType;
  }

  public RhFactor getRhFactor() {
    return rhFactor;
  }

  public void setRhFactor(RhFactor rhFactor) {
    this.rhFactor = rhFactor;
  }

}



