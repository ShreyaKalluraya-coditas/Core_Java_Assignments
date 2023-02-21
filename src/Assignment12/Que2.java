package Assignment12;
public class Que2 {
    public static void main(String[] args){

        int vowels = 0, consonants = 0;

        String str = "Hii I am Shreya Kalluraya";

        str = str.toLowerCase();

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e'
                    || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {

                vowels++;
            }
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {
                consonants++;
            }
        }
        System.out.println("Number of vowels in String: " +  vowels);
        System.out.println("Number of consonants in String: " + consonants);

    }
}
