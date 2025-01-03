public class UserLogin {
    // TODO: Store username and password

    public static boolean login(String username, String password) {
        // TODO: Implement this method
    }

    public static void main(String[] args) {
        System.out.println("Login success: " + login("user1", "password1")); // should be true
        System.out.println("Login success: " + login("user3", "password3")); // should be false
    }
}
