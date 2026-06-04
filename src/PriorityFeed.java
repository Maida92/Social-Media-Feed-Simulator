import java.util.PriorityQueue;
import java.util.Comparator;

public class PriorityFeed {
    private PriorityQueue<Post> priorityFeed;

    public PriorityFeed() {
        priorityFeed = new PriorityQueue<>(
            Comparator.comparingInt(p -> -p.getLikes())
        );
    }

    public void addPost(Post post) {
        priorityFeed.add(post);
        System.out.println("Post added to priority feed!");
    }

    public void displayPriorityFeed() {
        System.out.println("--- Priority Feed ---");
        PriorityQueue<Post> temp = new PriorityQueue<>(priorityFeed);
        while (!temp.isEmpty()) {
            System.out.println(temp.poll());
        }
    }
}