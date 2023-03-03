package caffeManagement;
import java.util.Scanner;
public class BookTable {
    static int tableOfTwo =8,tableOfFour = 4,tableOfSix = 2,tableOfEight = 2;

    synchronized public boolean bookTable() {


        boolean isAvailable = false;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = s.nextLine();
        System.out.println("Enter the number of seats ");
        int seats = s.nextInt();

        if (seats <= 2) {
            if (tableOfTwo != 0) {
                tableOfTwo--;
                isAvailable = true;
                System.out.println("Hello " + name + " Your Seats are booked in table of two");


            }
        }
        if (seats <= 4 && !isAvailable) {
            if (tableOfFour != 0) {
                tableOfFour--;
                isAvailable = true;
                System.out.println("Hello " + name + " Your Seats are booked in table of four");

            }
        }
        if (seats <= 6 && !isAvailable) {
            if (tableOfSix != 0) {
                tableOfSix--;
                isAvailable = true;
                System.out.println("Hello " + name + " Your Seats are booked in table of six");

            }
        }
        if (seats <= 8 && !isAvailable) {
            if (tableOfEight != 0) {
                tableOfEight--;
                isAvailable = true;
                System.out.println("Hello " + name + " Your Seats are booked in table of eight");

            }
        }
        if (!isAvailable) {
            System.out.println("Sorry table are not available");;
            return false;
        }
        return true;

    }



}
