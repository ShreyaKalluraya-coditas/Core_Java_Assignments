package Assignment14;

public class InsufficientBalanceException extends RuntimeException{
    InsufficientBalanceException(){
        System.out.println("Default");
    }
    InsufficientBalanceException(String s){
        System.out.println("Not sufficient balance "+s);
    }
}


