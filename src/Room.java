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
            throw new IllegalArgumentException("Guest cannot be null");
        }

        if (occupant != null) {
            System.out.println("Room " + number +
                    " is already occupied. Guest cannot be assigned again.");
            return false;
        }

        this.occupant = guest;
        System.out.println("Guest assigned to Room " + number);
        return true;
    }

    public boolean isOccupied() {
        return occupant != null;
    }

    public int getNumber() {
        return number;
    }
}
