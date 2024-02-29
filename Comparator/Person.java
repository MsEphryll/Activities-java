import java.util.Comparator;

public class Person {

  private String lname, fname;
  private int age;
  private double height, weight;
  private String personType;

  public Person(String lname, String fname, int age, double height, double weight, String personType) {
    this.lname = lname;
    this.fname = fname;
    this.age = age;
    this.height = height;
    this.weight = weight;
    this.personType = personType;
  }

  public String getLname() {
    return lname;
  }

  public void setLname(String lname) {
    this.lname = lname;
  }

  public String getFname() {
    return fname;
  }

  public void setFname(String fname) {
    this.fname = fname;
  }

  public String getFullName() {
    return getFname() + " " + getLname();
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public double getBMI() {
    return getWeight() / (getHeight() * getHeight());
  }

  public String getPersonType() {
    return personType;
  }

  public void setPersonType(String personType) {
    this.personType = personType;
  }

  public static class BMIComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
      double bmi1 = p1.getBMI();
      double bmi2 = p2.getBMI();
      return Double.compare(bmi1, bmi2);
    }
  }

  public static class PersonTypeComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
      return o1.getPersonType().compareTo(o2.getPersonType());
    }
  }

  public static class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
      return Integer.compare(p1.age, p2.age);
    }
  }

  public static class LastNameComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
      return o1.getLname().compareTo(o2.getLname());
    }
  }

  public static class FullNameComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
      return o1.getFullName().compareTo(o2.getFullName());
    }
  }

  @Override
  public String toString() {
    return this.getFullName() + ", %.2f".formatted(this.getBMI()) + ", "
        + this.getAge() + ", " + this.getPersonType() + "\n";
  }

}
