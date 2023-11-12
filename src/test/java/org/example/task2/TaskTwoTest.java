package org.example.task2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTwoTest {

    @Test
    @DisplayName("проверка метода на True и False")
    void numberInIntervalTrueTest() {
        assertTrue(TaskTwo.numberInInterval(27));
        assertFalse(TaskTwo.numberInInterval(15));
    }
}