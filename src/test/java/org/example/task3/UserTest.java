package org.example.task3;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    User user1, user2;

    @BeforeEach
    void setUp(){
        user1 = new User("Иван","123456", true);
        user2 = new User("Петр","795632", false);
    }

    @AfterEach
    void tearDown() {
        user1 = null;
        user2 = null;
    }

    @Test
    @DisplayName("проверка на админство")
    void assertTrueFalseForAdminOfUser() {
        assertTrue(user1.isAdmin);
        assertFalse(user2.isAdmin);
    }

}
