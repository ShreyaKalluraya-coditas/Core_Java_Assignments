package Assignment6;
import java.util.*;
public class Que7c {
    public static void main(String[] args) {


        Date d=new Date();
        int todaydate= d.getDate();
        for(int i=1;i<=30;i++){
            if(todaydate+1==i)
                break;
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
