package Assignment23Student;

import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class records {
    Scanner sc = new Scanner(System.in);
    Connection con = JDBCConnection.Connection();

    public void alter(){
        try {
            PreparedStatement ps = con.prepareStatement("alter table student add gender varchar(3)");
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void fetch(){
        try {
            PreparedStatement ps = con.prepareStatement("select * from student where year =3 and percentage > 70");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4)+" "+rs.getString(5)+" "+rs.getString(6));

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }


    public void perform(){
        boolean flag = true;
        while(flag){
            System.out.println("1 to add data");
            System.out.println("2 to update data");
            System.out.println("3 to remove data");
            System.out.println("0 to exit ");
            int choice = sc.nextInt();
            switch(choice){
                case 0:
                    flag = false;
                    break;
                case 1:
                    try {
                        System.out.println("Enter number of data you want to enter");
                        int n = sc.nextInt();
                        for(int i=0;i<n;i++) {
                            System.out.println("Enter Id");
                            int id = sc.nextInt();
                            System.out.println("Enter Name");
                            sc.nextLine();
                            String name = sc.nextLine();
                            System.out.println("Enter year");
                            int year = sc.nextInt();
                            System.out.println("Enter percentage");
                            int percentage = sc.nextInt();
                            System.out.println("Enter city");
                            sc.nextLine();
                            String city = sc.nextLine();
                            System.out.println("Enter gender");
                            String gender = sc.nextLine();


                            PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?,?,?)");
                            ps.setInt(1,id);
                            ps.setString(2,name);
                            ps.setInt(3,year);
                            ps.setInt(4,percentage);
                            ps.setString(5,city);
                            ps.setString(6,gender);

                            ps.executeUpdate();


                        }
                        System.out.println("Data has been inserted");
                    } catch (SQLException e) {
                        throw new RuntimeException(e);
                    }

                    break;
                case 2:


                    try {
                        PreparedStatement preparedStatement = con.prepareStatement("UPDATE student SET name = CONCAT('Mr. ', name) WHERE GENDER = 'M';");
                        preparedStatement.executeUpdate();
                        PreparedStatement preparedStatement1 = con.prepareStatement("UPDATE student SET name = CONCAT('Ms. ', name) WHERE GENDER = 'F';");
                        preparedStatement1.executeUpdate();
                    } catch (SQLException e) {
                        throw new RuntimeException(e);
                    }

                    break;
                case 3:


                    try {
                        PreparedStatement preparedStatement = con.prepareStatement("delete from student where year=4");
                        preparedStatement.executeUpdate();
                    } catch (SQLException e) {
                        throw new RuntimeException(e);
                    }

                    break;

            }




        }




    }


    public void details(){
        try {
            PreparedStatement ps = con.prepareStatement("select id , name from student where id between 1 and 10");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
