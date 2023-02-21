package Assignment12;

class Employee{
    int id = 9;
    String name = "Krati";
    String address = "Indore";
    int salary = 10000;

    Employee(int id, String name , String address, int salary){
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }
}


public class Que9 {
    public static void main(String[] args){
        Employee employee = new Employee(1, "Shreya" , "Dewas", 500);
        System.out.println(employee.toString());
    }
}
