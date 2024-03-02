package DataStructuresAndAlgorithms.Arrays;

import io.cucumber.java.it.Ma;
import org.testng.annotations.Test;

import java.util.Arrays;

public class TrappingRainWater {

    @Test
    public void trappingRainWater(){
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        int n = arr.length;
        int[] lmaxArr = new int[n];
        int[] rmaxArr = new int[n];
        lmaxArr[0] = arr[0];
        rmaxArr[n-1] = arr[n-1];
        int result = 0;
        for(int i=1,j=n-2;i<n-1 && j>=0;i++,j--){
                 lmaxArr[i] = Math.max(arr[i],lmaxArr[i-1]);
                 rmaxArr[j] = Math.max(arr[j],rmaxArr[j+1]);
        }
        for(int i=1;i<n-1;i++)
            result+=Math.min(rmaxArr[i],lmaxArr[i])-arr[i];
        System.out.println(result);

    }
}
