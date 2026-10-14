package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testSortUnsortedArray() {
        App app = new App();
        int[] input = {5, 2, 9, 1, 3};
        int[] expected = {1, 2, 3, 5, 9};
        assertArrayEquals(expected, app.sortArray(input));
    }

    @Test
    public void testSortAlreadySortedArray() {
        App app = new App();
        int[] input = {1, 2, 3};
        int[] expected = {1, 2, 3};
        assertArrayEquals(expected, app.sortArray(input));
    }

    @Test
    public void testSortNegativeNumbers() {
        App app = new App();
        int[] input = {-1, -5, 0, 2};
        int[] expected = {-5, -1, 0, 2};
        assertArrayEquals(expected, app.sortArray(input));
    }
}
