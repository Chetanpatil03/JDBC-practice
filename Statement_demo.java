import java.sql.Statement;
import java.sql.Connection;
// import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;


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

            staticWay(conn);
            




        }
        catch(SQLException e){
            e.printStackTrace();
        }

    }

    public static void staticWay(Connection conn){
        String sql = "insert into student(name,age,course) values('John Doe', 20, 'Computer Science')";

        try{
            Statement statement = conn.createStatement();

            int count = statement.executeUpdate(sql);

            if (count > 0) {
                System.out.println("DATA INSERTED");
            }
            else{
                System.out.println("FAILED TO DATA INSERTED");
            }
            
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}
