package studentManagement;

public class DuplicateStudentException extends RuntimeException{
    DuplicateStudentException(String s){
        System.out.println("You are not allowed to enter details as "+s);
    }
}
