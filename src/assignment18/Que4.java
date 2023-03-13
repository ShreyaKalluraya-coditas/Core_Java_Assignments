package assignment18;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class Que4 {
    public static void main(String[] args){
        Vector<Integer> v = new Vector<>();
        v.add(23);
        v.add(33);
        v.add(55);
        v.add(67);
        v.add(12);


        Enumeration e = v.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

        v.addElement(23);
        System.out.println("First element "+v.firstElement());

        System.out.println(v);

        System.out.println("Last element "+v.lastElement());






    }
}
