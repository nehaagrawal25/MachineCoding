import java.util.List;

public class FoodKartService {

    private Integer loggedInUser;

    UserService userService;
    RestaurantService restaurantService;
    FoodKartService() {
        this.userService = new UserService();
        this.restaurantService = new RestaurantService();
    }

    public void registerUser(String name, String gender, Long phoneNumber, String pincode) {
        userService.registerUser(name, gender, phoneNumber, pincode);
    }

    public void loginUser(Long phoneNo) {
        User user = userService.getUserDetailsByPhoneNo(phoneNo);

        loggedInUser = user.getId();
    }

    public void registerRestaurant(String restaurantName,
                                   String serviceablePincodes, String food_item_name, Double price, int initialQuantity) {
        restaurantService.registerRestaurant(restaurantName, serviceablePincodes, food_item_name, price, initialQuantity, loggedInUser);
    }

    public void updateQuantity(String name, int quantity) {
        restaurantService.updateQuantity(name, quantity, loggedInUser.intValue());
    }

    public void rateRestaurant(String name, Integer rating, String comment) {

        restaurantService.rateRestaurant(name, rating, comment, loggedInUser);
    }

    public void showRestaurant(String showBy) {
        User user = userService.getUserDetails(loggedInUser);
        restaurantService.showRestaurant(showBy, user);
    }

    public void placeOrder(String restaurant, Integer quantity) {
        User user = userService.getUserDetails(loggedInUser);
        Order order = restaurantService.placeOrder(restaurant, quantity, user);
        if(order != null) {
            List<Order> orders = user.getOrders();
            orders.add(order);
            System.out.println("Order Placed Successfully");
        }

    }

    public void updateLocation(String restaurantName, String pincodes) {
        restaurantService.updateRestaurant(restaurantName, pincodes);
    }


    public void fetchOrderHistory(Long userPhoneNo) {
        userService.fetchOrderHistory(userPhoneNo);
    }
}
