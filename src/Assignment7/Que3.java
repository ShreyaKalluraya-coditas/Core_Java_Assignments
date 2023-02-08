package Assignment7;

import java.util.Arrays;

public class Que3 {
    public static void main(String[] args) {

        int Array1[] = {20,30,40,50,60};
        System.out.println(Arrays.toString(Array1));

        System.out.println("****************** Copy Of****************************");
        System.out.println("New Array "+Arrays.toString(Arrays.copyOf(Array1,5)));

    }
}
