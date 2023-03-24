package Assignment23Student;

import assignment23EmployeePrepared.Records;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        records r = new records();

        while(true){

            System.out.println("Press 0 to exit");
            System.out.println("Press 1 to alter table and add Gender column in it");
            System.out.println("Press 2 to fetch those records who are in third year and having percentage greter than 70");
            System.out.println("Press 3 to fetch those record whose id is in range of 1 to 10");
            System.out.println("Press 4 to insert record ,update student and remove");

            int choice = sc.nextInt();
            switch(choice){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                     r.alter();
                    break;
                case 2:
                    r.fetch();
                    break;
                case 3:
                      r.details();
                    break;
                case 4:
                    r.perform();
                    break;

                default:
                    System.out.println("Enter the right choice");

            }

        }

    }





}
