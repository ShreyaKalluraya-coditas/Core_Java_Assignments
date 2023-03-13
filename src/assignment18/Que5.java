package assignment18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee> {
    int id;
    String name;
    float salary;
    Employee(){

    }

    Employee(int id,String name,float salary){

        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
       return (int)(this.salary-o.salary);
    }

}
 class SortByName implements Comparator<Employee> {

     @Override
     public int compare(Employee o1, Employee o2) {
         return o1.name.compareTo(o2.name);
     }
 }






public class Que5 extends Employee {
    public static void main(String[] args){


        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(4,"Shreya",16000));
        emp.add(new Employee(2,"Krati",14000));
        emp.add(new Employee(3,"Yash",20000));
        emp.add(new Employee(1,"Tanmay",18000));

        Collections.sort(emp,new SortByName());
        for(int i=0;i<emp.size();i++)
        {
            System.out.println(emp.get(i));
        }

        Collections.sort(emp);
        for(Employee e1 : emp){
            if(e1.salary>=15000) {
                System.out.println("id " + e1.id + "  Salary " + e1.salary + "  Name " + e1.name);
            }
        }


    }
}
