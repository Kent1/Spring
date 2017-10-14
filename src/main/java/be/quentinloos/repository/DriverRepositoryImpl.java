package be.quentinloos.repository;

import be.quentinloos.model.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DriverRepositoryImpl implements DriverRepository {

  @Autowired
  List<Driver> drivers;

  @Override
  public void addDriver(Driver driver) {
    drivers.add(driver);
  }

  @Override
  public List<Driver> getAllDrivers() {
    return drivers;
  }

}
