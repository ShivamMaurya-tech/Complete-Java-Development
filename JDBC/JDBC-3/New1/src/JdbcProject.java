
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class JdbcProject {
    public static void main(String[] args) throws Exception {
    //load the driver class 
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
    } catch (ClassNotFoundException e) {
        System.out.println("MySQL JDBC Driver not found.");
        e.printStackTrace();
        return;
    }
    

    //establish the connection
    String url="jdbc:mysql://localhost:3306/shivam";
    String username="root";
    String password="979342@shivam";
    Connection con=DriverManager.getConnection(url,username,password);


    //creating statement
    Statement stmt=con.createStatement();

    // clear previous data so the program can run again without duplicate ID errors
    stmt.executeUpdate("DELETE FROM student");

    // execute the query
    String sql1="insert into student values(1,'Shivam',22),(2,'Sachin',23),(3,'Rohit',24),(4,'Rahul',25),(5,'Virat',26)";
  int rs1=stmt.executeUpdate(sql1);
//     String sql="UPDATE student set name='Rajan' where id =4";
//     int rs2=stmt.executeUpdate(sql);
String sql2="SELECT * FROM student";
ResultSet rs2=stmt.executeQuery(sql2);

    // if(rs2>0){
    //     System.out.println("Data updated successfully");


    // }
    // else{
    //     System.out.println("Data not updated");
    // }



    while(rs2.next()){
        int id=rs2.getInt("id");
        String name=rs2.getString("name");
        int age=rs2.getInt("age");
        System.out.println(id+" "+name+" "+age);
    }

}

}
