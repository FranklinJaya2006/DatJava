package fij;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.example.Student;

public class Demo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/tess";
        String user = "root";
        String password = "";
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection successful: " + url);

            // Create SQL query using prepared statement with parameters
            String query = "INSERT INTO students(name, age, major) VALUES (?, ?, ?)";
            preparedStatement = connection.prepareStatement(query);

            // Create and insert the first student
            Student student1 = new Student("Ganyu", 3, "IMT");
            preparedStatement.setString(1, student1.getName());
            preparedStatement.setInt(2, student1.getAge());
            preparedStatement.setString(3, student1.getMajor());
            preparedStatement.executeUpdate();
            System.out.println("Data inserted successfully for student 1!");

            // Create and insert the second student
            Student student2 = new Student("Fij", 18, "Istri Guah");
            preparedStatement.setString(1, student2.getName());
            preparedStatement.setInt(2, student2.getAge());
            preparedStatement.setString(3, student2.getMajor());
            preparedStatement.executeUpdate();
            System.out.println("Data inserted successfully for student 2!");

        } catch (ClassNotFoundException e) {
            e.printStackTrace(); // Driver class not found
        } catch (SQLException e) {
            e.printStackTrace(); // SQL Exception (e.g., connection error)
        } finally {
            // Close the prepared statement and connection
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
