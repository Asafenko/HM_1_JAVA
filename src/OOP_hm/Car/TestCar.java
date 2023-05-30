package OOP_hm.Car;

public class TestCar {
    public static void main(String[] args) {

        Car car1 = new Car("car","engineCar",2016,2.4);
        car1.setCarName("e60");
        car1.setManufacturerName("BMW");
        car1.setYearOfCar(2014);
        car1.setEngineCapacity(4.4);

        System.out.println(car1.showInfo());


        Car car2 = new Car("car","engineCar",2016,2.4);
        car2.showInfo(car2);
    }
}
