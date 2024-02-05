package DataStructuresAndAlgorithms.Strings;

import org.testng.annotations.Test;

import java.util.Arrays;

public class firstRepeatingCharacter {

    @Test
    public void firstRepeatingcharacter(){
        String myString = "gksforer";
        final int CHAR = 256;
        int[] myArr = new int[CHAR];
        Arrays.fill(myArr,-1);
        int res = Integer.MAX_VALUE;
        for(int i=0;i<myString.length();i++){
            if(myArr[myString.charAt(i)]==-1)
                myArr[myString.charAt(i)] = i;
            else
                myArr[myString.charAt(i)] = -2;
        }
        for(int i=0;i<myString.length();i++){
            if(myArr[myString.charAt(i)]==-2)
                res = Math.min(res,i);
        }
        if(res==Integer.MAX_VALUE)
            System.out.println(-1);
        else
            System.out.println(myString.charAt(res));
    }
}
