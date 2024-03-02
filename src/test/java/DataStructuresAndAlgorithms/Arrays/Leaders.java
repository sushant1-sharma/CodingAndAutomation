package DataStructuresAndAlgorithms.Arrays;

import org.testng.annotations.Test;

public class Leaders {

    @Test
    public void leaders(){
        int [] arr = {16, 17, 4, 3, 5, 2};
        int n = arr.length;
        int rightLargest = arr[n-1];
        System.out.print(rightLargest+" ");
        for(int i=n-2;i>=0;i--){
            if(arr[i]>rightLargest){
                rightLargest = arr[i];
                System.out.print(rightLargest+" ");
            }
        }
    }
}
