import java.util.ArrayList;
import java.util.List;

public class HotelChain {

    private String name;
    private List<Hotel> hotels = new ArrayList<>();

    public HotelChain(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("HotelChain name required");
        }
        this.name = name;
    }

    public void addHotel(Hotel hotel) {
        if (hotel == null) {
            System.out.println("Cannot add null hotel");
            return;
        }
        hotels.add(hotel);
        System.out.println("Hotel added to chain: " + hotel.getHotelName());
    }

    public void makeReservation() {
        if (!canMakeReservation()) {
            System.out.println("Reservation not allowed");
            return;
        }
        System.out.println("Reservation made successfully");
    }

    public void cancelReservation() {
        if (!canCancelReservation()) {
            System.out.println("Cancellation not allowed");
            return;
        }
        System.out.println("Reservation cancelled");
    }

    public void checkInGuest() {
        if (!canCheckInGuest()) {
            System.out.println("Check-in not allowed");
            return;
        }
        System.out.println("Guest checked in");
    }

    public void checkOutGuest() {
        if (!canCheckOutGuest()) {
            System.out.println("Check-out not allowed");
            return;
        }
        System.out.println("Guest checked out");
    }

    public ReservationPayer createReservationPayer(int id, CreditCard card) {
        return ReservationPayer.create(id, card);
    }

    // UML private methods
    private boolean canMakeReservation() {
        return true;
    }

    private boolean canCancelReservation() {
        return true;
    }

    private boolean canCheckInGuest() {
        return true;
    }

    private boolean canCheckOutGuest() {
        return true;
    }
}
