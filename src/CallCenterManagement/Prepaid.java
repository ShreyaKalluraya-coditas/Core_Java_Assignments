package CallCenterManagement;

import java.sql.*;
import java.util.Scanner;

public class Prepaid {
    Scanner sc = new Scanner(System.in);

    public void prepiads() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/call_center","root","Star@123");

            Statement statement = connection.createStatement();

            System.out.println("Enter your mobile number ");
            int num  = sc.nextInt();
            boolean flag = true;
            while (flag) {
                System.out.println("Enter your choice ");
                System.out.println("Press 0 for exit");
                System.out.println("Press 1 check balance");
                System.out.println("Press 2 for recharge");

                int ch = sc.nextInt();
                switch (ch) {
                    case 0:
                        flag = false;
                        break;
                    case 1:
                        String sql ="select * from connection where mobile ="+num+" ";
                        ResultSet rs = statement.executeQuery(sql);

                           if(rs.next()){
                               System.out.println(rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getInt(7)+" "+rs.getInt(8)+" "+rs.getInt(9));

                           }
                           else{
                               throw new UserDoesNotExistException("You are not registered");
                           }

                            break;
                    case 2:
                        String sqls ="select * from connection where mobile ="+num+" ";
                        ResultSet rset = statement.executeQuery(sqls);

                        if(rset.next()){
                            System.out.println("Enter the amount ");
                            int amt = sc.nextInt();
                            if(amt<=0){
                                throw new RechargeAmountTooLowException(" please do so");
                            }else {
                                int balan = rset.getInt(7);
                                balan = balan + amt;

                                String updsql = "update connection set balance = " + balan + " , validity = validity +1 where mobile = " + num + " ";
//                            PreparedStatement ps = connection.prepareStatement(updsql);
////                            ps.setInt(1,amt);
////                            ps.setInt(2,num);
//                            ps.executeUpdate();
                                statement.executeUpdate(updsql);
                                System.out.println("Done");
                            }
                        }
                        else{
                            throw new UserDoesNotExistException("You are not registered");
                        }
                        break;
                    default:
                        System.out.println("Enter the right choice ");

                }
            }
        } catch (ClassNotFoundException e) {
           // throw new RuntimeException(e);
        } catch (SQLException e) {
           // throw new RuntimeException(e);
        } catch (RechargeAmountTooLowException e) {
          //  throw new RuntimeException(e);
        } catch (UserDoesNotExistException e) {
          //  throw new RuntimeException(e);
        }


    }


}


