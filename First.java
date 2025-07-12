import java.sql.Driver;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

class First {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String user = "root";
        String pass = "root";
        String sql = "select * from emp";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");

            Connection conn = DriverManager.getConnection(url, user, pass);
            System.out.println("Connection established");
            Statement statement = conn.createStatement();
            
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                System.out.println();
                System.out.println("********************************************");
                System.out.println("ID : "+resultSet.getInt("id"));
                System.out.println("Name : "+resultSet.getString("name"));
                System.out.println("Job title : "+resultSet.getString("job_title"));
                System.out.println("Salary : "+resultSet.getDouble("salary"));
        
            }

            // Close resources
            resultSet.close();
            statement.close();
            conn.close();
            
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }
}