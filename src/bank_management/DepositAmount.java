package bank_management;

import java.util.Scanner;

public class DepositAmount extends BankAccount{
    Scanner sc = new Scanner(System.in);
    public void deposit(){
        System.out.println("Enter your Account Number");
        long acNo = sc.nextLong();
        for(BankAccount b2: ba){
            if(acNo == b2.accountNumber){
                System.out.println("Enter the amount you want to deposit");
                int amount = sc.nextInt();
                b2.balance = b2.balance+amount;
                System.out.println("Your current balance is "+b2.balance);
            }
            else{
                try {
                    throw new AccountNotPresentException("You need to create an account ");
                } catch (AccountNotPresentException e) {
                    //throw new RuntimeException(e);
                }
            }

        }
    }

}
