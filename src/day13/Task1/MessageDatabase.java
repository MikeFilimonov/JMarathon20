package day13.Task1;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {

    public static List<Message> messages = new ArrayList<>();

    public static void addMessage(User sender, User recipient, String text){

        messages.add(new Message(sender, recipient, text));

    }

    public static void showChatHistory(User person1, User person2){


        for (Message message: messages) {
            if (
                    (message.getSender().getUsername().equals(person1.getUsername())
                && message.getRecipient().getUsername().equals(person2.getUsername()))
                ||(message.getSender().getUsername().equals(person2.getUsername())
                    && message.getRecipient().getUsername().equals(person1.getUsername()))
            ){
                System.out.printf("Sender: %s : text: %s\n", message.getSender(), message.getText());
                System.out.println("-------------------------------------------------");
            }
        }

    }

}
