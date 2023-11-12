package org.example.task1;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TaskOneTest {

    @Test
    @DisplayName("проверка метода на True и False")
    void evenOddNumber(){
        assertTrue(TaskOne.evenOddNumber(2));
        assertFalse(TaskOne.evenOddNumber(3));
    }
}
