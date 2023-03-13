package assignment18;

import java.util.Hashtable;
import java.util.Map;

public class Que1 {

    public static void main(String[] args){
        Map<String,Integer> marks = new Hashtable<>();
        marks.put("Shreya",100);
        marks.put("Krati",70);
        marks.put("Mrunmai",80);
        marks.put("Yash",90);
      //marks.put("Shreya",60);
        //If same key then replaces the first one.


        System.out.println(marks.get("Shreya"));

        System.out.println(marks);

        marks.putIfAbsent("Tanmay",300);
        System.out.println(marks);

        System.out.println(marks.size());





    }
}
