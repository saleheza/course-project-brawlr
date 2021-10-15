package brawlr;

import brawlr.ViewManager;

import javax.swing.text.View;
import java.util.*;
public class Brawlr {

    public static void main(String[] args){
        /*
        Starts app and displays using ViewManager based on log in or register
        Scanner asks the user to log in, and overload main so you have two main methods.
        Based on swiperight and swipeleft command inputs, activate the UserManager's swiperight and swipeleft methods.
        * */


        Scanner in = new Scanner(System.in);
        boolean loop = true;
        int count = 0;
        while (loop) {
            count += 1;
            System.out.println("Do you have an account with us? (Type 1 for yes, 0 for no)");
            String response = in.nextLine();
            if (response.equals("1")) {
                ViewManager.displayLogin();
                loop = false;
            } else if (response.equals("0")) {
                ViewManager.displayUserCreation();
                loop = false;
            } else {
                System.out.println("Invalid response");
            }
            if (count >= 5){
                System.out.println("Are you a monkey banging on a keyboard? (Type 1 to verify humanity)");
                String monkey_response = in.nextLine();
                if (monkey_response != "1"){
                    System.out.println("Monkeys have a higher strength to body-weight ratio than humans, " +
                            "giving them an unfair advantage in combat.");
                    break;
                }
            }

        }
        ViewManager.displayCard();
        //calls brawlr.InputManager for swipes
        //calls LocationManager for nearest gym location
    }
}
