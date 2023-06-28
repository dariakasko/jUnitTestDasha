package org.example;

import javax.xml.soap.SAAJResult;
import java.util.ArrayList;
import java.util.Comparator;

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
