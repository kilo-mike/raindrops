package com.sparta.jakub;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class RaindropsTests {

    Raindrops raindrops = new Raindrops();

    @Nested
    @DisplayName("Testing for single return")
    class testingForSingleReturn {

        @ParameterizedTest
        @ValueSource(ints = {-27, -9, -6, -3, 3, 6, 9, 27})
        @DisplayName("Testing  output return only Pling")
        void testingOutputReturnOnlyPling(int number) {
            Assertions.assertEquals("Pling", raindrops.plingPlangPlong(number));
        }

        @ParameterizedTest
        @ValueSource(ints = {-20, -10, -5, 5, 10, 20})
        @DisplayName("Testing output return only Plang")
        void testingOutputReturnOnlyPlang(int number) {
            Assertions.assertEquals("Plang", raindrops.plingPlangPlong(number));
        }
    }
}
