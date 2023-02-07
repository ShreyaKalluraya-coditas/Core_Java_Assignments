package Assignment6;
import java.util.*;
public class Que7b {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);



        String days[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        for(int i=0;i<days.length;i++){

            if(i==day-1)
               continue;
            System.out.println(days[i]);
        }

    }
}
