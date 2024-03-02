package DataStructuresAndAlgorithms.Arrays;

import org.testng.annotations.Test;

import java.util.Arrays;

public class FrequencySortedArray {
    @Test
    public void frequencySortedArray() {
        int[] arr = {1, 1, 1, 2, 3, 3, 5, 5, 8, 8, 8, 9, 9, 10}; // sorted array
        int[] arr1 = {5, 4, 2, 9, 5, 4, 2, 9, 8, 9, 3, 4, 5, 8, 5, 10};
        Arrays.sort(arr1); // We can sort not sorted array and get the frequency of each element
        int n = arr1.length, i = 1, count = 1;
        while (i < n) {
            while (arr1[i] == arr1[i - 1]) {
                count++;
                i++;
            }
            System.out.println(arr1[i - 1] + " " + count);
            count = 1;
            i++;
        }
        System.out.println(arr1[n - 1] + " " + count);
    }
}
