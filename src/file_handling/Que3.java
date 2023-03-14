package file_handling;

import java.io.*;

//add same data into three files
public class Que3 {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos1 = new FileOutputStream("File1.txt");
        FileOutputStream fos2 = new FileOutputStream("File2.txt");

        ByteArrayOutputStream bais = new ByteArrayOutputStream();
        String data ="Hello Everyone Welcome To Coditas";
        byte[] b = data.getBytes();
        try {
            bais.write(b);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            bais.writeTo(fos1);
            bais.writeTo(fos2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            bais.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            bais.close();
            fos1.close();
            fos2.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
