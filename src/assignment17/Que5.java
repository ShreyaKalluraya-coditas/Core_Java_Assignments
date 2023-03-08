package assignment17;

import java.util.HashSet;

public class Que5 {
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

        int arr[] = new int[hashSet.size()];
        int i=0;
        for(int element:hashSet){
            arr[i]=element;
            i++;
        }
        System.out.println("Printing of array elemnts");
        for(int printElement : arr){
            System.out.println(printElement);
        }


    }
}
