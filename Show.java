import java.util.Date;
public class Show {
    private int id;
    private Date showTime;
    private int availabe_Seats;

    private Movie movie;
    private Threater threater;
    public Show(int id, Date showTime,Threater threater, Movie movie) 
    {
        this.id = id;
        this.showTime = showTime;
        this.threater=threater;
        this.movie = movie;
        this.availabe_Seats=threater.getCapacity();
    }
    public int getId()
    {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Date getShowTime() {
        return showTime;
    }
    public void setShowTime(Date showTime) {
        this.showTime = showTime;
    }
    public int getAvailabe_Seats() {
        return availabe_Seats;
    }
    public void setAvailabe_Seats(int availabe_Seats) {
        this.availabe_Seats = availabe_Seats;
    }
    public Movie getMovie() {
        return movie;
    }
    public void setMovie(Movie movie) {
        this.movie = movie;
    }
    public Threater getThreater() {
        return threater;
    }
    public void setThreater(Threater threater) {
        this.threater = threater;
    }
    
}
