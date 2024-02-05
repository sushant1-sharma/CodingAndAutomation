package DataStructuresAndAlgorithms.Arrays;

import java.util.Arrays;

public class SortWithoutBuiltInSortMethod {
    public static void main(String[] args) {
        int[] arrNum = {6, 5, 2, 1, 9, 10, 0};
        System.out.println(Arrays.toString(arrNum)); // [6, 5, 2, 1, 9, 10, 0]
        sSort(arrNum);
        System.out.println(Arrays.toString(arrNum)); // [0, 1, 2, 5, 6, 9, 10]

        arrNum = new int [] {6, 5, 2, 1, 9, 10, 0};
        System.out.println(Arrays.toString(arrNum)); // [6, 5, 2, 1, 9, 10, 0]
        bSort(arrNum);
        System.out.println(Arrays.toString(arrNum)); // [0, 1, 2, 5, 6, 9, 10]
    }

    public static void sSort(int[] arrNum){
        for(int i=0;i<arrNum.length;i++){
            int midIndex = i;
            int min = arrNum[i];

            for(int j=i+1;j<arrNum.length;j++){
                if(arrNum[j]<min){
                    min=arrNum[j];
                    midIndex = j;
                }
            }

            int temp = arrNum[i];
            arrNum[i]=arrNum[midIndex];
            arrNum[midIndex] = temp;
        }
    }

    public static void bSort(int[] arrNum){

        int i;
        boolean swapped=false;
        while(true) {
            i = 0;
            swapped = false;
            while (i<arrNum.length - 1) {
                if (arrNum[i] > arrNum[i + 1]) {
                    int temp = arrNum[i];
                    arrNum[i] = arrNum[i + 1];
                    arrNum[i + 1] = temp;
                    swapped=true;
                }
                i++;
            }
            if(!swapped){
                break;
            }
        }
    }
}
