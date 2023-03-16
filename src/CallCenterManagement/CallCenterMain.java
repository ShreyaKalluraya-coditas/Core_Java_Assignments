package CallCenterManagement;

import java.util.Scanner;

public class CallCenterMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NewConnection nc = new NewConnection();
        Prepaid p = new Prepaid();
        ViewUsers v = new ViewUsers();
        //nc.createTable();

       while(true){
           System.out.println("Enter your choice ");
           System.out.println("Press 0 for exit ");
           System.out.println("Press 1 for Prepaid User ");
           System.out.println("Press 2 for exit New Connection");
           System.out.println("Press 3 for exit View All Users");

           int choice = sc.nextInt();

           switch(choice){
               case 0:
                   System.exit(0);
                   break;
               case 1:
                   p.prepiads();
                   break;
               case 2:

                   nc.Display();
                   break;
               case 3:
                   v.display();
                   break;
               default:
                   System.out.println("Enter the valid response ");


           }
       }
    }
}
