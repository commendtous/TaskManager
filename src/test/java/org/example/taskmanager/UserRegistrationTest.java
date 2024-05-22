package org.example.taskmanager;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class UserRegistrationTest {

    @Test
    public void testUserRegistration() {
        UserRegistration userRegistration = new UserRegistration();
        assertTrue(userRegistration.register("user1", "password1"));
        assertFalse(userRegistration.register("user1", "password1")); // ⽤户
    }
    @Test
    public void testUserLogin() {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.register("user1", "password1");
        assertTrue(userRegistration.login("user1", "password1"));
        assertFalse(userRegistration.login("user1", "wrongpassword"));
    }

}
