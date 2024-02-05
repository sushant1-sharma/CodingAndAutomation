package DataStructuresAndAlgorithms.Strings;

import org.testng.annotations.Test;

import java.util.HashMap;

public class romanToInteger {

    @Test
    public void romanToIntegerConvert(){
        int number = 0;
        String s = "MCMXCIV";
        HashMap<String, Integer> map = new HashMap<>();

        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        for(int i=0;i<s.length();i++){

            if(i<s.length()-1 && map.get(String.valueOf(s.charAt(i))) < map.get(String.valueOf(s.charAt(i+1)))){
                number+=map.get(String.valueOf(s.charAt(i+1)))- map.get(String.valueOf(s.charAt(i)));
                i++;
            }
            else{
                number+=map.get(String.valueOf(s.charAt(i)));
            }
        }
        System.out.println(number);
    }
}
