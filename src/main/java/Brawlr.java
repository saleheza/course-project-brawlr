
public class Brawlr {

    public static void main(String[] args) {
        // TODO: 10/11/2021
    }

    public static void swipeRight(User user1, User user2){
        UserManager.addLike(user1, user2);
    }

    public static void swipeLeft(User user1, User user2){
        UserManager.addSeenUser(user1, user2);
    }
}
