package DataStructuresAndAlgorithms.Arrays;

import org.testng.annotations.Test;

public class MaximumConsecutiveOnes {

    @Test
    public void maximumConsecutiveOnes() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1};
        int n = arr.length, count = 0, res = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count++;
                continue;
            }
            res = Math.max(res, count);
            count=0;
        }
        res = Math.max(res, count);
        System.out.println(res);
    }
}
