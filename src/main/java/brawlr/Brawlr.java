package brawlr;

import brawlr.ViewManager;

import java.util.*;
public class Brawlr {

    public static void main(String[] args){
        //Starts app and displays using ViewManager based on log in or register
        //Scanner asks the user to log in, and overload main so you have two main methods.
        //Based on swiperight and swipeleft command inputs, activate the UserManager's swiperight and swipeleft methods.

        Scanner in = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            System.out.println("Do you have an account with us? (Type 1 for yes, 0 for no)");
            String response = in.nextLine();
            if (response == "1") {
                ViewManager.displayLogin();
                loop = false;
            } else if (response == "0") {
                ViewManager.displayUserCreation();
                loop = false;
            } else {
                System.out.println("The instructions aren't that difficult.");
            }
        }
        ViewManager.displayCard();
        //calls brawlr.InputManager for swipes
        //calls LocationManager for nearest gym location
    }
}
