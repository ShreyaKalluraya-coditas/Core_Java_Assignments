package assignment17;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Que2 {
    public static void main(String[] args){
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(5);
        set.add(7);
        set.add(9);
        for(Integer i:set){
            System.out.println(i);
        }
        int firstElement=0;
        for(Integer i:set){
            firstElement=i;
            break;
        }
        System.out.println("First Element is "+firstElement);
        int lastElement =0;
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            int element  = iterator.next();
            if(!iterator.hasNext()){
                lastElement = element;
            }
        }
        System.out.println("Last Element is "+lastElement);


    }
}
