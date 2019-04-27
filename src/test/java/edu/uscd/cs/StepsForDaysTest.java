package edu.uscd.cs;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StepsForDaysTest {
    StepsForDays sfd;

    @BeforeEach
    void setUp() {
        sfd = new StepsForDays(5000);
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void inputSteps() {
    }

    @Test
    void addSteps() {
        sfd.inputSteps(2000);
        sfd.addSteps(1000);
        int steps = sfd.get();
        assertEquals(steps,1000+2000);
    }

    @Test
    void clearSteps() {
        sfd.clearSteps();
        int steps = sfd.get();
        assertEquals(steps, 0);
    }

    @Test
    void get() {
        int steps = sfd.get();
        assertEquals(steps, 0);

        sfd.inputSteps(2000);
        steps = sfd.get();
        assertEquals(steps, 2000);
    }

    @Test
    void metGoal() {
        boolean result = sfd.metGoal();
        assertFalse(result);
        sfd.inputSteps(2000);
        result = sfd.metGoal();
        assertFalse(result);
        sfd.inputSteps(5000);
        result = sfd.metGoal();
        assertTrue(result);
        sfd.inputSteps(5000+1);
        result = sfd.metGoal();
        assertTrue(result);

    }
}