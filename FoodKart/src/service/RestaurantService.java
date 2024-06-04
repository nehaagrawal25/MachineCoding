import java.util.*;

public class RestaurantService {

    //<restaurantName, Restaurant>
    Map<String, Restaurant> restaurantMap;

    RestaurantService() {
        restaurantMap = new HashMap<>();
    }
    public void registerRestaurant(String restaurantName,
                                   String serviceablePincodes, String food_item_name, Double price, int initialQuantity, Integer loggedInUser) {
        int id = IdGenerator.getId();
        List<String> pinCodes = Arrays.asList(serviceablePincodes.split(","));
        Restaurant restaurant = new Restaurant(id, restaurantName, pinCodes, food_item_name, price, initialQuantity, loggedInUser);
        restaurantMap.put(restaurantName, restaurant);
    }

    public void updateQuantity(String restaurantName, int quantity, int userId) {
        Restaurant restaurant = restaurantMap.get(restaurantName);
        if(restaurant.getRestaurantOwner() == userId) {
            restaurant.setInitialQuantity(restaurant.getInitialQuantity() + quantity);
        }
        else {
            //not the owner
        }
    }

    public void rateRestaurant(String name, Integer rating, String comment, Integer loggedInUser) {
        Review review = new Review(IdGenerator.getId(), loggedInUser, name, rating, comment);
        Restaurant restaurant = restaurantMap.get(name);
        restaurant.getReviews().add(review);
        //restaurant.setRating(1);
        Integer currRating = restaurant.getRating();
        restaurant.setRating((currRating + rating) / 2);

    }

    public List<Restaurant> showRestaurant(String showBy, User user) {
        System.out.println(restaurantMap.size());
        String userPincode = user.getPincode();
        List<Restaurant> restaurants = new ArrayList<>();
        for(Map.Entry<String, Restaurant> entry : restaurantMap.entrySet()) {
            for(Object pin : entry.getValue().getServiceablePincodes()) {
                if(userPincode.equals((String)pin)) {
                    restaurants.add(entry.getValue());
                }
            }
        }
        if(showBy.equals("price")) {
            Collections.sort(restaurants, new SortByPrice());
        }
        else {
            Collections.sort(restaurants, new SortByRating());
        }
        for(Restaurant r : restaurants) {
            System.out.println(r.getRestaurantName() + ", " + r.getFood_item_name());
        }
        return restaurants;

    }

    public Order placeOrder(String restaurant, Integer quantity, User loggedInUser) {
        Restaurant restaurant1 = restaurantMap.get(restaurant);
        if(restaurant1.getInitialQuantity() < quantity) {
            System.out.println("Cannot place order for " + restaurant);
            return null;
        }
        else {
            Order order = new Order(IdGenerator.getId(), loggedInUser.getId(), restaurant1.getId(), restaurant1.getPrice(), restaurant1.getFood_item_name(), quantity);
            restaurant1.setInitialQuantity(restaurant1.getInitialQuantity() - quantity);
            //order placed
            return order;
        }
    }

    public void updateRestaurant(String restaurantName, String pincodes) {
        List<String> newList= Arrays.asList(pincodes.split(","));
        Restaurant restaurant = restaurantMap.get(restaurantName);
        restaurant.setServiceablePincodes(newList);
    }
}
