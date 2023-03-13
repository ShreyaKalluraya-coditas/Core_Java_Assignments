package studentManagement;

import java.util.Arrays;
import java.util.Scanner;

public class StudentMarks {
    Scanner s = new Scanner(System.in);
    int[] arr;
    int sheetId , rollNo;
     StudentMarks(int sheetId,int rollNo,int[] arr){
        this.sheetId=sheetId;
        this.rollNo=rollNo;
        this.arr = arr;
        int count=0;
        for(int i=0;i<5;i++){
            if(arr[i]<0 || arr[i]>100){
                try {
                    throw new MarksNotInRangeException(" You are not allowed to proceed further");
                }catch(Exception e){

                }
                break;
            }

        }
       for(int i=0;i<5;i++){
           if(arr[i]<35){
             count++;
           }

       }
       if(count == 1){

           for(int i=0;i<5;i++){
               if(arr[i]<35){
                   arr[i] +=5;
               }

           }
       }
      if(count>1){
          System.out.println("You have been Failed");
      }
      for(int i=0;i<5;i++){
          if(arr[i]<35){
             System.out.println("After grace marks also you have been failed");
              break;
          }
         // System.out.println("After grace marks also you have been failed");
      }

    }

    @Override
    public String toString() {
        return "StudentMarks{" +
                "arr=" + Arrays.toString(arr) +
                ", sheetId=" + sheetId +
                ", rollNo=" + rollNo +
                '}';
    }








}
