package homework10;

import java.util.Objects;

public class Movie implements Comparable<Movie>{

    private int id;
    private int year;
    private int month;
    private String genre;
    private double rating;

    public Movie(int id, int year, int month, String genre, double rating) {
        this.id = id;
        this.year = year;
        this.month = month;
        this.genre = genre;
        this.rating = rating;
    }
    public Movie(){}

    @Override
    public String toString() {
        return "Фильм{" +
                "id=" + id +
                ", год издания=" + year +
                ", месяц издания=" + month +
                ", жанр='" + genre + '\'' +
                ", рейтинг=" + rating +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return id == movie.id && year == movie.year &&
                month == movie.month && Double.compare(movie.rating, rating) == 0 &&
                Objects.equals(genre, movie.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, year, month, genre, rating);
    }

    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public String getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public int compareTo(Movie o) {
        return 0;
    }
}
