import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Vehicle {
  private String name;
  private String plateNumber;
  private int maxPassengers;
  private ArrayList<Person> passengers;
  private int numPassengers;

  public Vehicle(String name, String plateNumber, int maxPassengers, ArrayList<Person> passengers, int numPassengers) {
    this.name = name;
    this.plateNumber = plateNumber;
    this.maxPassengers = maxPassengers;
    this.passengers = passengers;
    this.numPassengers = numPassengers;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPlateNumber() {
    return plateNumber;
  }

  public void setPlateNumber(String plateNumber) {
    this.plateNumber = plateNumber;
  }

  public int getMaxPassengers() {
    return maxPassengers;
  }

  public void setMaxPassengers(int maxPassengers) {
    this.maxPassengers = maxPassengers;
  }

  public ArrayList<Person> getPassengers() {
    return passengers;
  }

  public void setPassengers(ArrayList<Person> passengers) {
    this.passengers = passengers;
  }

  public int getNumPassengers() {
    return numPassengers;
  }

  public void setNumPassengers(int numPassengers) {
    this.numPassengers = numPassengers;
  }

  public void increasePassenger(Person p) {
    if (this.numPassengers < this.getMaxPassengers()) {
      this.numPassengers++;
      this.passengers.add(p);
    } else {
      System.out.println("Vehicle is full. Cannot add more passengers.");
    }
  }

  public void decreasePassenger(Person p) {
    if (this.passengers.contains(p)) {
      this.passengers.remove(p);
      this.numPassengers--;
    } else {
      System.out.println("Person not found in the vehicle.");
    }
  }

  public void addNewPassenger(Person p) {
    this.increasePassenger(p);
  }

  public boolean passengerExist(Person p) {
    return this.passengerExist(p);
  }

  public void sortPassengers(Comparator<Person> comparator) {
    Collections.sort(passengers, comparator);
  }

  public void swapPassenger(int index1, int index2) {
    if ((index1 >= 0 && index1 < passengers.size()) && (index2 >= 0 && index2 < passengers.size())) {
      Collections.swap(passengers, index1, index2);
    } else {
      System.out.println("Index out of range");
    }
  }

  @Override
  public String toString() {
    String passenger = "\n ";
    for (int i = 0; i < passengers.size(); i++) {
      passenger += passengers.get(i).toString();
      if (i < passengers.size() - 1) {
        passenger += " ";
      }
    }

    return "Vehicle: " + this.name + "\nPlate no.: " + this.plateNumber + "\nMaximum passengers: " + this.maxPassengers
        + "\nPassengers: " + passenger + "Number of Passengers: " + this.numPassengers;
  }
}
