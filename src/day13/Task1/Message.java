package day13.Task1;

import java.util.Date;

public class Message {

    private User sender;
    private User recipient;
    private String text;
    private Date date;

    public Message(User sender, User recipient, String message) {
        this.sender = sender;
        this.recipient = recipient;
        this.text = message;
        this.date = new Date();
    }

    public User getSender() {
        return sender;
    }

    public User getRecipient() {
        return recipient;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }

    public String toString(){
        return String.format("FROM: %s \n"
        + "TO: %s \n"
        + "ON: %s \n"
        + "%s", sender, recipient, date, text);
    }
}
