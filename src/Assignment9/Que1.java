package Assignment9;

abstract class Vehicle{
    abstract public void engine();
}

class Car extends Vehicle{

    public void engine(){
        System.out.println("Car has good engine");
    }
}

class Truck extends Vehicle {

    public void engine() {
        System.out.println("Truck has good engine");
    }
}

public class Que1 {
    public static void main(String[] args){
     Car c = new Car();
     c.engine();
     Truck t = new Truck();
     t.engine();
    }
}
