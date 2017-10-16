package be.quentinloos.entity;

import javax.persistence.*;

@Entity
public class Driver {

  @Id @GeneratedValue
  private long id;
  private String firstname;
  private String lastname;
  @OneToOne(cascade = CascadeType.ALL)
  private Car car;

  public Driver() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
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
