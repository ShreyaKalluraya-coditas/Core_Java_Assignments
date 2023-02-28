package assignment15;
class RunDemo extends Thread{
    public void run(){
        System.out.println("Inside Run Demo");
    }
}
public class Que2 {
    public static void main(String[] args){
        RunDemo rd = new RunDemo();
        rd.run();
    }
}


//output
//Inside Run Demo
//
//        Process finished with exit code 0