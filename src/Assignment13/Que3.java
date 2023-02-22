package Assignment13;

public class Que3 {
    public static void main(String[] args){
        public static void main(String[] args){

        }
    }
}
/*Checked exceptions are exceptions that must be handled by the programmer.
This means that when a method throws a checked exception, the caller of that method must either handle the exception or declare that it can throw the exception itself.
Examples of checked exceptions in Java include IOException, SQLException, and ClassNotFoundException.
Unchecked exceptions are exceptions that do not need to be handled by the programmer.
If a method throws an unchecked exception, the caller is not required to handle the exception or declare that it can throw the exception.
Examples of unchecked exceptions in Java include NullPointerException, ArrayIndexOutOfBoundsException, and ArithmeticException.
The main difference between checked and unchecked exceptions is that the compiler enforces handling of checked exceptions, but not unchecked exceptions.
This means that if a method throws a checked exception, the compiler will generate an error if the exception is not handled or declared. On the other hand, if a method throws an unchecked exception,
the compiler does not require the exception to be handled or declared.
In general, checked exceptions are used for situations where it is reasonable to expect the exception to occur and for which the caller should take some action.
For example, if a method reads from a file, it might throw an IOException if the file cannot be found or opened. In this case, it makes sense to require the caller to handle the exception or declare that it can throw the exception itself.
Unchecked exceptions, on the other hand, are used for situations that indicate a programming error or a situation that is unlikely to occur. For example, if a method tries to access an array element that is out of bounds,
it might throw an ArrayIndexOutOfBoundsException. In this case, it does not make sense to require the caller to handle the exception, since it is a programming error that should be fixed by the programmer.*/