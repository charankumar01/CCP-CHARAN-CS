public class Room {

    private int number;
    private Guest occupant;

    public Room(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Invalid room number");
        }
        this.number = number;
    }

    public boolean createGuest(Guest guest) {

        if (guest == null) {
            System.out.println("Guest cannot be null");
            return false;
        }

        if (occupant != null) {
            System.out.println("Room " + number + " is already occupied");
            return false;
        }

        occupant = guest;
        System.out.println("Guest " + guest.getGuestName()
                + " assigned to Room " + number);
        return true;
    }

    public boolean isOccupied() {
        if (occupant == null) {
            return false;
        }
        return true;
    }

    public int getNumber() {
        return number;
    }
}
