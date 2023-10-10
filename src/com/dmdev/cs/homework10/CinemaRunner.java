package homework10;

public class CinemaRunner {

    public static void main(String[] args) {


        Cinema cinema = new Cinema();
        cinema.addMovie(new Movie(2,2000,2,"комедия", 4.4));
        cinema.addMovie(new Movie(21,2023,12,"комедия", 3.4));
        cinema.addMovie(new Movie(32,2009,4,"комедия", 4.2));
        cinema.addMovie(new Movie(52,2000,5,"детектив", 4.1));
        cinema.addMovie(new Movie(26,2020,2,"детектив", 3.7));
        cinema.addMovie(new Movie(27,2005,2,"детектив", 4.8));
        cinema.addMovie(new Movie(42,2023,11,"драма", 3.5));
        cinema.addMovie(new Movie(22,2000,3,"драма", 4.7));
        cinema.addMovie(new Movie(12,2020,2,"драма", 4.9));
        cinema.addMovie(new Movie(127,2020,2,"драма", 4.9));
        cinema.addMovie(new Movie(126,2020,2,"драма", 4.7));
        cinema.addMovie(new Movie(124,2020,2,"драма", 4.3));
        cinema.addMovie(new Movie(122,2020,2,"драма", 4.8));

       System.out.println(cinema.listMap);
        System.out.println("\n\n");
        System.out.println("Получение фильмов по году:");
        System.out.println();
        System.out.println(cinema.getAllFilmsOfYear(2000));
        System.out.println();
        System.out.println();
        System.out.println("Получение фильмов по году и месяцу:");
        System.out.println();
        System.out.println(cinema.getAllFilmsOfYearOfMonth(2020, 3));
        System.out.println("\n\n");
        System.out.println("Получение фильмов по жанру:");
        System.out.println();
        System.out.println(cinema.getAllFilmsOfGenre("ужасы"));
        System.out.println("Получение ТОП-10 фильмов по убыванию:");
        System.out.println();
        System.out.println();
        System.out.println(cinema.getFilmsOfRating());
        System.out.println("\n\n");

    }
}
