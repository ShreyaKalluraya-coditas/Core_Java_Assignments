package Assignment7;
import java.util.Scanner;
public class Que6 {
    public static void main(String args[]) {
        int[] arr = {3, 5, 6, 8, 10};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth position");
        int n = sc.nextInt();
        if (n <= arr.length) {
            int element= arr[n - 1];
            System.out.println(element);
        } else {
            System.out.println("Enter any position from " + arr.length);
        }
    }
}

