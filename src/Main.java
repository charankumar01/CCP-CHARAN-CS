import java.util.Date;

public class Main {

    public static void main(String[] args) {

        
        System.out.println("   HOTEL RESERVATION SYSTEM STARTED   ");
        
        // 1. Create Hotel Chain
        HotelChain chain = new HotelChain("Luxury Chain");
        System.out.println("Hotel Chain created.");

        // 2. Create Hotel
        Hotel hotel = new Hotel(new Name("Grand Hotel"));
        System.out.println("Hotel created: Grand Hotel");

        // 3. Create Rooms
        Room room101 = new Room(101);
        Room room102 = new Room(102);
        hotel.addRoom(room101);
        hotel.addRoom(room102);

        // 4. Create Guests
        Guest guest1 = Guest.create(
                new Name("Ali"),
                new Address("Karachi")
        );

        Guest guest2 = Guest.create(
                new Name("Ahmed"),
                new Address("Lahore")
        );

        System.out.println(" Guests created: Ali & Ahmed");

        // 5. Assign Guest 1 to Room 101
        System.out.println("\n--- Assigning Guest Ali to Room 101 ---");
        room101.createGuest(guest1);

        // 6. Try assigning Guest 2 to SAME Room 101
        System.out.println("\n--- Trying to assign Ahmed to SAME Room 101 ---");
        room101.createGuest(guest2);

        // 7. Create Reservation (1st time)
        System.out.println("\n--- Creating Reservation (First Attempt) ---");
        boolean reservation1 = hotel.createReservation();

        // 8. Occupy second room
        System.out.println("\n--- Assigning Ahmed to Room 102 ---");
        room102.createGuest(guest2);

        // 9. Try creating reservation again (all rooms occupied)
        System.out.println("\n--- Creating Reservation (Second Attempt) ---");
        boolean reservation2 = hotel.createReservation();

        // 10. Create Reservation object (for demo)
        Reservation reservation = Reservation.create(
                new Date(),
                new Date(),
                1
        );
        System.out.println(" Reservation object created.");

        // 11. Payment
        CreditCard card = new CreditCard("123456789012");
        ReservationPayer payer = ReservationPayer.create(1, card);
        System.out.println("Reservation payment details added.");

        // 12. Hotel Chain operations
        chain.addHotel(hotel);
        chain.makeReservation();
        chain.checkInGuest();
        chain.checkOutGuest();

        System.out.println("   SYSTEM EXECUTED SUCCESSFULLY       ");
       
    }
}
