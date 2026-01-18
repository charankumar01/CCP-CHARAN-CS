import java.util.Date;

public class Main {

    public static void main(String[] args) {

        System.out.println("===== HOTEL RESERVATION SYSTEM =====\n");

        // Step 1: Create Hotel Chain
        HotelChain chain = new HotelChain("Luxury Chain");
        System.out.println("Hotel Chain created.\n");

        // Step 2: Create Hotel
        Hotel hotel = new Hotel(new Name("Grand Hotel"));
        chain.addHotel(hotel);
        System.out.println("Hotel created: " + hotel.getHotelName() + "\n");

        // Step 3: Create Rooms
        Room room101 = new Room(101);
        Room room102 = new Room(102);
        hotel.addRoom(room101);
        hotel.addRoom(room102);
        System.out.println();

        // Step 4: Create Guests
        Guest guest1 = Guest.create(new Name("Ali"), new Address("Karachi"));
        Guest guest2 = Guest.create(new Name("Ahmed"), new Address("Lahore"));
        System.out.println("Guests created: Ali & Ahmed\n");

        // Step 5: Assign Guest Ali to Room 101
        System.out.println("---Assigning Guest Ali to Room 101 ---");
        room101.createGuest(guest1);
        System.out.println("Room 101 available? " + !room101.isOccupied() + "\n");

        // Step 6: Try assigning Ahmed to SAME Room 101
        System.out.println("--- Trying to assign Ahmed to SAME Room 101 ---");
        room101.createGuest(guest2);
        System.out.println("Room 101 available? " + !room101.isOccupied() + "\n");

        // Step 7: Creating Reservation (First Attempt)
        System.out.println("--- Creating Reservation (First Attempt) ---");
        hotel.createReservation();
        System.out.println("Room 102 available? " + !room102.isOccupied() + "\n");

        // Step 8: Assign Ahmed to Room 102
        System.out.println("---Assigning Guest Ahmed to Room 102 ---");
        room102.createGuest(guest2);
        System.out.println("Room 102 available? " + !room102.isOccupied() + "\n");

        // Step 9: Creating Reservation (Second Attempt)
        System.out.println("---Creating Reservation (Second Attempt) ---");
        hotel.createReservation();
        System.out.println();

        // Step 10: Create Reservation Object
        System.out.println("---Creating Reservation Object ---");
        Reservation reservation = Reservation.create(
                new Date(), new Date(), new Date(), 1
        );
        System.out.println("Reservation object created with number: 1\n");

        // Step 11: Payment
        CreditCard card = new CreditCard("123456789012");
        ReservationPayer payer = chain.createReservationPayer(1, card);
        System.out.println("Reservation payment details added\n");

        // Step 12: Hotel Chain operations
        System.out.println("---hotel Chain Operations ---");
        chain.makeReservation();
        chain.checkInGuest();
        chain.checkOutGuest();
        chain.cancelReservation();

        System.out.println("\n===== SYSTEM EXECUTED SUCCESSFULLY =====");
    }
}
