package studentManagement;

public class MarksNotInRangeException extends RuntimeException{
    MarksNotInRangeException(String s){
        System.out.println("Enter your marks between 1 to 100 only "+s);


    }
}
