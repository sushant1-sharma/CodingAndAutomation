package DataStructuresAndAlgorithms.Strings;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;


public class RemoveDuplicates {

    public static void main(String[] args) {
        System.out.println("Enter String to remove duplicates");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        System.out.println("String After Removing Duplicates is " + removeDuplicates(inputString));
    }

    public static String removeDuplicates(String inputString) {
        //First way
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < inputString.length(); i++) {
            if (!isExist(inputString.charAt(i), res)) {
                res.append(inputString.charAt(i));
            }
        }
        return res.toString();


        //Second Way
//        StringBuilder strNoDup = new StringBuilder();
//
//        // convert str to char[]
//        char[] letters = inputString.toCharArray();
//        Set<Character> set = new LinkedHashSet<>();
//
//        // add each letter to set. It will remove duplicates - Set does not allow duplicates
//        for (char ch : letters) {
//            set.add(ch);
//        }
//
//        // put back to String from Set
//        for (Character ch : set) {
//            strNoDup.append(ch);
//        }
//
//        return strNoDup.toString();
//    }

    }


    public static boolean isExist(char alphabet, StringBuilder subString){
        for(int i=0;i<subString.length();i++){
            if(alphabet==subString.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
