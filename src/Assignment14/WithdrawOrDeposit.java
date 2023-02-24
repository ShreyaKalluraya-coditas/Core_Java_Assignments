package Assignment14;

public class WithdrawOrDeposit {
    public void Deposit(int money)  {
        if(money==0 || money<0) {
            try {
                throw new InvalidAmountException("Deposit money in positive number");
            } catch (InvalidAmountException e) {
                // throw new RuntimeException(e);
            }
        }

    }
    public void Withdraw(int money,int balance){
        try{
            if(money==0 || money<0) {
                throw new InvalidAmountException("Withdraw money in positive number");
            }
            if(money>balance) {
                throw new InsufficientBalanceException(" So you cannot withdraw your money");
            }


            // throw new RuntimeException(e);
        }
        catch(InsufficientBalanceException e) {


        }
        catch(InvalidAmountException e) {

        }


    }

}
