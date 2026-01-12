import java.util.Date;

public class Reservation {
    private Date startDate;
    private Date endDate;
    private int number;

    public Reservation(Date startDate, Date endDate, int number) {
        if (startDate.after(endDate)) {
            throw new IllegalArgumentException("Invalid date range");
        }
        this.startDate = startDate;
        this.endDate = endDate;
        this.number = number;
    }

    public static Reservation create(Date start, Date end, int number) {
        return new Reservation(start, end, number);
    }
}
