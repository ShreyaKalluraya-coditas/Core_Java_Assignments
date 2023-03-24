package assignment23EmployeePrepared;
import java.sql.*;
import java.util.Scanner;

public class Records {
    Connection con = JDBCConnection.Connection();
    Scanner sc = new Scanner(System.in);

    public void addRecord(){

        try {
            System.out.println("Enter number of data you want to enter");
            int n = sc.nextInt();
            for(int i=0;i<n;i++) {
                System.out.println("Enter Id");
                int id = sc.nextInt();
                System.out.println("Enter Name");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.println("Enter Designation");
                String designation = sc.nextLine();
                System.out.println("Enter Date of Joining");
                String doj = sc.nextLine();
                System.out.println("Enter Experience");
                int exp = sc.nextInt();
                System.out.println("Enter Salary");
                int salary = sc.nextInt();
                System.out.println("Enter status");
                sc.nextLine();
                String status = sc.nextLine();

                PreparedStatement ps = con.prepareStatement("insert into employee(id,name,designation,doj,exp,salary,status) values(?,?,?,?,?,?,?)");
                ps.setInt(1,id);
                ps.setString(2,name);
                ps.setString(3,designation);
                ps.setString(4,doj);
                ps.setInt(5,exp);
                ps.setInt(6,salary);
                ps.setString(7,status);
                ps.executeUpdate();


            }
            System.out.println("Data has been inserted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }


    public void alter(){
        try {
            PreparedStatement pst = con.prepareStatement("alter table Employee add city varchar(25) default 'Pune' ");
            pst.executeUpdate();
            System.out.println("The table has been altered");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void show(){
        try {

                  PreparedStatement ps =  con.prepareStatement("select * from Employee");
                  ResultSet rs = ps.executeQuery();
                  while(rs.next()){
                      System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5)+" "+rs.getInt(6)+" "+rs.getString(7)+" "+rs.getString(8));
                  }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public void query1(){
        try {
            PreparedStatement ps = con.prepareStatement("select * from Employee where city='Pune' and salary>20000");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5)+" "+rs.getInt(6)+" "+rs.getString(7)+" "+rs.getString(8));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void query2(){
        try {
            PreparedStatement ps = con.prepareStatement("update Employee set salary = salary+1000 where exp>3");
            ps.executeUpdate();
            System.out.println("Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void query3(){
        try {
            System.out.println("Enter the id");
            int id = sc.nextInt();
            PreparedStatement ps = con.prepareStatement("delete from Employee where id = ?");
            ps.setInt(1,id);
            ps.executeUpdate();
            System.out.println("Delete");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
