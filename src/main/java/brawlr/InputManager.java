package brawlr;

import java.util.Scanner;
public class InputManager {
    //new user creation with User calls
    //swipe functionality

    /**
     * Takes user input to create a new instance of User
     */

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

    /**
     * Takes user input to log in to an existing account (instance of user already in the database)
     */
    public static void sendLoginInput(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your username:");
        String userId = in.nextLine();
        System.out.println("Please enter your password:");
        String pass = in.nextLine();

        //brawlr.brawlr.InputManager call for existing brawlr.User
    }
}
