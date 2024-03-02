package DataStructuresAndAlgorithms.Arrays;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashSet;

public class MaximumSubArraySum {

    @Test
    public void maximumSubArraySum() {
        int[] arr = {1, 8, 30, -5, 20, 7};
        int k = 3, n = arr.length, i = 0, res = 0, sum = 0;
        while (i < n) {
            if (i < k) {
                sum += arr[i];
                res = Math.max(res, sum);
            } else {
                sum = sum + arr[i] - arr[i - k];
                res = Math.max(res, sum);
            }
            i++;
        }
        System.out.println(res);

    }

    public void maximumSubArraySumDistinct() {
        int[] arr = {8,1,8,2,9,9,9};
        int k = 3, n = arr.length, i = 0, res = 0, sum = 0;
        HashSet<Integer> mySet = new HashSet<>();
        while (i < n) {
            if (i < k) {
                if(!mySet.contains(arr[i]))
                    sum+=arr[i];
                mySet.add(arr[i]);
            } else {
                sum = sum + arr[i] - arr[i - k];
                res = Math.max(res, sum);
            }
            i++;
        }
        System.out.println(res);

    }
}
