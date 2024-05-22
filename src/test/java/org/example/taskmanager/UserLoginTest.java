package org.example.taskmanager;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class UserLoginTest {
    @Test
    public void testUserLogin() {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.register("user1", "password1");
        UserLogin userLogin = new UserLogin(userRegistration);
        assertTrue(userLogin.login("user1", "password1"));
        assertFalse(userLogin.login("user1", "wrongpassword"));
    }
}
