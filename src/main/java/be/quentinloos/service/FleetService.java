package be.quentinloos.service;

import be.quentinloos.entity.Driver;

import java.util.List;

public interface FleetService {

  List<Driver> getAllDrivers();

  List<Driver> getAllDriversByBrand(String brand);

  void addDriver(Driver driver);

  String getGreeting();
}
