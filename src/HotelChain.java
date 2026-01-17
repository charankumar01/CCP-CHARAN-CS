import java.util.ArrayList;
import java.util.List;

public class HotelChain {
    private String name;
    private List<Hotel> hotels = new ArrayList<>();

    public HotelChain(String name) {
        this.name = name;
    }

    public void addHotel(Hotel hotel) {
        hotels.add(hotel);
    }

    public void makeReservation() {
        System.out.println("Reservation made successfully");
    }

    public void cancelReservation() {
        System.out.println("Reservation cancelled");
    }

    public void checkInGuest() {
        System.out.println("Guest checked in");
    }

    public void checkOutGuest() {
        System.out.println("Guest checked out");
    }
}
