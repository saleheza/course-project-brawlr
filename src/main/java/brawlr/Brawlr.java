package brawlr;

import java.util.*;
public class Brawlr {

    public static void main(String[] args){
        //Starts app and displays using brawlr.ViewManager based on log in or register
        //Scanner asks the user to log in, and overload main so you have two main methods.
        //Based on swiperight and swipeleft command inputs, activate the brawlr.UserManager's swiperight and swipeleft methods.

        Scanner in = new Scanner(System.in);
        System.out.println("Do you have an account with us? (Type 0 for yes, 1 for no)");
        String response = in.nextLine();
        if (response == "0"){
            ViewManager.displayLogin();
        }
        else{
            ViewManager.displayUserCreation();
        }
        ViewManager.displayCard();
        //calls brawlr.InputManager for swipes
        //calls brawlr.LocationManager for nearest gym location
    }
}
