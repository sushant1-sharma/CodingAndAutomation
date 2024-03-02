package DataStructuresAndAlgorithms.Arrays;

import org.testng.annotations.Test;

import java.util.Arrays;

public class MoveZeroesToEnd {

    @Test
    public void moveZeroesToEnd(){
        int arr[] = {0,2,6,7,0,0,3,8,2,0,0,0,6,7,0,6};
        int n = arr.length;
        int i=0,j=1;
        while(j<n){
            if(arr[j]!=0)
                arr[i++] = arr[j];
        j++;
        }
        j=i;
        while(j<n)
           arr[j++] = 0;
        System.out.println(Arrays.toString(arr));
    }
}
