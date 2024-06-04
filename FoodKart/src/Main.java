public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");
        FoodKartService foodKartService = new FoodKartService();
        foodKartService.registerUser("Pralove", "M", Long.valueOf("1"), "HSR");
        foodKartService.registerUser("Nitesh", "M", Long.valueOf("2"), "BTM");
        foodKartService.registerUser("Vatsal", "M", Long.valueOf("3"), "BTM");

        foodKartService.loginUser(Long.valueOf("1"));

        foodKartService.registerRestaurant("FoodCourt-1", "BTM,HSR", "NIThali", Double.valueOf(100), 5);
        foodKartService.registerRestaurant("FoodCourt-2", "BTM", "Burger", Double.valueOf(120), 3);

        foodKartService.loginUser(Long.valueOf("2"));

        foodKartService.registerRestaurant("FoodCourt-3", "HSR", "SIThali", Double.valueOf(150), 1);
        foodKartService.loginUser(Long.valueOf("3"));

        foodKartService.showRestaurant("price");

        foodKartService.placeOrder("FoodCourt-1", 2);
        foodKartService.placeOrder("FoodCourt-2", 7);

        foodKartService.rateRestaurant("FoodCourt-3", 3, "Good Food");
        foodKartService.rateRestaurant("FoodCourt-1", 5, "Nice Food");

        foodKartService.showRestaurant("rating");

        foodKartService.loginUser(Long.valueOf("1"));
        foodKartService.updateQuantity("FoodCourt-2", 5);

        foodKartService.placeOrder("FoodCourt-2", 7);

        foodKartService.updateLocation("FoodCourt-2", "BTM,HSR");
        foodKartService.fetchOrderHistory(Long.valueOf("1"));

    }
}