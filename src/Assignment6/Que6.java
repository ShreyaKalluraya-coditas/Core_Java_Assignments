package Assignment6;
import java.util.*;

public class Que6 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first person's age::");
        int person1= sc.nextInt();
        System.out.print("Enter second person's age::");
        int person2= sc.nextInt();
        System.out.print("Enter third person's age::");
        int person3= sc.nextInt();

        if(person1>person2 && person1>person3)
            System.out.println("Oldest is first person whose age is::"+person1);
        else if(person2>person1 && person2>person3)
            System.out.println("Oldest is second person whose age is::"+person2);
        else
            System.out.println("Oldest is third person whose age is::"+person3);

        if(person1<person2 && person1<person3)
            System.out.println("Youngest is first person whose age is::"+person1);
        else if(person2<person1 && person2<person3)
            System.out.println("Youngest is second person whose age is::"+person2);
        else
            System.out.println("Youngest is third person whose age is::"+person3);


    }
}
