import java.util.Date;

public class Reservation {

    private Date reservationDate;
    private Date startDate;
    private Date endDate;
    private int number;

    public Reservation(Date reservationDate, Date startDate,
                       Date endDate, int number) {

        if (reservationDate == null || startDate == null || endDate == null) {
            throw new IllegalArgumentException("Dates cannot be null");
        }

        if (startDate.after(endDate)) {
            throw new IllegalArgumentException("Invalid date range");
        }

        this.reservationDate = reservationDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.number = number;
    }

    public static Reservation create(Date reservationDate,
                                     Date startDate,
                                     Date endDate,
                                     int number) {
        return new Reservation(reservationDate, startDate, endDate, number);
    }
}
