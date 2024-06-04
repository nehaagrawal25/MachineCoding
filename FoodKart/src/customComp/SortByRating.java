import java.util.Comparator;

public class SortByRating implements Comparator<Restaurant> {

    @Override
    public int compare(Restaurant o1, Restaurant o2) {
        return o2.getRating().compareTo(o1.getRating());
    }
}
