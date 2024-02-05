package DataStructuresAndAlgorithms.Strings;

import org.testng.annotations.Test;

public class arerotations {

    @Test
    public void CheckAreRotations() {
        String s1 = "ABCD";
        String s2 = "BCDAF";
        if (s1.length() != s2.length())
            System.out.println(false);
        String temp = s1 + s1;
        if (temp.indexOf(s2) != -1)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
