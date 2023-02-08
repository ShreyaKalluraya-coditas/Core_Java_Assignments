package Assignment7;
import java.util.*;
public class Que4 {
    public static void main(String[] args) {
        int[] array1 = {1,4,6,5,4,8,9};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            if (list.contains(array1[i])) {
                System.out.println("Duplicate element is : " + array1[i]);
            } else {
                list.add(array1[i]);
            }
        }
        System.out.println("after duplicates is remove arr will be");
        for (Integer arr : list) {
            System.out.println(arr);
        }
    }
}