package com.example;

import java.util.Arrays;

public class App {
    public int[] sortArray(int[] numbers) {
        if (numbers == null) {
            return null;
        }
        int[] sorted = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(sorted);
        return sorted;
    }
}
