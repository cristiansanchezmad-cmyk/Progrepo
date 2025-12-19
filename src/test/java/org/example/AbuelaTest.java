package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AbuelaTest {


    @Test
    void encajan() {
        assertAll(
                () -> assertTrue(Abuela.encajan(
                        new int[]{1,2,3,4,5,6},
                        new int[]{6,5,4,3,2,1}
                )),
                () -> assertFalse(Abuela.encajan(
                        new int[]{1,2,3,4,5,6},
                        new int[]{6,5,4,3,2,2}
                )),
                () -> assertTrue(Abuela.encajan(
                        new int[]{0,0,0,0,0,0},
                        new int[]{0,0,0,0,0,0}
                ))
        );

    }



}