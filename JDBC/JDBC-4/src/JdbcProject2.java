import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JdbcProject2{
    public static void main(String[] args) throws Exception {
        // Load the driver
        try {
           Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            System.out.println("Driver class not found");
            e.printStackTrace();
            return;
        }

        // Establish the connection
        String url = "jdbc:mysql://localhost:3306/JdbcLearning";
        String username = "root";
        String password = "979342@shivam";

        Connection connect = DriverManager.getConnection(url, username, password);

        // SQL query with placeholders
        String sql = "INSERT INTO student (id, age, sname, scity) VALUES (?, ?, ?, ?)";

        PreparedStatement pStatement = connect.prepareStatement(sql);

       

// enter the data by manually

System.out.println("Enter the following details to be stored in db");
Scanner sc=new Scanner(System.in);
System.out.println("Please enter the id ");
Integer id=sc.nextInt();

System.out.println("Please enter the age");
Integer sage=sc.nextInt();

System.out.println("Please enter the name ");
String  sname=sc.next();

System.out.println("Please enter the city");
String scity=sc.next();

 // // Set values for placeholders
        pStatement.setInt(1, id);              // id
        pStatement.setInt(2, sage);             // age
        pStatement.setString(3, sname);    // sname
        pStatement.setString(4, scity);   // scity


        // Execute the query
        int rows = pStatement.executeUpdate();

        if (rows > 0) {
            System.out.println("Data Inserted Successfully");
        } else {
            System.out.println("Unable to insert the data");
        }

        // Close connection
        connect.close();

        sc.close();
    }
}
