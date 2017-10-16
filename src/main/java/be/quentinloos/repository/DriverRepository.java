package be.quentinloos.repository;

import be.quentinloos.entity.Driver;

import java.util.List;

public interface DriverRepository {

  List<Driver> getAllDrivers();

  void addDriver(Driver driver);

}
