public class Order {
    Integer id;
    Integer userId;
    Integer restaurantId;
    Double amount;
    String foodItem;
    Integer quantity;

    public Order(Integer id, Integer userId, Integer restaurantId, Double amount, String foodItem, Integer quantity) {
        this.id = id;
        this.userId = userId;
        this.restaurantId = restaurantId;
        this.amount = amount;
        this.foodItem = foodItem;
        this.quantity = quantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(String foodItem) {
        this.foodItem = foodItem;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
