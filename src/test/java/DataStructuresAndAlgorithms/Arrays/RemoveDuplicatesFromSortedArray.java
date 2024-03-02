package DataStructuresAndAlgorithms.Arrays;

import org.testng.annotations.Test;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    @Test
    public void removeDuplicateFromSortedArray(){
        int[] arr = {1,2,2,2,3,3,3,3,4,4,5,5,5,5,10,10,15};
        int i=0,j=1;
        while(j<arr.length){
           if(arr[i]==arr[j]){
               j++;
               continue;
           }
           else
               arr[++i]=arr[j++];
        }
        int[] newArr = Arrays.copyOf(arr, i+1);
        System.out.println(Arrays.toString(newArr));
    }
}
