package bank_management;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BankAccount {
 Scanner sc = new Scanner(System.in);
    BankAccount(){

    }
    String name,address,accountType,cname;
    long mobileNo;
    long accountNumber;
    int balance;


    BankAccount(String name,String address,long mobileNo,String accountType,long accountNumber,String cname){
        this.name=name;
        this.address=address;
        this.mobileNo=mobileNo;
        this.accountType=accountType;
        this.accountNumber=accountNumber;
        this.cname=cname;
        balance = 0;



    }



    public static ArrayList<BankAccount> ba = new ArrayList<>();

    @Override
    public String toString() {
        return "BankAccount{" +
                "sc=" + sc +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", accountType='" + accountType + '\'' +
                ", mobileNo=" + mobileNo +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                ", Company name =" + cname +
                '}';
    }

    public void display(){
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter your address");
        String address = sc.nextLine();
        System.out.println("Enter your mobile number");
        int mobile = sc.nextInt();
        System.out.println("Enter type of account You want Current or Savings");
        sc.nextLine();
        String accountType = sc.nextLine();
        String cname=null;
        if(accountType.equals("Current")){
            System.out.println("Enter name of your company");
            cname = sc.nextLine();
        }
        Random random = new Random();
        long accountNum = random.nextInt(900000000) + 100000000000l;
        ba.add(new BankAccount(name,address,mobile,accountType,accountNum,cname));




    }
}
