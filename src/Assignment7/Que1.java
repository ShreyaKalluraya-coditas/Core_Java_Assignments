package Assignment7;
import java.util.Arrays;
public class Que1 {
    public static void main(String[] args) {

        int Array1[] = {20,30,40,50,60};
        int Array2[]={20,30,40,50};
        Arrays.sort(Array1);

        int key = 40;
        System.out.println("************* Binary Search ****************");
        System.out.println(key + " is found at index =" + Arrays.binarySearch(Array1,key));

        System.out.println("******************* Compare ***************************");
        System.out.println("Array on comparision "+Arrays.compare(Array1,Array2));

        System.out.println("****************** Copy Of****************************");
        System.out.println(Arrays.toString(Arrays.copyOf(Array1,10)));

    }
}
