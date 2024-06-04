import java.util.Comparator;

public class SortByPrice implements Comparator<Restaurant> {

    @Override
    public int compare(Restaurant o1, Restaurant o2) {
        return o2.getPrice().compareTo(o1.getPrice());
    }
}
