public class Main {
    public static void main(String[] args) {
        System.out.println("=== Social Media Feed Simulator ===");

       
        UserManager userManager = new UserManager();
        User user1 = new User("U1", "Maida", "maida@email.com");
        User user2 = new User("U2", "Sehar", "sehar@email.com");
        userManager.addUser(user1);
        userManager.addUser(user2);

        
        FeedManager feedManager = new FeedManager();
        Post post1 = new Post("P1", "Hello World!", "U1");
        Post post2 = new Post("P2", "Java is awesome!", "U2");
        feedManager.addPost(post1);
        feedManager.addPost(post2);


        feedManager.displayFeed();

        
        FollowManager followManager = new FollowManager();
        followManager.follow("U1", "U2");
        followManager.displayFollowing("U1");

        
        NotificationQueue nq = new NotificationQueue();
        nq.addNotification("Sehar liked your post!");
        nq.addNotification("You have a new follower!");
        nq.displayAll();
        nq.processNotification();

        
        post1.addLike();
        post1.addLike();
        post2.addLike();
        PriorityFeed pf = new PriorityFeed();
        pf.addPost(post1);
        pf.addPost(post2);
        pf.displayPriorityFeed();

        System.out.println("=== Simulation Complete ===");
    }
}