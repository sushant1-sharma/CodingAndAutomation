package DataStructuresAndAlgorithms.Strings;

import org.testng.annotations.Test;

import java.util.ArrayList;

public class LongestDistinctSubString {

    @Test
    public void longestDistinctSubString(){
        String myStr = "geeksforgeeks";

        int i=0,j=0,resI=0,resJ=0,maxRes=0;
        int n = myStr.length();
        ArrayList<Character> myArr = new ArrayList<>();

        while(i<n && j<n){
            if(!myArr.contains(myStr.charAt(j))){
                myArr.add(myStr.charAt(j));
                if(maxRes<j+1-i){
                    maxRes = j+1-i;
                    resJ = j;
                    resI = i;
                }
                j++;
            }
            else {
                myArr.remove(0);
                i++;
            }
        }
        System.out.println(myStr.substring(resI,resJ+1));
    }
}
