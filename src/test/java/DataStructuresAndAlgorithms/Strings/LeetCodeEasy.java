package DataStructuresAndAlgorithms.Strings;

import org.testng.annotations.Test;

import java.util.*;

public class LeetCodeEasy {

    @Test
    public void longestCommonPrefix(){
        //https://leetcode.com/problems/longest-common-prefix/
        String[] myStr = {"flower","flaw","flight"};
        Arrays.sort(myStr);
        StringBuilder str = new StringBuilder();
        int i=0;
        while(i<myStr[0].length() && i<myStr[myStr.length-1].length()){
            if(myStr[0].charAt(i)==myStr[myStr.length-1].charAt(i)){
                str.append(myStr[0].charAt(i));
            }
            else{
                break;
            }
            i++;
        }
        System.out.println(str.toString());
    }


    @Test
    public void findWordsContainingCharacter(){
        //https://leetcode.com/problems/find-words-containing-character/
        String[] words = {"abc","bcd","aaaa","cbc"};
        char x ='a';
        List<Integer> myList = new ArrayList<>();

        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                if(words[i].charAt(j)==x){
                   myList.add(i);
                   break;
                }
            }
        }

        System.out.println(myList);
    }

}
