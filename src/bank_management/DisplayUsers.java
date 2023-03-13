package bank_management;

public class DisplayUsers extends BankAccount{
    public void display(){
        for(BankAccount b1 : ba){
            if(b1.cname!=null) {
                System.out.println("BankAccount " +
                        "name='" + b1.name + '\'' +
                        ", address='" + b1.address + '\'' +
                        ", accountType='" + b1.accountType + '\'' +
                        ", mobileNo=" + b1.mobileNo +
                        ", accountNumber=" + b1.accountNumber +
                        ", balance=" + b1.balance +
                        ", Company name=" + b1.cname);
            }else{
                System.out.println("BankAccount " +
                        "name='" + b1.name + '\'' +
                        ", address='" + b1.address + '\'' +
                        ", accountType='" + b1.accountType + '\'' +
                        ", mobileNo=" + b1.mobileNo +
                        ", accountNumber=" + b1.accountNumber +
                        ", balance=" + b1.balance);

            }

        }
    }

}
