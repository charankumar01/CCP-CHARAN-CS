public class Guest {
    private Name name;
    private Address address;

    public Guest(Name name, Address address) {
        this.name = name;
        this.address = address;
    }

    public static Guest create(Name name, Address address) {
        return new Guest(name, address);
    }
}
