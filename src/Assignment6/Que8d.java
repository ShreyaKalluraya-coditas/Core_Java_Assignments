package Assignment6;

public class Que8d {
    public static void main(String[] args) {
        int k=0;
        for(int i=1;i<=11;i++)
        {
            char x='A';
            if(i<=6)
                k++;
            else
                k--;
            for(int j=1;j<=6;j++)
            {
                if(j<=k) {
                    System.out.print(x);
                    x++;
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
