package org.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

public class UserTest {
    static UserManager userManager;
    @BeforeAll
    public static void initializeUsers() {
        userManager = new UserManager();
        userManager.users.add(new User("Dasha", 28));
        userManager.users.add(new User("Oleg", 40));
        userManager.users.add(new User("Masha", 2));
        userManager.users.add(new User("Twix", 3));
    }
    @Test
    public void getOldestUser() {
        Assertions.assertEquals(userManager.getOldestUser(), 40);
    }
}
