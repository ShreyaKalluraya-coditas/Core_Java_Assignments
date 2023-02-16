package Assignment10;
interface Shapes{
    String color = "Red";
    void getAreas();

}

class RectangleDemo implements Shapes{
    int l,b;
    RectangleDemo(){
        this.l=0;
        this.b=0;
    }

    RectangleDemo(int l,int b){
        this.l=l;
        this.b=b;
    }
    @Override
    public void getAreas() {
        System.out.println(l*b);
    }
}

class TriangleDemo implements Shapes{

    int base,height;
    TriangleDemo(){
        base=0;
        height=0;
    }
    TriangleDemo(int base,int height){
        this.base=base;
        this.height=height;
    }
    @Override
    public void getAreas() {
        System.out.println(height*base/2);
    }
}
public class Que7 {
    public static void main(String[] args){
        RectangleDemo rectangle=new RectangleDemo(10,20);
        rectangle.getAreas();
        TriangleDemo triangle=new TriangleDemo(30,2);
        triangle.getAreas();
    }

}
