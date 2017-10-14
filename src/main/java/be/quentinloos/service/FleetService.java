package be.quentinloos.service;

import be.quentinloos.model.Driver;

import java.util.List;

public interface FleetService {

  List<Driver> getAllDrivers();

  void addDriver(Driver driver);

  String getGreeting();
}
