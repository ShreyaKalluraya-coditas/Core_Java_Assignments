package bank_management;

import java.util.Scanner;

public class BankManagement {
    public static void main(String[] args){

        BankAccount b1 = new BankAccount();
        DepositAmount da = new DepositAmount();
        WithdrawAmount wa = new WithdrawAmount();
        DisplayUsers d = new DisplayUsers();

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter your choice ");
            System.out.println("Press 1 to add a bank account : Current/Savings");
            System.out.println("Press 2 to deposit amount");
            System.out.println("Press 3 to withdraw amount");
            System.out.println("Press 4 to display all account details");
            System.out.println("Press 0 to exit");
            int choice = sc.nextInt();
            switch(choice){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    b1.display();
                    break;
                case 2:
                    da.deposit();
                    break;
                case 3:
                    wa.withdraw();
                    break;
                case 4:
                    d.display();
                    break;




            }



        }


    }
}
