package Assignment11;
class Shape{
    int perimeter(int length,int breadth){
        return length+breadth;
    }
}
class Rectangle extends Shape{
    int height;
    int perimeter;
    Rectangle(int length,int breadth,int height){
        this.height = height;
        this.perimeter=perimeter(length,breadth);
        System.out.println(perimeter+height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", perimeter=" + perimeter +
                '}';
    }
}


public class ParameterisedClassDemo {
    public static void main(String[] args){
     Rectangle rect = new Rectangle(5,9,5);
     System.out.println(rect);
    }
}
