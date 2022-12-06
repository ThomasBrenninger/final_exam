package fhtw.at.complementary.Service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplementaryServiceTest {

    private final ComplementaryService compService = new ComplementaryService();

    @Test
    void getComplementary() {
        assertEquals ("Green", compService.getComplementary("Red"));
    }
}