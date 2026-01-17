public class RoomType {
    private String kind;
    private double cost;

    public RoomType(String kind, double cost) {
        if (kind == null) {
            throw new IllegalArgumentException("Room type is required");
        }
        if (cost <= 0) {
            throw new IllegalArgumentException("Cost must be positive");
        }
        this.kind = kind;
        this.cost = cost;
    }

    public String getKind() {
        return kind;
    }

    public double getCost() {
        return cost;
    }
}
