package be.quentinloos.controller;

import be.quentinloos.entity.Driver;
import be.quentinloos.service.FleetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FleetController {

  private final FleetService fleetService;

  @Autowired
  public FleetController(FleetService fleetService) {
    this.fleetService = fleetService;
  }

  @RequestMapping("/")
  public String Greeting() {
    return fleetService.getGreeting();
  }

  @RequestMapping("/drivers")
  public List<Driver> getAllDrivers() {
    return fleetService.getAllDrivers();
  }

  @RequestMapping(value = "/drivers", method = RequestMethod.POST)
  public void addDriver(@RequestBody Driver driver) {
    fleetService.addDriver(driver);
  }

}
