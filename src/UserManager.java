import java.util.HashMap;

public class UserManager {
    private HashMap<String, User> users;

    public UserManager() {
        users = new HashMap<>();
    }

    public void addUser(User user) {
        users.put(user.getUserId(), user);
        System.out.println("User added: " + user.getUsername());
    }

    public User getUser(String userId) {
        return users.get(userId);
    }

    public void removeUser(String userId) {
        users.remove(userId);
        System.out.println("User removed: " + userId);
    }

    public void displayAllUsers() {
        for (User user : users.values()) {
            System.out.println(user);
        }
    }
}