
package newpackage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import javax.swing.JOptionPane;

public class DBConnection {
    
    
    private static final String URL = "jdbc:mysql://localhost:3306/student_information_system";
         
    private static final String user ="Joshu" ;
        private static final String  password = "8-7bT_@SRG0XRNEP";
  
    
    public static Connection getConnection(){
        Connection connection = null;
        
try { 
// Optional: Load the JDBC driver (not needed for newer versions, but good practice)
Class.forName("com.mysql.cj.jdbc.Driver");
// Establish the connection
 connection = DriverManager. getConnection (URL,user,password);
System.out.println ("Connection successful!");
}catch (SQLException e) {
System.out.println ("Error connecting to the database: " + e.getMessage());
}catch (ClassNotFoundException e) {
System.out.println ("MySQL JDBC Driver not found: " + e.getMessage());
}
return connection;
}
    public static void closeConnection(Connection connection){
        if (connection != null){
        try{
            connection.close();
            System.out.println("Connection closed");
}catch (SQLException e){
    System.out.println("Error, closing the connection:  "+ e.getMessage()) ;
}
        
        
    }
    }}

    
    
    
    
     

