package assignment17;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Que4 {
    public static void main(String[] args){
        HashSet<Integer> hashSet = new HashSet<>();;
        hashSet.add(1);
        hashSet.add(3);
        hashSet.add(5);
        hashSet.add(7);
        hashSet.add(9);
        System.out.println("Hash Set");
        for(Integer i:hashSet){
            System.out.println(i);
        }

        System.out.println("Tree Set");
        TreeSet<Integer> treeSet = new TreeSet<>(hashSet);
        for(Integer i:treeSet){
            System.out.println(i);
        }


    }
}
