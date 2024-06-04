import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    int id;
    String restaurantName;
    List serviceablePincodes;
    String food_item_name;
    Double price;
    int initialQuantity;
    Integer restaurantOwner;
    Integer rating;
    List<Review> reviews;

    public Restaurant(int id, String restaurantName, List serviceablePincodes, String food_item_name, Double price, int initialQuantity, Integer restaurantOwner) {
        this.id = id;
        this.restaurantName = restaurantName;
        this.serviceablePincodes = serviceablePincodes;
        this.food_item_name = food_item_name;
        this.price = price;
        this.initialQuantity = initialQuantity;
        this.restaurantOwner = restaurantOwner;
        reviews = new ArrayList<>();
        rating = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public List getServiceablePincodes() {
        return serviceablePincodes;
    }

    public void setServiceablePincodes(List serviceablePincodes) {
        this.serviceablePincodes = serviceablePincodes;
    }

    public String getFood_item_name() {
        return food_item_name;
    }

    public void setFood_item_name(String food_item_name) {
        this.food_item_name = food_item_name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getInitialQuantity() {
        return initialQuantity;
    }

    public void setInitialQuantity(int initialQuantity) {
        this.initialQuantity = initialQuantity;
    }

    public int getRestaurantOwner() {
        return restaurantOwner;
    }

    public void setRestaurantOwner(int restaurantOwner) {
        this.restaurantOwner = restaurantOwner;
    }

    public void setRestaurantOwner(Integer restaurantOwner) {
        this.restaurantOwner = restaurantOwner;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }
}
