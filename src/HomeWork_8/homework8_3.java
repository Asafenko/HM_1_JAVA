package HomeWork_8;

import java.util.Arrays;
import java.util.List;

public class homework8_3 {
    public class Device {
        private String name;
        private int year;
        private double price;
        private String color;
        private String type;

        public Device(String name, int year, double price, String color, String type) {
            this.name = name;
            this.year = year;
            this.price = price;
            this.color = color;
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public int getYear() {
            return year;
        }

        public double getPrice() {
            return price;
        }

        public String getColor() {
            return color;
        }

        public String getType() {
            return type;
        }

        @Override
        public String toString() {
            return "Device{" +
                    "name='" + name + '\'' +
                    ", year=" + year +
                    ", price=" + price +
                    ", color='" + color + '\'' +
                    ", type='" + type + '\'' +
                    '}';
        }

        public void main(String[] args) {
            List<Device> devices = Arrays.asList(
                    new Device("Телефон", 2020, 1000.0, "Черный", "Мобильное устройство"),
                    new Device("Ноутбук", 2019, 2000.0, "Серебристый", "Портативный компьютер"),
                    new Device("Планшет", 2021, 800.0, "Черный", "Мобильное устройство"),
                    new Device("Телевизор", 2020, 1500.0, "Черный", "ТВ"),
                    new Device("Монитор", 2018, 500.0, "Черный", "Компьютерный периферийный устройство")
            );

            // 1. Показать все устройства
            System.out.println("Все устройства: ");
            devices.stream()
                    .forEach(System.out::println);

            // 2. Показать все устройства заданного цвета
            String colorFilter = "Черный";
            System.out.println("Устройства цвета \"" + colorFilter + "\": ");
            devices.stream()
                    .filter(device -> device.getColor().equalsIgnoreCase(colorFilter))
                    .forEach(System.out::println);

            // 3. Показать все устройства заданного года выпуска
            int yearFilter = 2020;
            System.out.println("Устройства выпущенные в " + yearFilter + " году: ");
            devices.stream()
                    .filter(device -> device.getYear() == yearFilter)
                    .forEach(System.out::println);

            // 4. Показать все устройства дороже заданной цены
            double priceFilter = 1000.0;
            System.out.println("Устройства с ценой выше " + priceFilter + ": ");
            devices.stream()
                    .filter(device -> device.getPrice() > priceFilter)
                    .forEach(System.out::println);

            // 5. Показать все устройства заданного типа
            String typeFilter = "Мобильное устройство";
            System.out.println("Устройства типа \"" + typeFilter + "\": ");
            devices.stream().filter(device -> device.getType().equalsIgnoreCase(typeFilter))
                    .forEach(System.out::println);

            // 6. Показать все устройства, чей год выпуска находится в указанном диапазоне
            int startYear = 2019;
            int endYear = 2021;
            System.out.println("Устройства выпущенные с " + startYear + " по " + endYear + ": ");
            devices.stream()
                    .filter(device -> device.getYear() >= startYear && device.getYear() <= endYear)
                    .forEach(System.out::println);
        }
    }
}
