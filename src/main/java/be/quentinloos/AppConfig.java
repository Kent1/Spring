package be.quentinloos;

import be.quentinloos.model.Car;
import be.quentinloos.model.Driver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Configuration
@ComponentScan("be.quentinloos")
@PropertySource("classpath:/application.properties")
@EnableWebMvc
public class AppConfig implements WebApplicationInitializer {

  @Bean
  public List<Driver> drivers() {
    Car car = new Car();
    car.setBrand("Mercedes");
    car.setModel("Class A");
    car.setVersion("180");
    car.setPlateNumber("1-ABC-123");

    Driver driver = new Driver();
    driver.setFirstname("Jeremy");
    driver.setLastname("Schmidt");
    driver.setCar(car);

    return new ArrayList<>(Collections.singletonList(driver));
  }

  @Override
  public void onStartup(ServletContext servletContext) throws ServletException {
    AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
    context.register(AppConfig.class);
    servletContext.addListener(new ContextLoaderListener(context));

    ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcher", new DispatcherServlet(context));
    dispatcher.addMapping("/");
  }
}
