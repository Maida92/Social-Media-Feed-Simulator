import java.util.HashMap;
import java.util.HashSet;

public class FollowManager {
    private HashMap<String, HashSet<String>> followMap;

    public FollowManager() {
        followMap = new HashMap<>();
    }

    public void follow(String userId, String targetId) {
        followMap.putIfAbsent(userId, new HashSet<>());
        followMap.get(userId).add(targetId);
        System.out.println(userId + " followed " + targetId);
    }

    public void unfollow(String userId, String targetId) {
        if (followMap.containsKey(userId)) {
            followMap.get(userId).remove(targetId);
            System.out.println(userId + " unfollowed " + targetId);
        }
    }

    public void displayFollowing(String userId) {
        System.out.println(userId + " is following: " +
            followMap.getOrDefault(userId, new HashSet<>()));
    }
}