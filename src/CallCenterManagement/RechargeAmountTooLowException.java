package CallCenterManagement;

public class RechargeAmountTooLowException extends Exception{
    RechargeAmountTooLowException(String s){
        System.out.println("Amount should be greater than 0"+s);
    }
}
