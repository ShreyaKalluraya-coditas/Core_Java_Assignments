package studentManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
public class mainMethod {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        List<Student> student = new ArrayList<>();
        List<StudentMarks> studentMarks = new ArrayList<>();
        boolean flag = true;
        boolean check = false;
       // boolean enter = false;
        while(flag){
            System.out.println("Enter you choice");
            System.out.println("Press 0 for exit");
            System.out.println("Press 1 to add a student ");
            System.out.println("Press 2 to display students ");
            System.out.println("Press 3 to add student marks ");
            System.out.println("Press 4 to display student result ");

            System.out.println("Enter your choice");
            int choice = s.nextInt();
            switch(choice){

                case 0: flag=false;

                    break;
                case 1:
                        System.out.println("Enter the roll no");
                        int r = s.nextInt();
                        for(Student st : student ){
                            if(st.rollNo == r){
                                try {
                                    throw new DuplicateStudentException("because that roll no already existed");
                                }catch(Exception e){

                                }
                            }
                        }

                        System.out.println("Enter the name ");
                        s.nextLine();
                        String n = s.nextLine();
                        System.out.println("Enter the division");
                        String d = s.nextLine();
                        System.out.println("Enter the age");
                        int a = s.nextInt();
                        System.out.println("Enter the adress");
                        s.nextLine();
                        String ad = s.nextLine();
                        student.add(new Student(r,n,d,a,ad));
                        //enter = true;
                    break;

                case 2:
                    for (int i = 0; i < student.size();i++)
                    {
                        System.out.println(student.get(i));
                    }
                    break;
                case 3:

                        System.out.println("Enter the Marksheet ID");
                        int id = s.nextInt();
                        System.out.println("Enter the Roll No");
                        int roll = s.nextInt();
                    for (Student st : student) {
                            if (st.rollNo == roll) {
                                check = true;

                            }

                            }
                            while(check) {
                                System.out.println("Enter the marks of the subject");
                                int[] array = new int[5];
                                for (int i = 0; i < 5; i++) {
                                    array[i] = s.nextInt();
                                }
                                studentMarks.add(new StudentMarks(id, roll, array));
                                for (int i = 0; i < studentMarks.size(); i++) {
                                    System.out.println(studentMarks.get(i));
                                }
                                check = false;
                            }
                            if(check==false){
                                try{
                                    throw new StudentNotExistException("Enter student detail first");
                                }catch(Exception e){

                                }


                        }

                    break;
                case 4:
                    System.out.println("Enter the roll no of student whose marksheet you want");
                    int num = s.nextInt();
                    for(StudentMarks m : studentMarks){
                        if(m.rollNo==num){
                            System.out.println("Marksheet of roll number "+num+" is:" );
                            //System.out.println(studentMarks.get(num-1));
                            for(Student st: student){
                                if(st.rollNo==num){
                                    System.out.println(st+" "+m);
                                }
                            }
                            break;


                        }

                    }
                    break;

                default:
                    System.out.println("No such option is present");

            }

        }
    }
}
