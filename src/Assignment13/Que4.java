package Assignment13;
class Animal {
    String color;
    Animal(String color){
        this.color = color;
    }
    void show(String name) {
        System.out.println(name + " is of " + color + " Color");
    }
}
class Dog extends Animal{
    Dog(String color) {
        super(color);
    }
}
public class Que4 {
    public static void main(String[] args){
        Dog d = new Dog("Brown");
        Animal a = new Animal("Black");
        a = d;   //This is possible
        a.show("Dog");

        Animal a1 = new Animal("Black");
        try {
            Dog d1 = (Dog) a1;
            d1.show("Cat");
        }catch (ClassCastException ce){
            System.out.println(ce);
        }
        finally {
            System.out.println("you cannot typecast the object of parent class to child");
        }


    }
}
