class Movie
{
    private String name;
    private float ratings;
    private Languages lng;
    private Genre genre;
    public Movie(String name, Languages lng, Genre genre) {
        this.name = name;
        this.lng = lng;
        this.genre = genre;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getRatings() {
        return ratings;
    }
    public void setRatings(float ratings) {
        this.ratings = ratings;
    }
    public Languages getLng() {
        return lng;
    }
    public void setLng(Languages lng) {
        this.lng = lng;
    }
    public Genre getGenre() {
        return genre;
    }
    public void setGenre(Genre genre) {
        this.genre = genre;
    }
    
}