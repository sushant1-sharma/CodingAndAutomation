package DataStructuresAndAlgorithms.Strings;

import java.util.Arrays;

public class StringsAnagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("abc", "cab"));
        System.out.println(isAnagram("sushant", "sushyauu"));
        System.out.println(isAnagram("right", "ghirt"));
    }

    public static boolean isAnagram(String str, String str1) {
//        int i = 0;
//        while (i < str1.length()) {
//            for (int j = 0; j < str.length(); j++) {
//                if (str1.charAt(i) == str.charAt(j)) {
//                    break;
//                } else if (j == str.length() - 1 && str1.charAt(i) != str.charAt(j)) {
//                    System.out.println(str1.charAt(i));
//                    return false;
//                }
//            }
//            i++;
//        }
//        return true;

        //with Sorting
        char a[] = str.toCharArray();
        char b[] = str1.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);

    }
}
