public class Guest {

    private Name name;
    private Address address;

    public Guest(Name name, Address address) {
        if (name == null || address == null) {
            throw new IllegalArgumentException("Guest data cannot be null");
        }
        this.name = name;
        this.address = address;
    }

    public static Guest create(Name name, Address address) {
        return new Guest(name, address);
    }

    public String getGuestName() {
        return name.getValue();
    }
}
