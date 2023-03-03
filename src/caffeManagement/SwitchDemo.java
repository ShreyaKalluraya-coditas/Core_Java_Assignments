package caffeManagement;
import java.util.Scanner;
public class SwitchDemo extends Thread {
    public void run() {
        Scanner s = new Scanner(System.in);
        boolean isPossible = false;
        while(true) {
            System.out.println("Enter you choice");
            System.out.println("Press 0 for exit");
            System.out.println("Press 1 for Book Table");
            System.out.println("Press 2 for Print Menu");
            System.out.println("Press 3 for Order");

            int ch = s.nextInt();
            switch (ch) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    BookTable b = new BookTable();
                    isPossible = b.bookTable();
                    break;

                case 2:if(!isPossible) {
                    System.out.println("You are not allowed to order because you need to book seat first!!");
                } else{
                    Menu m = new Menu();
                    m.showMenu();
                }

                    break;

                case 3:
                    if(!isPossible) {
                        System.out.println("You are not allowed to order because you need to book seat first!!");
                    }
                    else {

                        PlaceOrder p = new PlaceOrder();
                        p.order();
                    }
                    break;


                default:
                    System.out.println("No such option is present");



            }

        }

    }


}
