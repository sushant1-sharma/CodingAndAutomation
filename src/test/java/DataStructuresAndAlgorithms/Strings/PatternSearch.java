package DataStructuresAndAlgorithms.Strings;

import org.testng.annotations.Test;

import java.util.ArrayList;

public class PatternSearch {

    @Test
    public void NaivePatternSearch() {
        String myString = "GEEKS FOR GEEKS";
        String mySubString = "GEEK";
        // Need to print index of pattern that is 0 5
        StringBuilder myStringBuilder = new StringBuilder();
        int i = 0;
        while (i < myString.length()) {
            myStringBuilder.append(myString.charAt(i));
            if (myStringBuilder.length() > mySubString.length())
                myStringBuilder.deleteCharAt(0);
            if (mySubString.equals(myStringBuilder.toString()))
                System.out.println(i - mySubString.length() + 1);
            i++;
        }
    }
}
