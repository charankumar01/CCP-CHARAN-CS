import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private Name name;
    private List<Room> rooms = new ArrayList<>();

    public Hotel(Name name) {
        if (name == null) {
            throw new IllegalArgumentException("Hotel name required");
        }
        this.name = name;
    }

    public void addRoom(Room room) {
        if (room == null) {
            System.out.println("Cannot add null room");
            return;
        }
        rooms.add(room);
        System.out.println("Room " + room.getNumber() + " added to hotel");
    }

    public boolean available() {

        for (int i = 0; i < rooms.size(); i++) {
            if (!rooms.get(i).isOccupied()) {
                return true;
            }
        }
        return false;
    }

    public boolean createReservation() {

        if (!available()) {
            System.out.println("No rooms available. Reservation failed.");
            return false;
        }

        System.out.println("Reservation created successfully.");
        return true;
    }

    public String getHotelName() {
        return name.getValue();
    }
}
