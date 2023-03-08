package assignment17;

import java.util.HashSet;
import java.util.TreeSet;

public class Que3 {
    public static void main(String[] args){
       TreeSet<Integer> treeSet = new TreeSet<Integer>();
       treeSet.add(2);
       treeSet.add(4);
       treeSet.add(8);
       treeSet.add(10);
       System.out.println("Tree Set");
        for(Integer i:treeSet){
            System.out.println(i);
        }

        HashSet<Integer> hashSet = new HashSet<>(treeSet);
         System.out.println("Hash Set ");
        for(Integer i:hashSet){
            System.out.println(i);
        }



    }
}
