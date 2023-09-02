package org.example;

import java.util.ArrayList;

public class UserManager {
    public ArrayList<User> users = new ArrayList<User>();
    public int getOldestUser() {
        int maxAge = 0;
        for (User user: users) {
            if (user.getAge() > maxAge) {
                maxAge = user.getAge();
            }
        }
        return maxAge;
    }
}
