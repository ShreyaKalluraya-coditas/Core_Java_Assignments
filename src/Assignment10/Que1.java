package Assignment10;
//In Overloading we can change the return type.
class Shape{
    public int calculateArea(int radius) {

        int area = 3*radius;
        return area;
    }

    public int calculateArea(int radius,int r,double r1) {

        int area = 3*radius;
        return area;
    }
    public float calculateArea(int length, int height,int sides) {


        float area = 2*(length*height*sides);
        return area;
    }
    public int calculateArea(int length,int breadth) {

        int area = length*breadth;
        return area;
    }



}


public class Que1 {
    public static void main(String[] args){
      Shape s = new Shape();
      System.out.println(s.calculateArea(3));
      System.out.println(s.calculateArea(23,45));
      System.out.println(s.calculateArea(2,5,8));



    }
}
