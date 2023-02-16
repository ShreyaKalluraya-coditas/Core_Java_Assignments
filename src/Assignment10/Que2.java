package Assignment10;
class ShapeOverrideDemo{

  public void Area(int length,int breadth){
      System.out.println("Shape");
  }

}

class Circle extends ShapeOverrideDemo{

    public void Area(int length,int breadth){
        System.out.println("Circle");
    }

}

class Triangle extends ShapeOverrideDemo{

    public void Area(int length,int breadth){
        System.out.println("Triangle");
    }

}






public class Que2 {
 public static void main(String[] args){;
   Triangle t = new Triangle();
   t.Area(2,5);

 }



}
