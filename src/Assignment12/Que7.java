package Assignment12;
import java.util.StringTokenizer;
public class Que7 {
    public static void main(String[] args){
        StringTokenizer stringTokenizer=new StringTokenizer("Hi , all.How are you?",",.");
        while (stringTokenizer.hasMoreTokens())
        {
            //System.out.println(stringTokenizer.nextToken());
            System.out.println(stringTokenizer.nextToken());
        }

    }

}
