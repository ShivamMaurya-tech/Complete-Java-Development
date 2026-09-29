package com.example.jdbc;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final String URL = "jdbc:h2:mem:school;DB_CLOSE_DELAY=-1";
    private static final String USER = "sa";
    private static final String PASSWORD = "";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            createTable(connection);

            connection.setAutoCommit(false);
            try {
                insertStudent(connection, "Aarav", "aarav@example.com", new BigDecimal("88.50"));
                insertStudent(connection, "Meera", "meera@example.com", new BigDecimal("94.00"));
                insertStudent(connection, "Kabir", "kabir@example.com", new BigDecimal("79.25"));
                connection.commit();
            } catch (SQLException exception) {
                connection.rollback();
                throw exception;
            } finally {
                connection.setAutoCommit(true);
            }

            System.out.println("All students after insert:");
            printStudents(findAllStudents(connection));

            updateStudentGrade(connection, "meera@example.com", new BigDecimal("96.50"));
            System.out.println("\nStudents with a grade of at least 90:");
            printStudents(findStudentsWithMinimumGrade(connection, new BigDecimal("90.00")));

            deleteStudent(connection, "kabir@example.com");
            System.out.println("\nAll students after update and delete:");
            printStudents(findAllStudents(connection));
        } catch (SQLException exception) {
            System.err.println("Database operation failed: " + exception.getMessage());
            exception.printStackTrace();
        }
    }

    private static void createTable(Connection connection) throws SQLException {
        String sql = """
                CREATE TABLE students (
                    id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
                    name VARCHAR(100) NOT NULL,
                    email VARCHAR(255) NOT NULL UNIQUE,
                    grade DECIMAL(5, 2) NOT NULL CHECK (grade BETWEEN 0 AND 100)
                )
                """;

        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(sql);
        }
    }

    private static void insertStudent(Connection connection, String name, String email, BigDecimal grade)
            throws SQLException {
        String sql = "INSERT INTO students (name, email, grade) VALUES (?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, name);
            statement.setString(2, email);
            statement.setBigDecimal(3, grade);
            statement.executeUpdate();
        }
    }

    private static List<Student> findAllStudents(Connection connection) throws SQLException {
        String sql = "SELECT id, name, email, grade FROM students ORDER BY id";
        List<Student> students = new ArrayList<>();

        try (PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                students.add(readStudent(resultSet));
            }
        }
        return students;
    }

    private static List<Student> findStudentsWithMinimumGrade(Connection connection, BigDecimal minimumGrade)
            throws SQLException {
        String sql = "SELECT id, name, email, grade FROM students WHERE grade >= ? ORDER BY grade DESC";
        List<Student> students = new ArrayList<>();

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setBigDecimal(1, minimumGrade);
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    students.add(readStudent(resultSet));
                }
            }
        }
        return students;
    }

    private static void updateStudentGrade(Connection connection, String email, BigDecimal newGrade)
            throws SQLException {
        String sql = "UPDATE students SET grade = ? WHERE email = ?";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setBigDecimal(1, newGrade);
            statement.setString(2, email);
            statement.executeUpdate();
        }
    }

    private static void deleteStudent(Connection connection, String email) throws SQLException {
        String sql = "DELETE FROM students WHERE email = ?";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, email);
            statement.executeUpdate();
        }
    }

    private static Student readStudent(ResultSet resultSet) throws SQLException {
        return new Student(
                resultSet.getLong("id"),
                resultSet.getString("name"),
                resultSet.getString("email"),
                resultSet.getBigDecimal("grade"));
    }

    private static void printStudents(List<Student> students) {
        for (Student student : students) {
            System.out.printf("%d | %-10s | %-25s | %s%n",
                    student.id(), student.name(), student.email(), student.grade());
        }
    }

    private record Student(long id, String name, String email, BigDecimal grade) {
    }
}