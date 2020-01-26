package com.sparta.engineering50.thanu.java;
import java.util.Arrays;
public class BubbleSort {
    static int temp2;
    static int temp1;
    static int startCounter = 0;
    public static void sorting(int[] array) {
        while (startCounter < array.length) {
            for (int value = 0; value < array.length - 1; value++) {
                if (array[value] <= array[value + 1]) {
                } else {
                    temp1 = array[value + 1];
                    temp2 = array[value];
                    array[value] = temp1;
                    array[value + 1] = temp2;
                }
            }
            startCounter++;
        }
        System.out.println(Arrays.toString(array));
    }
}
