package DataStructuresAndAlgorithms.Strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class countLetters {

    public static void main(String[] args) {
        System.out.println("Enter a String");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        System.out.println("Number of Letters and their count is below");
        System.out.println(count(inputString));
    }

    public static Map<Character, Integer> count(String inputString) {
        LinkedHashMap<Character, Integer> countMap = new LinkedHashMap<>();
        for (int i = 0; i < inputString.length(); i++) {

            if(countMap.get(inputString.charAt(i))==null){
                countMap.put(inputString.charAt(i), 1);
            }
            else{
                countMap.put(inputString.charAt(i), countMap.get(inputString.charAt(i))+1);
            }

        }
        return countMap;

        // Another Method
//        Map<Character, Integer> letters = new LinkedHashMap<>();
//
//        for(int i = 0; i < inputString.length(); i++) {
//            char ch = inputString.charAt(i);
//
//            // if map already contains the key, get the value and put back with +1
//            if(letters.containsKey(ch)) {
//                letters.put(ch, letters.get(ch) + 1);
//            }else {
//                // if it does not contain char as key, new letter put with value 1
//                letters.put(ch, 1);
//            }
//        }
//
//        return letters;

    }
}
