
package travel.tourism;
import java.sql.*;

public class Conn {
    Connection c;
    Statement s;
    Conn(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql:///travelmanagementsystem","root","");
            s=c.createStatement(); 
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
