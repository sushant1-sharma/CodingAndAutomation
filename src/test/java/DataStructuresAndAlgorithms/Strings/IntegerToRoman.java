package DataStructuresAndAlgorithms.Strings;

import java.util.HashMap;

public class IntegerToRoman {

    public void integerToRomanConvert() {
        int number = 1994;
        //MCMXCIV
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "I");
        map.put(5, "V");
        map.put(10, "X");
        map.put(50, "L");
        map.put(100, "C");
        map.put(500, "D");
        map.put(1000, "M");


    }
}
