package Assignment7;

public class Que5 {
    public static void main(String[] args) {
        int [][] array1 = {{1,2},{3,4,5},{6,7,8,9}};
        int [][] array2 = {{5,7},{1,2,4},{5,7,6,4}};
        int ans=0;
        for(int i = 0; i<array1.length; i++){
            for(int j=0; j<array1[i].length; j++){
                ans = array1[i][j] + array2[i][j];
                System.out.println("Addition of Array is" + ans);
            }
        }
    }
}
