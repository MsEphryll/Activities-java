public class Person {

  private String lname, fname;
  private int age;
  private double height, weight;
  private String personType;

  public Person(String lname, String fname, double height, double weight) {
    this.lname = lname;
    this.fname = fname;
    this.height = height;
    this.weight = weight;
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
    return getLname() + ", " + getFname();
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

  @Override
  public String toString() {
    return this.getFullName() + "\n%.2f".formatted(this.getBMI());
  }

}
