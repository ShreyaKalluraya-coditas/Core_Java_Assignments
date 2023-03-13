package studentManagement;

public class StudentNotExistException extends RuntimeException{
    StudentNotExistException(String s){
        System.out.println("The student doesn't exist "+s);
    }
}
