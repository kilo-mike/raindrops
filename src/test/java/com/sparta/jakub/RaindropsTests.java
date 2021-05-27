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

        @ParameterizedTest
        @ValueSource(ints = {-28, -14, -7, 7, 14, 28})
        @DisplayName("Testing output return only Plong")
        void testingOutputReturnOnlyPlong(int number) {
            Assertions.assertEquals("Plong", raindrops.plingPlangPlong(number));
        }
    }

    @Nested
    @DisplayName("Testing for multiple return")
    class testingForMultipleReturn {


        @ParameterizedTest
        @ValueSource(ints = {-90, -45, -15, 15, 45, 90})
        @DisplayName("Testing output return PlingPlang")
        void testingOutputReturnPlingPlang(int number) {
            Assertions.assertEquals("PlingPlang", raindrops.plingPlangPlong(number));
        }

        @ParameterizedTest
        @ValueSource(ints = {-84, -42, -21, 21, 42, 84})
        @DisplayName("Testing output return PlingPlong")
        void testingOutputReturnPlingPlong(int number) {
            Assertions.assertEquals("PlingPlong", raindrops.plingPlangPlong(number));
        }

        @ParameterizedTest
        @ValueSource(ints = {-70, -35, 35, 70})
        @DisplayName("Testing output return PlangPlong")
        void testingOutputReturnPlangPlong(int number) {
            Assertions.assertEquals("PlangPlong", raindrops.plingPlangPlong(number));
        }

        @ParameterizedTest
        @ValueSource(ints = {-210, 105, 210, 420})
        @DisplayName("Testing output return PlingPlangPlong")
        void testingOutputReturnPlingPlangPlong(int number) {
            Assertions.assertEquals("PlingPlangPlong", raindrops.plingPlangPlong(number));
        }
    }

    @Nested
    @DisplayName("Testing for numbers without any factor of 3, 5, 7")
    class testingForNumbersWithoutAnyFactor {


        @ParameterizedTest
        @ValueSource(ints = {-68, -227, -331})
        @DisplayName("Testing output return String value of number for numbers lower than 0")
        void testingOutputReturnStringValueOfNumberForNumbersLowerThan0(int number) {
            Assertions.assertEquals(String.valueOf(number), raindrops.plingPlangPlong(number));
        }
    }
