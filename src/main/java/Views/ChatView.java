package Views;
import java.util.*;
import brawlr.*;
public class ChatView {

    public static void displayChat(User currentUser, User match) {
        ChatManager userCM = currentUser.getuserCM();
        if (!userCM.conversations.containsKey(match)){
            userCM.createChat(match);
        }
        Chat chat = userCM.conversations.get(match);
        Scanner in = new Scanner(System.in);
        String response = "1";
        List<String> log = chat.DisplayLog();
        while(response.equals("1")){
            System.out.println("Would you like to send a message? (Type 0 for no and 1 for yes)");
            response = in.nextLine();
            if (response.equals("1")) {
                System.out.println("Please type the message you would like to send:");
                String msg = in.nextLine();
                chat.SendMessage(currentUser, match, msg, true);
            }
            for (int i = 0; i < log.size(); i++){
                System.out.println(log.get(i));
            }
        }
    }
}

