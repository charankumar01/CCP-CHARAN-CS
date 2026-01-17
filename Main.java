import java.util.Date;

public class Main {

    public static void main(String[] args) {

        System.out.println("===== Hotel Reservation System Started =====");

        // 1. Create Hotel Chain
        HotelChain hotelChain = new HotelChain("Luxury Chain");
        System.out.println("Hotel Chain created");

        // 2. Create Hotel
        Name hotelName = new Name("Grand Hotel");
        Hotel hotel = new Hotel(hotelName);
        System.out.println("Hotel created: " + hotelName.getValue());

        // 3. Create Rooms
        Room room1 = new Room(101);
        Room room2 = new Room(102);
        hotel.addRoom(room1);
        hotel.addRoom(room2);
        System.out.println("Rooms added to hotel");

        // 4. Create Guest
        Name guestName = new Name("Ali");
        Address guestAddress = new Address("Karachi");
        Guest guest = Guest.create(guestName, guestAddress);
        System.out.println("Guest created: " + guestName.getValue());

        // 5. Assign Guest to Room
        room1.createGuest(guest);
        System.out.println("Guest assigned to Room: " + room1.isOccupied());

        // 6. Check Room Availability
        boolean available = hotel.available();
        System.out.println("Is any room available? " + available);

        // 7. Create Reservation
        try {
            hotel.createReservation();
            System.out.println("Reservation created successfully");
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        // 8. Create Reservation Dates
        Date startDate = new Date();
        Date endDate = new Date();

        Reservation reservation = Reservation.create(startDate, endDate, 1);
        System.out.println("Reservation object created with number: 1");

        // 9. Create Credit Card & Reservation Payer
        CreditCard card = new CreditCard("123456789012");
        ReservationPayer payer = ReservationPayer.create(1, card);
        System.out.println("Reservation payer created with ID: 1");

        // 10. Add Hotel to Hotel Chain
        hotelChain.addHotel(hotel);
        System.out.println("Hotel added to Hotel Chain");

        // 11. Perform HotelChain Operations
        hotelChain.makeReservation();
        hotelChain.checkInGuest();
        hotelChain.checkOutGuest();
        hotelChain.cancelReservation();

        System.out.println("===== System Executed Successfully =====");
    }
}
