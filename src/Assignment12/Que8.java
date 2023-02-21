package Assignment12;

import java.util.StringTokenizer;
import java.util.ArrayList;

public class Que8 {
    public static void main(String[] args){
        ArrayList<String> operators = new ArrayList<>();
        ArrayList<String> operands = new ArrayList<>();
        StringTokenizer stringTokenizer=new StringTokenizer("3+20%2*20/2","+%*/",true);
        int i=0;
        while (stringTokenizer.hasMoreTokens())
        {
            if(i%2==0) {
                operands.add(stringTokenizer.nextToken());
            }
            else{
                operators.add(stringTokenizer.nextToken());
            }
            i++;
        }
        System.out.println(operators);
        System.out.println(operands);


    }
}
