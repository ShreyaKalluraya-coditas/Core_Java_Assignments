package Assignment12;
import java.util.*;
public class Que6 {
    public static void main(String[] args){
        String name = "Shreya";
        char[] str = new char[name.length()];
        for(int i=0;i<name.length();i++){
            str[i] = name.charAt(i);
        }

        for(char i : str){
            System.out.println(i);
        }


    }
}
