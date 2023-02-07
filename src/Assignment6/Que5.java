package Assignment6;
import java.util.*;
public class Que5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number::");
        int number1= sc.nextInt();
        System.out.print("Enter second number::");
        int number2= sc.nextInt();
        if(number1>number2)
            System.out.println("The gretaer number is number1::"+number1);
        else
            System.out.println("The gretaer number is number2::"+number2);
    }
}
