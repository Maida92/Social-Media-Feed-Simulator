import java.util.LinkedList;

public class Post {
    private String postId;
    private String content;
    private int likes;
    private String authorId;
    private LinkedList<String> comments;

    public Post(String postId, String content, String authorId) {
        this.postId = postId;
        this.content = content;
        this.authorId = authorId;
        this.likes = 0;
        this.comments = new LinkedList<>();
    }

    public void addLike() { likes++; }
    public void addComment(String comment) { comments.add(comment); }

    public String toString() {
        return "Post[" + postId + "]: " + content + " | Likes: " + likes;
    }
}