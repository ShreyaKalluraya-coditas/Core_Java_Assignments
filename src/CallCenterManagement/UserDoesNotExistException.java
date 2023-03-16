package CallCenterManagement;

public class UserDoesNotExistException extends Exception{
    UserDoesNotExistException(String s){
        System.out.println("Enter the valid phone number"+s);
    }
}
