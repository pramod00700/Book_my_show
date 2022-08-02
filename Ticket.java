import java.util.Date;
public class Ticket {
    private int id;
    private Date bookingTime;
    private String threater;
    private int numberOfSeats;
    private Show bookshow;
    public Ticket(int id, Date bookingTime, String threater, int numberOfSeats, Show bookshow) {
        this.id = id;
        this.bookingTime = bookingTime;
        this.threater = threater;
        this.numberOfSeats = numberOfSeats;
        this.bookshow = bookshow;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Date getBookingTime() {
        return bookingTime;
    }
    public void setBookingTime(Date bookingTime) {
        this.bookingTime = bookingTime;
    }
    public String getThreater() {
        return threater;
    }
    public void setThreater(String threater) {
        this.threater = threater;
    }
    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
    public Show getBookshow() {
        return bookshow;
    }
    public void setBookshow(Show bookshow) {
        this.bookshow = bookshow;
    }

}
