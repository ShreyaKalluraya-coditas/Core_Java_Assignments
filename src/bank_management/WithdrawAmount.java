package bank_management;

import java.util.Scanner;

public class WithdrawAmount extends BankAccount {
    Scanner sc = new Scanner(System.in);
    public void withdraw(){
        System.out.println("Enter your Account Number");
        long acNo = sc.nextLong();
        for(BankAccount b3: ba){
            if(acNo == b3.accountNumber){
                System.out.println("Enter the amount you want to withdraw");
                int amount = sc.nextInt();
                b3.balance = b3.balance-amount;
                if(b3.balance<0){
                    try {
                        throw new InsuffcientBalanceException("You cannot withdraw");
                    } catch (InsuffcientBalanceException e) {
                        // throw new RuntimeException(e);
                    }

                }else {
                    System.out.println("Your current balance is " + b3.balance);
                }

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
