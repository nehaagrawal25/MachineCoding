import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserService {

    //<phoneNo, userId>
    Map<Long, Integer> phoneNumberMap;

    //<userId, User>
    Map<Integer, User> userMap;

    UserService() {
        phoneNumberMap = new HashMap<>();
        userMap = new HashMap<>();
    }

    public User registerUser(String name, String gender, Long phoneNumber, String pincode) {
        Integer userId = IdGenerator.getId();
        User user = new User(userId, name, gender, phoneNumber, pincode);
        if(phoneNumberMap.containsKey(phoneNumber)) {
            System.out.println("Phone number should be unique");
            return null;
        }
        phoneNumberMap.put(phoneNumber, userId);
        userMap.put(userId, user);
        return user;
    }

    public User getUserDetails(Integer userId) {
        return userMap.get(userId);
    }

    public void addOrder(Order order, User user) {

    }

    public User getUserDetailsByPhoneNo(Long phoneNo) {
        Integer userId = phoneNumberMap.get(phoneNo);
        return userMap.get(userId);
    }

    public void fetchOrderHistory(Long userPhoneNo) {
        User user = userMap.get(phoneNumberMap.get(userPhoneNo));
        for(Order order : user.getOrders()) {
            System.out.println(order.getFoodItem() + " " + order.getQuantity());
        }
    }
}
