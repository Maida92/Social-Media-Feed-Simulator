import java.util.LinkedList;

public class FeedManager {
    private LinkedList<Post> feed;

    public FeedManager() {
        feed = new LinkedList<>();
    }

    public void addPost(Post post) {
        feed.addFirst(post);
        System.out.println("Post added to feed: " + post);
    }

    public void removePost(String postId) {
        feed.removeIf(post -> post.toString().contains(postId));
        System.out.println("Post removed: " + postId);
    }

    public void displayFeed() {
        System.out.println("--- Your Feed ---");
        for (Post post : feed) {
            System.out.println(post);
        }
    }
}