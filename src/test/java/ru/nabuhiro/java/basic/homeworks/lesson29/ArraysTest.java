package ru.nabuhiro.java.basic.homeworks.lesson29;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullSource;

import java.util.stream.Stream;

public class ArraysTest {
    ArraysMethods array1;

    @BeforeEach
    void before() {
        array1 = new ArraysMethods();
    }

    static Stream<Arguments> arrayAfterOne() {
        return Stream.of(
                Arguments.of(new int[]{2, 2}, new int[]{1, 2, 1, 2, 2}),
                Arguments.of(new int[]{2, 2}, new int[]{2, 2, 2, 2})
        );
    }

    @ParameterizedTest
    @MethodSource("arrayAfterOne")
    void arrayAfterOne(int[] expect, int[] value) {
        Assertions.assertArrayEquals(expect, array1.arrayAfterOne(value));
    }

    static Stream<Arguments> arrayAfterOneException() {
        return Stream.of(
                Arguments.of((Object) new int[]{2, 2, 2, 2})
        );
    }

    @ParameterizedTest
    @MethodSource("arrayAfterOneException")
    void arrayAfterOneException(int[] value) {
        Assertions.assertThrows(RuntimeException.class, () -> array1.arrayAfterOne(value));
    }

    static Stream<Arguments> checkOneAndTwoTrue() {
        return Stream.of(
                Arguments.of(new int[]{1, 2}),
                Arguments.of(new int[]{1, 1}),
                Arguments.of(new int[]{1, 3}),
                Arguments.of(new int[]{1, 2, 2, 1})
        );
    }

    @ParameterizedTest
    @MethodSource("checkOneAndTwoTrue")
    void checkOneAndTwoTrue(int[] array) {
        Assertions.assertTrue(array1.checkOneAndTwo(array));
    }

    static Stream<Arguments> checkOneAndTwoFalse() {
        return Stream.of(
                Arguments.of(new int[]{1, 2}),
                Arguments.of(new int[]{1, 1}),
                Arguments.of(new int[]{1, 3}),
                Arguments.of(new int[]{1, 2, 2, 1})
        );
    }

    @ParameterizedTest
    @MethodSource("checkOneAndTwoFalse")
    @NullSource
    void checkOneAndTwoFalse(int[] array) {
        Assertions.assertFalse(array1.checkOneAndTwo(array));
    }
}
