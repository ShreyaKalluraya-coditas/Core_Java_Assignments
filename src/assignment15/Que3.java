package assignment15;
class SimpleThread implements Runnable{
    public void run(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Inside Child Thread");
    }
}
public class Que3 {
    public static void main(String[] args)  {

        SimpleThread st1 = new SimpleThread();
        SimpleThread st2 = new SimpleThread();
        SimpleThread st3 = new SimpleThread();
        Thread t1 = new Thread(st1);
        Thread t2 = new Thread(st2);
        Thread t3 = new Thread(st3);
          t1.start();
          t2.setDaemon(true);
          t2.start();
          t3.start();
        try {
            t1.join(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(t1.getStackTrace());
        System.out.println(t3.isAlive());
        System.out.println(t2.isDaemon());
        System.out.println(t1.hashCode());

    }
}


//OUTPUT

//    Inside Child Thread
//        [Ljava.lang.StackTraceElement;@1b28cdfa
//        true
//        true
//        250421012
//        Inside Child Thread
//        Inside Child Thread
//
//        Process finished with exit code 0
