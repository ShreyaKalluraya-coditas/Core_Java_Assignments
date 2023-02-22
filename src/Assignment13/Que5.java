package Assignment13;

public class Que5 {
    public static void main(String[] args){
        int[] arr = new int[10];
        int sum=0;
        for (int i = 0; i < 11; i++) {
            sum = sum + arr[i];
        }


        try {
            for (int i = 0; i < 11; i++) {
                sum = sum + arr[i];
            }
        }catch(ArrayIndexOutOfBoundsException ae){
            System.out.println(ae);
        }
        finally{
            System.out.println("The index of array is out of bound");
        }

    }
}
