import java.util.ArrayList;
import java.util.Collections;

public class Launcher {
  public static void main(String[] args) {

    // create new person objects
    Person p = new Person("Bitang", "April", 19, 1.64, 57, "student");
    Person p1 = new Person("Patigdas", "Athena", 19, 1.63, 50, "student");
    Person p2 = new Person("Roronoa", "Zoro", 27, 1.80, 70, "doctor");
    Person p3 = new Person("Nico", "Robin", 25, 1.75, 55, "nurse");
    Person p4 = new Person("Voldigoad", "Anos", 20, 1.78, 60, "engineer");

    // add them to the arrylist
    ArrayList<Person> person = new ArrayList<>();
    person.add(p);
    person.add(p1);
    person.add(p2);
    person.add(p3);
    person.add(p4);

    // additional person object, new passengers
    Person p5 = new Person("Sung", "Jinwoo", 22, 1.91, 79, "actor");
    Person p6 = new Person("Kamado", "Tanjiro", 26, 1.71, 60, "teacher");
    Person p7 = new Person("Bandit", "Ban", 22, 1.92, 81, "actor");
    Person p8 = new Person("Reglia", "Shin", 30, 1.85, 75, "developer");
    Person p9 = new Person("Arima", "Kousei", 19, 1.81, 67, "pianist");

    // vehicle object
    Vehicle bus = new Vehicle("Bus", "1234", 15, person, 5);
    System.out.println("=====Before Sorting=====\n" + bus);

    // decrease passenger
    bus.decreasePassenger(p4);
    System.out.println("\n\n=====Decreased=====\n" + bus);

    // adding new passenger(s)
    bus.increasePassenger(p5);
    bus.increasePassenger(p6);
    bus.increasePassenger(p7);
    bus.increasePassenger(p8);
    bus.increasePassenger(p9);
    System.out.println("\n\n=====Increased======\n" + bus);

    // passengers sorted by BMI
    Collections.sort(person, new Person.BMIComparator());
    System.out.println("\n\n=====Sorted By BMI=====\n" + bus);

    // passenger sorted by Age
    Collections.sort(person, new Person.AgeComparator());
    System.out.println("\n\n=====Sorted By Age=====\n" + bus);

    // passenger sorted by fullname
    Collections.sort(person, new Person.FullNameComparator());
    System.out.println("\n\n=====Sorted by Full Name=====\n" + bus);

    // passenger sorted by lastname
    Collections.sort(person, new Person.LastNameComparator());
    System.out.println("\n\n=====Srted By Last Name\n" + bus);

    // sorted by passenger Type
    Collections.sort(person, new Person.PersonTypeComparator());
    System.out.println("\n\n=====Sorted By Passenger Type=====\n" + bus);

    // swapping passengers
    bus.swapPassenger(1, 3);
    System.out.println("\n\n=====Swapping Passenger======\n" + bus);
  }
}
