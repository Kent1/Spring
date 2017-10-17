package be.quentinloos.repository;

import be.quentinloos.entity.Car;
import be.quentinloos.entity.Driver;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class DriverRepositoryTest {

  @Autowired
  DriverRepository driverRepository;

  @Test
  public void test() {
    Car car = new Car();
    car.setBrand("Renault");
    car.setModel("Cactus");
    car.setVersion("");
    car.setPlateNumber("ABC123");

    Driver driver = new Driver();
    driver.setFirstname("Responsible");
    driver.setCar(car);

    driverRepository.save(driver);

    assert driver.equals(driverRepository.getOne(driver.getId()));

    assert driver.equals(driverRepository.findByDriverFirstname("Responsible").get(0));

    assert driver.equals(driverRepository.findAllByCar_Brand("Renault").get(0));
  }

}