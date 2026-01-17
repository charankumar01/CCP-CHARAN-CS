import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private Name name;
    private List<Room> rooms = new ArrayList<>();

    public Hotel(Name name) {
        this.name = name;
    }

    public void addRoom(Room room) {
        rooms.add(room);
        System.out.println("Room " + room.getNumber() + " added to hotel.");
    }

    public boolean available() {
        for (Room room : rooms) {
            if (!room.isOccupied()) {
                return true;
            }
        }
        return false;
    }

    public boolean createReservation() {
        if (!available()) {
            System.out.println("Reservation not possible. All rooms are occupied.");
            return false;
        }

        System.out.println("Reservation created successfully.");
        return true;
    }
}
