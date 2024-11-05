
package project;
import java.sql.*;
/**
 *
 * @author Dell
 */
public class ConnectionProvider {
    public static Connection getCon(){
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gms","root","724927@Abhi");
           return con;
       }catch(Exception e){
           
          return null; 
       } 
    }
}
