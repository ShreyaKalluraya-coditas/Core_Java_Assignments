package file_handling;

import java.io.*;

//Try subclasses for character and byte stream classes
public class Que1 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("File1.txt");
        int i=0;
        while((i=fis.read())!=-1){
            System.out.print((char)i);
        }
        fis.close();

        FileOutputStream fos = new FileOutputStream("NewFile.txt");
        String s="How are you";
        byte b[] = s.getBytes();
        fos.write(b);
        fos.close();

        System.out.println();

        String data = "Hope you all doing good";
        FileWriter fw = new FileWriter("NewFile2.txt");
        fw.write(data);
       // fw.flush();
        fw.close();

        FileReader fr = new FileReader("NewFile2.txt");
        int j=0;
        while((j=fr.read())!=-1){
            System.out.print((char)j);
        }
        fr.close();


    }
}
