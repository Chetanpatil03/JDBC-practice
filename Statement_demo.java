import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class Statement_demo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String user = "root";
        String pass = "root";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully......");
        }
        catch(ClassNotFoundException ex){
            ex.printStackTrace();
        }

        try{
            Connection conn = DriverManager.getConnection(url, user, pass);
            System.out.println("Connection established");
        }

    }
}
