package com.sparta.engineering50.thanu.java;
import java.util.*;
public class MergeSort {
 static int[] Merge_sort(int arrayset[], int length) {
            if (length > 1) {
                int center = length / 2;
                int[] one = Arrays.copyOfRange(arrayset, 0, center);
                one = Merge_sort(one, center);
                int[] second = Arrays.copyOfRange(arrayset, center, length);
                second = Merge_sort(second, length - center);
                arrayset = Merge_arrays(one, second, center, length - center);
            }
            return arrayset;
        }
        static int[] Merge_arrays(int firstset[], int secondset[], int length1, int length2)
        {
            int arr[] = new int[length1 + length2];
            int x = 0, y = 0, z = 0;
            while (y < length1 && z < length2) {
                if (firstset[y] < secondset[z])
                    arr[x++] = firstset[y++];
                else
                    arr[x++] = secondset[z++];
            }
            while (y < length1)
                arr[x++] = firstset[y++];
            while (z < length2)
                arr[x++] = secondset[z++];
            return arr;
        }
}
