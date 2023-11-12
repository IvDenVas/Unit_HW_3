package org.example.task3;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {
    UserRepository userRepository;
    User user1;
    User user2;
    User user3;

    @BeforeEach
    void setUp() {
        userRepository = new UserRepository();
        user1 = new User("Mike", "1234560",true);
        user2 = new User("David", "159263", false);
        user3 = new User("Oleg","485769", true);
        userRepository.addUser(user1);
        userRepository.addUser(user2);
        userRepository.addUser(user3);
    }

    @AfterEach
    void tearDown() {
        userRepository = null;
        user1 = null;
        user2 = null;
        user3 = null;
    }

    @Test
    @DisplayName("Проверка на добавление нового User")
    void addUser() {
        User user = new User("Test", "0000000", false);
        userRepository.addUser(user);
        assertTrue(userRepository.findByName("Test"));
    }

    @Test
    @DisplayName("Проверка на поиск по имени")
    void findByName() {
        assertTrue(userRepository.findByName("Mike"));
        assertFalse(userRepository.findByName("Petr"));
    }

    @Test
    @DisplayName("Проверка на разлогирование")
    void unLogin() {
        userRepository.unLogin();
        assertFalse(userRepository.findByName("David"));
    }
}