package caffeManagement;

public class NoReservationFoundException extends Exception{
    NoReservationFoundException(){
        System.out.println("Default");

    }
    NoReservationFoundException(String s){
        System.out.println("Reservation of a seat is "+s);
    }

}
