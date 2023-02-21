package Assignment12;
import java.util.Scanner;

public class Que5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 5 string");
        String arr[]= new String[5];
        for(int i=0;i<5;i++){
            arr[i]=scanner.nextLine();
        }
        for(int i=0;i<4;i++){

            for(int j=i+1;j<5;j++){
                if(arr[i].length()>arr[j].length()){
                    String temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<5;i++){
            String str="";
            for(int j=0;j<arr[i].length();j++){
                char ch = arr[i].charAt(j);
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    ch++;
                }
                str+=ch;
            }
            arr[i]=str;
        }

        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }

    }


}
