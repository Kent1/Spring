package be.quentinloos.model;

public class Car {

  private String brand;
  private String model;
  private String version;
  private String plateNumber;

  public Car() {
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public String getPlateNumber() {
    return plateNumber;
  }

  public void setPlateNumber(String plateNumber) {
    this.plateNumber = plateNumber;
  }

  public String toString() {
    return String.format("%s %s %s with plate number %s", brand, model, version, plateNumber);
  }

}
