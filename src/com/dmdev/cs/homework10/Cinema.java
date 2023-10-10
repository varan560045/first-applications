package homework10;

import java.util.*;

public class Cinema{

    Map<Integer, List<Movie>> listMap = new LinkedHashMap<>();



    public  void addMovie(Movie movie) {
        if (listMap.containsKey(movie.getYear())) {
            listMap.get(movie.getYear()).add(movie);
        } else {
            List<Movie> newMovieList = new ArrayList<>();
            newMovieList.add(movie);
            listMap.put(movie.getYear(), newMovieList);
        }
    }

    public  List<Movie> getAllFilmsOfYear(int year){
        if (!listMap.containsKey(year)){
            System.out.println("Фильмов такого года нет");
        }
        return listMap.get(year);
    }

    public List<Movie> getAllFilmsOfYearOfMonth(int year, int month){
        List<Movie> allFilmsOfYear = getAllFilmsOfYear(year);
        List<Movie> result = new ArrayList<>();
        for (Movie movie : allFilmsOfYear) {
            if (movie.getMonth() == month){
                result.add(movie);
            }
        }
        if (result.size() == 0){
            System.out.println("фильмов выпуска такого месяца нет");
        }
        return result; // возврат листа либо пустого листа
    }

    public List<Movie> getAllFilmsOfGenre(String genre){
        Collection<List<Movie>> values = listMap.values();
        List<Movie> result = new ArrayList<>();
        for (List<Movie> listMovies : values) {
            for (Movie movie : listMovies) {
                if (movie.getGenre().equals(genre)){
                    result.add(movie);
                }
            }
        }
        if (result.size() == 0){
            System.out.println("фильмов такого жанра нет");
        }
        return result;
    }

    public List<Movie> getFilmsOfRating(){
        Collection<List<Movie>> values = listMap.values();
        List<Movie> result = new ArrayList<>();
        for (List<Movie> listMovies : values) {
            result.addAll(listMovies);
        }
        result.sort(new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                if(o1.getRating() < o2.getRating()){
                    return 1;
                } else if (o1.getRating() == o2.getRating()) {
                    return 0;
                } else {
                    return -1;

                }
            }
        });
        return result.subList(0,10);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cinema cinema = (Cinema) o;
        return Objects.equals(listMap, cinema.listMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listMap);
    }

    public Map<Integer, List<Movie>> getListMap() {
        return listMap;
    }
}
