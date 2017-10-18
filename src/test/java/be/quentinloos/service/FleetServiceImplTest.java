package be.quentinloos.service;

import be.quentinloos.entity.Car;
import be.quentinloos.entity.Driver;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
@DataJpaTest
@ComponentScan("be.quentinloos")
public class FleetServiceImplTest {

  @Autowired
  FleetService fleetService;

  private Driver driver;

  @Before
  public void setUp() {
    Car car = new Car();
    car.setBrand("Test Brand");
    car.setVersion("Test Version");
    car.setModel("Test Model");
    car.setPlateNumber("!-TEST-!");

    driver = new Driver();
    driver.setFirstname("Test");
    driver.setCar(car);

    fleetService.addDriver(driver);
  }

  @Test
  public void getAllDrivers() {
    assert fleetService.getAllDrivers().get(0) == driver;
  }

  @Test
  public void getAllDriversByBrand() {
    assert fleetService.getAllDriversByBrand("Test Brand").get(0) == driver;
    assert fleetService.getAllDriversByBrand("Another Brand").size() == 0;
  }

  @Test
  public void getAllDriversByFirstname() {
    assert fleetService.getAllDriversByFirstname("Test").get(0) == driver;
    assert fleetService.getAllDriversByFirstname("Quentin").size() == 0;
  }

  @Test
  public void getGreeting() {
    assert fleetService.getGreeting() != null;
  }

}