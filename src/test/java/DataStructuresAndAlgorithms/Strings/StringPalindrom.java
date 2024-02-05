package DataStructuresAndAlgorithms.Strings;

import org.testng.annotations.Test;

import java.util.ArrayList;

public class StringPalindrom {

    public static void main(String[] args) {
        String myString = "madam";
        String myString1 = "madaamadamaadamabcma";
        //adaamadamaada
        //madaamadamaadam
    }

    public static boolean isPalindrom(StringBuilder myString) {
        int start = 0;
        int end = myString.length() - 1;
        while (start < end) {
            if (myString.charAt(start) != myString.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static String biggestPalindrome(String myString) {

        //madaamadamaadamabcma
        StringBuilder myStrBuilder = new StringBuilder();
        int strLength = 0;
        String result = "";
        for (int i = 0; i < myString.length(); i++) {
            myStrBuilder = new StringBuilder(String.valueOf(myString.charAt(i)));
            for (int j = i + 1; j < myString.length(); j++) {
                myStrBuilder.append(myString.charAt(j));
                System.out.println(myStrBuilder);
                if (isPalindrom(myStrBuilder) && result.length() < myStrBuilder.length()) {
                    result = myStrBuilder.toString();
                }
            }
        }

        return result;
    }

    @Test
    public void givePalindrome() {
        String str = "madaamadamaadamabcma";
        String longestSub = "";

        for (int i = 0; i < str.length(); i++) {
            StringBuilder sb = new StringBuilder(String.valueOf(str.charAt(i)));
            for (int j = i + 1; j < str.length(); j++) {
                sb.append(str.charAt(j));
//                System.out.println(sb);
                if (sb.toString().equalsIgnoreCase(new StringBuilder(sb.toString()).reverse().toString()) && sb.toString().length() > 2) {
                    if (sb.toString().length() > longestSub.length()) {
                        longestSub = sb.toString();
                    }
                }
            }
        }
        System.out.println("Longest SubString: " + longestSub);

    }


}
