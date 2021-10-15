import java.util.Scanner;
public class InputManager {
    //new user creation with User calls
    //swipe functionality
    public static void sendUserCreationInput(){
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter your username:");
        String userId = in.nextLine();

        System.out.println("Please enter your password:");
        String pass = in.nextLine();

        System.out.println("Please attach any pictures for your profile:");
        String pictures = in.nextLine();

        System.out.println("Please enter a biography:");
        String bio = in.nextLine();

        System.out.println("Please enter your stats (height, weight, etc.):");
        String stats = in.nextLine();

        System.out.println("Please enter a controversial opinion:");
        String opinion = in.nextLine();
    }
}
