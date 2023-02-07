package Assignment6;

public class Que8f {
    public static void main(String[] args) {
        for(int i=1;i<=6;i++){
            char x='A';
            for(int j=1;j<=i;j++){
            System.out.print(x++);





        }
            x--;
            for(int k=2;k<=i;k++){
                System.out.print(--x);
            }
            System.out.println();
        }
    }
}
