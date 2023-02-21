package Assignment12;

public class Que4 {
    public static void main(String[] args){
        String name = "  Shreya Kalluraya   ";
        System.out.println(name);
        String trimName = name.trim();
        System.out.println(trimName);
        System.out.println(trimName.codePointAt(5));
    }
}
