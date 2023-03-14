package file_handling;

import java.io.File;
import java.io.IOException;

public class CreatingFile {
    public static void main(String[] args) throws IOException {
        File f = new File("File1.txt");
        if(f.exists()){
            System.out.println("Exists");
        }
        else{
            f.createNewFile();

        }

        File f1 = new File("File2.txt");
        if(f1.exists()){
            System.out.println("Exists");
        }
        else{
            f1.createNewFile();

        }

        File f2 = new File("Output.txt");
        if(f2.exists()){
            System.out.println("Exists");
        }
        else{
            f2.createNewFile();

        }

        File f3 = new File("NewFile.txt");
        if(f3.exists()){
            System.out.println("Exists");
        }
        else{
            f3.createNewFile();

        }

        File f4 = new File("NewFile2.txt");
        if(f4.exists()){
            System.out.println("Exists");
        }
        else{
            f4.createNewFile();

        }


    }
}
