package org.example.task3;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    List<User> data = new ArrayList<>();

    public void addUser(User user) {
        data.add(user);
    }

    public boolean findByName(String username) {
        for (User user : data) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        return false;
    }

    public void unLogin(){
        for (User user : data) {
            if(!user.isAdmin) data.remove(user);
        }
    }
}
