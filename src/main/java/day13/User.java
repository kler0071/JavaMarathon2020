package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    List<User> subscriptions;

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user) {
        this.subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        for (int i = 0; i < subscriptions.size(); i++) {
            if (subscriptions.contains(user))
                return true;
        }
        return false;
    }

    public boolean isFriend(User user) {
        if (this.isSubscribed(user) & user.isSubscribed(this)) {
            return true;
        } else {
            return false;
        }
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.sendMessage(this, user, text);
    }

    @Override
    public String toString() {
        return username;
    }
}
