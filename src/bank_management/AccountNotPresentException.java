package bank_management;

public class AccountNotPresentException extends Exception{
    AccountNotPresentException(String s){
        System.out.println("You dont have an account"+s);
    }
}
