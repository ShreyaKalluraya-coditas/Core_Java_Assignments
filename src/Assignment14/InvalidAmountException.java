package Assignment14;

public class InvalidAmountException extends Exception{
    InvalidAmountException(){
        System.out.println("Default");
    }
    InvalidAmountException(String s){
        System.out.println("Invalid Amount "+s);
    }

}
