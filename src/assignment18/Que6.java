package assignment18;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Que6 {
    public static void main(String[] args){
        NavigableMap<String, Integer> nm = new TreeMap<>();


        nm.put("C", 888);
        nm.put("Y", 999);
        nm.put("A", 444);
        nm.put("T", 555);
        nm.put("B", 666);
        nm.put("A", 555);


        System.out.println("Mappings of NavigableMap : "
                + nm);

        System.out.printf("Descending Set  :" +nm.descendingKeySet());
        System.out.printf("Floor Entry  :" +nm.floorEntry("L"));
        System.out.printf("First Entry  : "+ nm.firstEntry());
        System.out.printf("Last Key : "+ nm.lastKey());
        System.out.printf("First Key :"+ nm.firstKey());
        System.out.printf("Original Map : "+ nm);
        System.out.printf("Reverse Map : "+ nm.descendingMap());


        Iterator<NavigableMap.Entry<String,Integer> > itr
                = nm.entrySet().iterator();


        System.out.println("Traversing using Iterator: ");

        while (itr.hasNext()) {
            NavigableMap.Entry<String,Integer> entry
                    = itr.next();
            System.out.println("Key = " + entry.getKey()
                    + ", Value = "
                    + entry.getValue());
        }
    }
}
