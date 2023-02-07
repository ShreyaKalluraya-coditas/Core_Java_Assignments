package Assignment6;

public class Ques8b {

    public static void main(String[] args) {
        for(int i=1;i<=6;i++)
        {
            char k='A';
            for(int j=1;j<=6;j++)
            {
                if(j<=7-i) {
                    System.out.print(k);
                    k++;
                }
                else
                    System.out.print(" ");
            }
            System.out.println();

        }

        for(int l=1;l<=6;l++)
        { char k='A';
            for(int m=1;m<=6;m++){
                if(m<=l) {
                    System.out.print(k);
                    k++;
                }
                else
                    System.out.print(" ");

            }
            System.out.println();
        }



    }
}
