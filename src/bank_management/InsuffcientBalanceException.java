package bank_management;

public class InsuffcientBalanceException extends Exception{
    InsuffcientBalanceException(String s){
        System.out.println("Your balance in negative "+s);
    }
}
