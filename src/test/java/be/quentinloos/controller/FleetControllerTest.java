package be.quentinloos.controller;

import be.quentinloos.entity.Car;
import be.quentinloos.entity.Driver;
import be.quentinloos.service.FleetService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(FleetController.class)
public class FleetControllerTest {

  @MockBean
  private FleetService fleetService;

  @Autowired
  private MockMvc mvc;

  private Driver driver;
  private String json;

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

    json = "[{\"id\":0,\"firstname\":\"Test\",\"lastname\":null,\"car\":{\"id\":0,\"brand\":\"Test Brand\",\"model\":\"Test Model\",\"version\":\"Test Version\",\"plateNumber\":\"!-TEST-!\"}}]";
  }

  @Test
  public void test() throws Exception {
    given(fleetService.getAllDrivers())
      .willReturn(Collections.singletonList(driver));

    mvc.perform(get("/drivers").accept(MediaType.APPLICATION_JSON))
      .andExpect(status().isOk()).andExpect(content().string(json));
  }

}
