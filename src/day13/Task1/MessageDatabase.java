package day13.Task1;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {

    public static List<Message> messages = new ArrayList<>();

    public static void addMessage(User sender, User recipient, String text){

        messages.add(new Message(sender, recipient, text));

    }

    public static void showChatHistory(User sender, User recipient){


        for (Message message: messages) {
            if (
                    (message.getSender().getUsername().equals(sender.getUsername())
                && message.getRecipient().getUsername().equals(recipient.getUsername()))
                ||(message.getSender().getUsername().equals(recipient.getUsername())
                    && message.getRecipient().getUsername().equals(sender.getUsername()))
            ){
                System.out.printf("Sender: %s : text: %s\n", message.getSender(), message.getText());
                System.out.println("-------------------------------------------------");
            }
        }

    }

}
