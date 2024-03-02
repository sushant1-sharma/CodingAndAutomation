package DataStructuresAndAlgorithms.Arrays;

import org.testng.annotations.Test;

public class MaximumDifferenceProblem {

    @Test
    public void maximumDifferenceProblem(){
        int[] arr =  {3,2,10,6,20,7,2};
        int n = arr.length;
        int minVal = arr[0];
        int j=1;
        int res=arr[1]-arr[0];
        while(j<n){
          res = Math.max(res, arr[j]-minVal);
          minVal = Math.min(minVal, arr[j]);
        j++;
        }
        System.out.println(res);
    }
}
