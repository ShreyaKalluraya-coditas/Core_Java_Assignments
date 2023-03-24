package assignment23EmployeePrepared;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Records r = new Records();
        while(true){

            System.out.println("Press 0 to exit");
            System.out.println("Press 1 to Add 10 records");
            System.out.println("Press 2 to show all records");
            System.out.println("Press 3 to alter table and add city");
            System.out.println("Press 4 to fetch all those employee who are from pune and salary>20000");
            System.out.println("Press 5 to update salary by 1000 of employee whose experience is more than 3 years");
            System.out.println("Press 6 to delete the employee who left the organization");


            int choice = sc.nextInt();
            switch(choice){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    r.addRecord();
                    break;
                case 2:
                    r.show();
                    break;
                case 3:
                    r.alter();
                    break;
                case 4:
                    r.query1();
                    break;
                case 5:
                    r.query2();
                    break;
                case 6:
                    r.query3();
                    break;
                default:
                    System.out.println("Enter the right choice");

            }

        }

    }
}





//Press 0 to exit
//        Press 1 to Add 10 records
//        Press 2 to show all records
//        Press 3 to alter table and add city
//        Press 4 to fetch all those employee who are from pune and salary>20000
//        Press 5 to update salary by 1000 of employee whose experience is more than 3 years
//        Press 6 to delete the employee who left the organization
//        1
//        Enter number of data you want to enter
//        4
//        Enter Id
//        1
//        Enter Name
//        Shreya
//        Enter Designation
//        SoftEng
//        Enter Date of Joining
//        2007-09-12
//        Enter Experience
//        5
//        Enter Salary
//        30000
//        Enter status
//        working
//        Enter Id
//        2
//        Enter Name
//        Krati
//        Enter Designation
//        SoftEng
//        Enter Date of Joining
//        2006-06-06
//        Enter Experience
//        4
//        Enter Salary
//        500000
//        Enter status
//        working
//        Enter Id
//        3
//        Enter Name
//        Mrunmai
//        Enter Designation
//        TechLead
//        Enter Date of Joining
//        2008-08-08
//        Enter Experience
//        2
//        Enter Salary
//        10000
//        Enter status
//        Working
//        Enter Id
//        4
//        Enter Name
//        Yash
//        Enter Designation
//        TechLead
//        Enter Date of Joining
//        2008-07-07
//        Enter Experience
//        9
//        Enter Salary
//        5000000
//        Enter status
//        working
//        Data has been inserted
//        Press 0 to exit
//        Press 1 to Add 10 records
//        Press 2 to show all records
//        Press 3 to alter table and add city
//        Press 4 to fetch all those employee who are from pune and salary>20000
//        Press 5 to update salary by 1000 of employee whose experience is more than 3 years
//        Press 6 to delete the employee who left the organization
//        3
//        The table has been altered
//        Press 0 to exit
//        Press 1 to Add 10 records
//        Press 2 to show all records
//        Press 3 to alter table and add city
//        Press 4 to fetch all those employee who are from pune and salary>20000
//        Press 5 to update salary by 1000 of employee whose experience is more than 3 years
//        Press 6 to delete the employee who left the organization
//        2
//        1 Shreya SoftEng 2007-09-12 5 30000 working Pune
//        2 Krati SoftEng 2006-06-06 4 500000 working Pune
//        3 Mrunmai TechLead 2008-08-08 2 10000 Working Pune
//        4 Yash TechLead 2008-07-07 9 5000000 working Pune
//        Press 0 to exit
//        Press 1 to Add 10 records
//        Press 2 to show all records
//        Press 3 to alter table and add city
//        Press 4 to fetch all those employee who are from pune and salary>20000
//        Press 5 to update salary by 1000 of employee whose experience is more than 3 years
//        Press 6 to delete the employee who left the organization
//        4
//        1 Shreya SoftEng 2007-09-12 5 30000 working Pune
//        2 Krati SoftEng 2006-06-06 4 500000 working Pune
//        4 Yash TechLead 2008-07-07 9 5000000 working Pune
//        Press 0 to exit
//        Press 1 to Add 10 records
//        Press 2 to show all records
//        Press 3 to alter table and add city
//        Press 4 to fetch all those employee who are from pune and salary>20000
//        Press 5 to update salary by 1000 of employee whose experience is more than 3 years
//        Press 6 to delete the employee who left the organization
//        5
//        Updated
//        Press 0 to exit
//        Press 1 to Add 10 records
//        Press 2 to show all records
//        Press 3 to alter table and add city
//        Press 4 to fetch all those employee who are from pune and salary>20000
//        Press 5 to update salary by 1000 of employee whose experience is more than 3 years
//        Press 6 to delete the employee who left the organization
//        2
//        1 Shreya SoftEng 2007-09-12 5 31000 working Pune
//        2 Krati SoftEng 2006-06-06 4 501000 working Pune
//        3 Mrunmai TechLead 2008-08-08 2 10000 Working Pune
//        4 Yash TechLead 2008-07-07 9 5001000 working Pune
//        Press 0 to exit
//        Press 1 to Add 10 records
//        Press 2 to show all records
//        Press 3 to alter table and add city
//        Press 4 to fetch all those employee who are from pune and salary>20000
//        Press 5 to update salary by 1000 of employee whose experience is more than 3 years
//        Press 6 to delete the employee who left the organization
//        6
//        Enter the id
//        3
//        Delete
//        Press 0 to exit
//        Press 1 to Add 10 records
//        Press 2 to show all records
//        Press 3 to alter table and add city
//        Press 4 to fetch all those employee who are from pune and salary>20000
//        Press 5 to update salary by 1000 of employee whose experience is more than 3 years
//        Press 6 to delete the employee who left the organization
//        2
//        1 Shreya SoftEng 2007-09-12 5 31000 working Pune
//        2 Krati SoftEng 2006-06-06 4 501000 working Pune
//        4 Yash TechLead 2008-07-07 9 5001000 working Pune
//        Press 0 to exit
//        Press 1 to Add 10 records
//        Press 2 to show all records
//        Press 3 to alter table and add city
//        Press 4 to fetch all those employee who are from pune and salary>20000
//        Press 5 to update salary by 1000 of employee whose experience is more than 3 years
//        Press 6 to delete the employee who left the organization
//        0
//
//        Process finished with exit code 0
