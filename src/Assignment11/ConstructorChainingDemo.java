package Assignment11;

class Parent{
    String firstName,lastName;
    int age;
    Parent(String firstName,String lastName,int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        System.out.println(firstName+" "+lastName+" "+age);
    }

    Parent(String firstName,int age){
        this(firstName,null,age);
        System.out.println(firstName+" "+age);
    }
}

class Child extends Parent{
    String hobby;
    Child(String firstName, String lastName, int age,String hobby) {
        super(firstName, lastName, age);
        this.hobby = hobby;
        System.out.println(firstName+" "+lastName+" "+age+" " +hobby);
    }
}
public class ConstructorChainingDemo {
    public static void main(String[] args){
        Child c = new Child("Shreya","Kalluraya",21,"Dance");
        Parent p = new Parent("Latha",45);
    }
}
