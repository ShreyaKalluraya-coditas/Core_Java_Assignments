package Assignment7;

import java.util.*;


public class Que2 {
    public static void main(String[] args) {
        Integer Array1[] = {20, 30, 40, 50, 60};

        Arrays.sort(Array1);
        System.out.println("Ascending order "+Arrays.toString(Array1));

        Arrays.sort(Array1, Collections.reverseOrder());
        System.out.println("Descending order "+Arrays.toString(Array1));
    }
}
