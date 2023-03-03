package caffeManagement;

public class isInvalidException extends RuntimeException{
    isInvalidException(String s){
        System.out.println("Order atleast 1 coffee"+s);
    }
}
