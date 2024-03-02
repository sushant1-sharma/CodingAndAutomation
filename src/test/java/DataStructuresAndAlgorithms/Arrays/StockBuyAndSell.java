package DataStructuresAndAlgorithms.Arrays;

import org.testng.annotations.Test;

public class StockBuyAndSell {

    @Test
    public void stockBuyAndSell() {
        int arr[] = {1, 5, 3, 8, 12, 11, 16};
        int n = arr.length;
        //geegsforgeeks code
        int profit = 0;

        for(int i = 1; i < n; i++)
        {
            if(arr[i] > arr[i - 1])
                profit += arr[i] - arr[i -1];
        }

        System.out.println(profit);
    }
}
