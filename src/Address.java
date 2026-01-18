public class Address {

    private String city;

    public Address(String city) {
        if (city == null || city.trim().isEmpty()) {
            throw new IllegalArgumentException("City cannot be empty");
        }
        this.city = city;
    }

    public String getCity() {
        return city;
    }
}
