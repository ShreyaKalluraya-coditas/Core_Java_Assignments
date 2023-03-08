package assignment17;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Que1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(5);
        set.add(7);
        set.add(9);
        for(Integer i:set){
            System.out.println(i);
        }
        System.out.println("Enter the element you want to check");
        int x = s.nextInt();
        System.out.println(set.contains(x));
    }
}
