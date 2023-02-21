package Assignment12;

public class Que1 {
    public static void main(String[] args){
      String name1="Shreya Kalluraya";
      String name2 ="Krati Tare";
      String name3="Aarti Dhumal";

      if(name1.length()>=name2.length() && name1.length()>=name3.length()){
            System.out.println(name1);
            if(name2.length()>=name3.length()){
                System.out.println(name2);
                System.out.println(name3);
            }
            else{
                System.out.println(name3);
                System.out.println(name2);
            }
      }

      if(name2.length()>=name1.length() && name2.length()>=name3.length()){
          System.out.println(name2);
          if(name1.length()>=name3.length()){
              System.out.println(name1);
              System.out.println(name3);

          }
          else{
              System.out.println(name3);
              System.out.println(name1);
          }
      }

      if(name3.length()>=name1.length() && name3.length()>=name2.length()){
          System.out.println(name3);
          if(name1.length()>=name2.length()){
              System.out.println(name1);
              System.out.println(name2);
          }
          else{
              System.out.println(name2);
              System.out.println(name1);
          }
      }
    }
}
