package fhtw.at.complementary.Controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplementaryControllerTest {

    @Test
    void calculateComplementary() {
        ComplementaryController controller = new ComplementaryController();

        assertEquals("Yellow", controller.calculateComplementary("Purple"));
    }



}