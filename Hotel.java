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
    }

    public boolean available() {
        return rooms.stream().anyMatch(r -> !r.isOccupied());
    }

    public void createReservation() {
        if (!available()) {
            throw new IllegalStateException("No rooms available");
        }
    }
}
