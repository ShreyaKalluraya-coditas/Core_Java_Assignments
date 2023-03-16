package CallCenterManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.Scanner;

public class NewConnection {
    Scanner sc = new Scanner(System.in);
   public void createTable(){
       try {
           Class.forName("com.mysql.jdbc.Driver");

           Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/call_center","root","Star@123");

           Statement statement = connection.createStatement();

           String sql ="create table connection(id int primary key , name varchar(25) , email varchar(25)," +
                   "address varchar(25),aadhar varchar(25),simtype varchar(25),balance int default 0,validity int default 1,mobile int )";

           statement.executeUpdate(sql);
           System.out.println("Table created");



       } catch (ClassNotFoundException e) {
           throw new RuntimeException(e);
       } catch (SQLException e) {
           throw new RuntimeException(e);
       }

   }




    NewConnection(){

    }


    public void Display(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/call_center","root","Star@123");

            Statement statement = connection.createStatement();
            sc.nextLine();

            System.out.println("Enter your name");
            String name  = sc.nextLine();

            System.out.println("Enter your email");
            String email  = sc.nextLine();

            System.out.println("Enter your address");
            String address  = sc.nextLine();

            System.out.println("Enter your aadhar");
            String aadhar  = sc.nextLine();

            System.out.println("Enter your simtype");
            String simtype  = sc.nextLine();

            System.out.println("Enter your initial balance");
            int balance = sc.nextInt();

            Random random = new Random();
            int mobileNo = random.nextInt(900000000) + 1000000000;

            String sql = "insert into connection (name,email,address,aadhar,simtype,mobile) values('"+name+"','"+email+"','"+address+"','"+aadhar+"','"+simtype+"','"+mobileNo+"')";
            statement.executeUpdate(sql);

            System.out.println("Successfully inserted the data in the table");
            System.out.println("Your mobile number is "+mobileNo);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



    }

}

