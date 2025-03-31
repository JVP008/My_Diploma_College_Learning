import java.sql.*;

public class ResultSetNavigationExample {
    private static final String URL = "jdbc:mysql://localhost:3306/mydb"; // Database Name
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Jayesh@008";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             Statement statement = connection.createStatement(
                     ResultSet.TYPE_SCROLL_INSENSITIVE, // Allows navigation
                     ResultSet.CONCUR_READ_ONLY // Read-only mode
             );
             ResultSet resultSet = statement.executeQuery("SELECT ROLL, NAME FROM student")) {

            // 1️⃣ Move to First Row
            if (resultSet.first()) {
                System.out.println("First Record → Roll: " + resultSet.getInt("ROLL") + ", Name: " + resultSet.getString("NAME"));
            }

            // 2️⃣ Move to Last Row
            if (resultSet.last()) {
                System.out.println("Last Record → Roll: " + resultSet.getInt("ROLL") + ", Name: " + resultSet.getString("NAME"));
            }

            // 3️⃣ Move Before First and Iterate All Rows
            resultSet.beforeFirst();
            System.out.println("\nAll Records:");
            while (resultSet.next()) {
                System.out.println("Roll: " + resultSet.getInt("ROLL") + ", Name: " + resultSet.getString("NAME"));
            }

            // 4️⃣ Move to a Specific Row (Absolute Position)
            if (resultSet.absolute(2)) { // Moves to the 2nd row
                System.out.println("\nSecond Record → Roll: " + resultSet.getInt("ROLL") + ", Name: " + resultSet.getString("NAME"));
            }

            // 5️⃣ Move Relative to the Current Position
            if (resultSet.relative(-1)) { // Moves back one row
                System.out.println("Back One Row → Roll: " + resultSet.getInt("ROLL") + ", Name: " + resultSet.getString("NAME"));
            }

            // 6️⃣ Move After Last (No More Data)
            resultSet.afterLast();
            if (!resultSet.next()) {
                System.out.println("\nMoved after the last record. No more data.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
