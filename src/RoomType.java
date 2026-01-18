public class RoomType {
    private String kind;
    private double cost;

    public RoomType(String kind, double cost) {
        if (kind == null || kind.trim().isEmpty()) {
            throw new IllegalArgumentException("Room type required");
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
