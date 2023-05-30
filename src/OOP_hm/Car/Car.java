package OOP_hm.Car;

public class Car {

    String carName;
    String manufacturerName;
    int yearOfCar;
    double engineCapacity;

    public Car(String carName, String manufacturerName, int yearOfCar, double engineCapacity) {
        this.carName = carName;
        this.manufacturerName = manufacturerName;
        this.yearOfCar = yearOfCar;
        this.engineCapacity = engineCapacity;
    }

    public Car() {
    }


    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public int getYearOfCar() {
        return yearOfCar;
    }

    public void setYearOfCar(int yearOfCar) {
        this.yearOfCar = yearOfCar;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public void showInfo(Car car) {
        System.out.println(car.carName + "\n" + car.manufacturerName + "\n" + car.yearOfCar + "\n" + car.engineCapacity);
    }

    public String showInfo() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", manufacturerName='" + manufacturerName + '\'' +
                ", yearOfCar=" + yearOfCar +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}
