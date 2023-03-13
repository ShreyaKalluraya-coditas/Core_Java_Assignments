package assignment18;

import java.util.PriorityQueue;
import java.util.Queue;

public class Que3 {
  public static void main(String[] args){
      Queue<Integer> pq = new PriorityQueue<>();
      pq.add(23);
      pq.add(43);
      pq.add(56);
      pq.add(70);

      System.out.println(pq);

      System.out.println(pq.peek());

      pq.poll();//removes the element

      System.out.println(pq);

      System.out.println( pq.element());

      System.out.println(pq.contains(70));





  }
}
