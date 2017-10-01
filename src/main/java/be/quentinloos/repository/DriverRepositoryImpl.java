package be.quentinloos.repository;

import be.quentinloos.model.Car;
import be.quentinloos.model.Driver;

import java.util.Collections;
import java.util.List;

public class DriverRepositoryImpl implements DriverRepository {

  private static Driver driver;

  static {
    Car car = new Car();
    car.setBrand("Mercedes");
    car.setModel("Class A");
    car.setVersion("180");
    car.setPlateNumber("1-ABC-123");

    driver = new Driver();
    driver.setFirstname("Jeremy");
    driver.setLastname("Schmidt");
    driver.setCar(car);
  }

  public List<Driver> getAllDrivers() {
    return Collections.singletonList(driver);
  }
}
