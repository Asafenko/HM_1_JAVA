package SQL_hm;

import java.sql.*;

public class CarDatabaseApp {
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "org.postgresql.Driver";
    static final String DB_URL = "jdbc:postgresql://localhost:5432/your_database_name";

    // Database credentials
    static final String USER = "your_username";
    static final String PASS = "your_password";

    public static void main(String[] args) {
        Connection conn = null;
        try {
            // Register JDBC driver
            Class.forName(JDBC_DRIVER);

            // Connect to the database
            System.out.println("Connecting to the database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected to the database.");

            // Display all cars
            System.out.println("All cars:");
            displayAllCars(conn);

            // Display manufacturers and the count of cars for each manufacturer
            System.out.println("Manufacturers and car counts:");
            displayManufacturerCarCounts(conn);

            // Disconnect from the database
            conn.close();
            System.out.println("Disconnected from the database.");
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }

    public static void displayAllCars(Connection conn) throws SQLException {
        Statement stmt = conn.createStatement();
        String sql = "SELECT * FROM cars";
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            String manufacturer = rs.getString("manufacturer");
            String carName = rs.getString("car_name");
            double engineVolume = rs.getDouble("engine_volume");
            int year = rs.getInt("year");
            String color = rs.getString("color");
            String carType = rs.getString("car_type");

            System.out.println("Manufacturer: " + manufacturer);
            System.out.println("Car Name: " + carName);
            System.out.println("Engine Volume: " + engineVolume);
            System.out.println("Year: " + year);
            System.out.println("Color: " + color);
            System.out.println("Car Type: " + carType);
            System.out.println();
        }

        rs.close();
        stmt.close();
    }

    public static void displayManufacturerCarCounts(Connection conn) throws SQLException {
        Statement stmt = conn.createStatement();
        String sql = "SELECT manufacturer, COUNT(*) as car_count FROM cars GROUP BY manufacturer";
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            String manufacturer = rs.getString("manufacturer");
            int carCount = rs.getInt("car_count");

            System.out.println("Manufacturer: " + manufacturer);
            System.out.println("Car Count: " + carCount);
            System.out.println();
        }

        rs.close();
        stmt.close();
    }

}
