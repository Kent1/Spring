package be.quentinloos.service;

import be.quentinloos.entity.Driver;

import java.util.List;

public interface FleetService {

  List<Driver> getAllDrivers();

  List<Driver> getAllDriversByBrand(String brand);

  List<Driver> getAllDriversByFirstname(String firstname);

  void addDriver(Driver driver);

  String getGreeting();
}
