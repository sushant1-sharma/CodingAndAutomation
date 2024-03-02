package DataStructuresAndAlgorithms.Arrays;

import org.testng.annotations.Test;

import java.util.Arrays;

public class ArrayRotationElement {
    @Test
    public void arrayRotationElement() {
        int[] arr = {1, 2, 4, 5, 8, 9, 10};
        int d = 5,n =arr.length;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }

    public void reverse(int[] arr,int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
