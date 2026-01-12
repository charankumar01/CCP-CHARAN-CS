public class Room {
    private int number;
    private Guest occupant;

    public Room(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Invalid room number");
        }
        this.number = number;
    }

    public void createGuest(Guest guest) {
        if (guest == null) {
            throw new IllegalArgumentException("Guest cannot be null");
        }
        this.occupant = guest;
    }

    public boolean isOccupied() {
        return occupant != null;
    }
}
