package assignment15;

class ThreadDemo extends Thread{
    public void run(){
        System.out.println("Inside Thread Demo");
    }
}



public class Que1 {
    public static void main(String[] args){
        ThreadDemo td = new ThreadDemo();
        td.start();
        td.start();

    }

}

//OUTPUT

//    Exception in thread "main" java.lang.IllegalThreadStateException
//        at java.base/java.lang.Thread.start(Thread.java:793)
//        at assignment15.Que1.main(Que1.java:15)
//        Inside Thread Demo