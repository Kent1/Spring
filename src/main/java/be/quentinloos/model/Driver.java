package be.quentinloos.model;

public class Driver {

  private String firstname;
  private String lastname;
  private Car car;

  public Driver() {
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public Car getCar() {
    return car;
  }

  public void setCar(Car car) {
    this.car = car;
  }

  public String toString() {
    return String.format("%s %s drives a %s", firstname, lastname, car);
  }

}
