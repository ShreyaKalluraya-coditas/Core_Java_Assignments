package studentManagement;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    int rollNo,age;
    String name,division,address;
     Scanner s = new Scanner(System.in);
    public Student(int rolNo,String name,String division,int age,String address){
        this.address=address;
        this.division=division;
        this.age=age;
        this.name=name;
        this.rollNo=rolNo;

    }


    @Override
    public String toString() {
        return "Student" +
                "rollNo=" + rollNo +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", division='" + division + '\'' +
                ", address='" + address + '\'';
    }


}
