package Assignment13;
/* Assertions in Java are a way to ensure that certain conditions are met during runtime.
To use assertions in Java, you can use the assert keyword followed by a boolean expression.
An assertion is a statement that checks a boolean expression and throws an AssertionError if the expression is false.
It is often used for debugging and testing purposes.*/
public class Que1 {
    public static void main(String[] args){
        int x = 7;
        assert x == 20 : "x is 20";
        System.out.println("The end");
    }
}
