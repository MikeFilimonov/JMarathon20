package day13.Task1;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String username;
    private List<User> subscriptions;

    public String getUsername() {
        return username;
    }

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public void subscribe(User newFriend){

        if (!subscriptions.contains(newFriend))
            subscriptions.add(newFriend);

    }

    public boolean isSubscribed(User user){

        for (User subscribed: subscriptions) {
            if(subscribed.getUsername().equals(user.getUsername()))
                return true;
        }

        return false;

    }

    public boolean isFriend(User user){
         return user.isSubscribed(this) && this.isSubscribed(user);
    }

    public void sendMessage(User addressee, String text){
        MessageDatabase.addMessage(this, addressee, text);
    }

    @Override
    public String toString() {
        return username;
    }
}
