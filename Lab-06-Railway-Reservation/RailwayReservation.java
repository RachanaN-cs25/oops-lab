
import java.util.Scanner;

class SeatAlreadyBookedException extends Exception {
    SeatAlreadyBookedException(String message) {
        super(message);
    }
}

class Reservation {
    boolean[] seats = new boolean[6];

    public void reserveSeat(int seatNumber)
            throws SeatAlreadyBookedException {

        if (seatNumber < 1 || seatNumber > 5) {
            throw new IllegalArgumentException("Invalid seat number!");
        }

        if (seats[seatNumber]) {
            throw new SeatAlreadyBookedException(
                "Seat is already booked!"
            );
        }

        seats[seatNumber] = true;
        System.out.println("Seat " + seatNumber +
                           " reserved successfully!");
    }
}

public class RailwayReservation{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Reservation r = new Reservation();

        try {
            System.out.print("Enter seat number (1-5): ");
            int seat = sc.nextInt();

            r.reserveSeat(seat);
        }

        catch (SeatAlreadyBookedException e) {
            System.out.println(e.getMessage());
        }

        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        catch (java.util.InputMismatchException e) {
            System.out.println("Incorrect input! Enter a number.");
        }

        finally {
            System.out.println("Transaction completed.");
            sc.close();
        }
    }
}
