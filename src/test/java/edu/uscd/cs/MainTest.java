package edu.uscd.cs;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void main() {
        Main.main(new String[]{"arg1","arg2"});
        assertTrue(true);
    }
}