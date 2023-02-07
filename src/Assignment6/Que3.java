package Assignment6;

public class Que3 {
    public static void main(String[] args) {
        int temperature = 3;
        switch (temperature) {
            case 1:
                System.out.println("Low");
                break;
            case 2:
                System.out.println("Medium");
                break;
            case 3:
                System.out.println("High");
                break;
            default:
                System.out.println("Abnormal");
        }
    }
}