package DataStructuresAndAlgorithms.Strings;

import java.util.Locale;

public class ConvertLetters {

    public static void main(String[] args){
        String myString = "tOday is weDnesday";
        String inputString = "az&m*%$ys#";
        System.out.println();
        //Today Is Wednesday
        System.out.println(convertString(myString));
    }

    public static String convertString(String myString){

        String[] splitStr = myString.split(" ");
        StringBuilder myStringBuilder = new StringBuilder();

        for(String words: splitStr){
            StringBuilder myStringBuilder2 = new StringBuilder();
            for(int i=0;i<words.length();i++){
                if(i==0){
                    myStringBuilder.append(giveCapital(words.charAt(i)));
                }
                else {
                    myStringBuilder2.append(words.charAt(i));
                }
            }
            myStringBuilder.append(myStringBuilder2.toString().toLowerCase());
            myStringBuilder.append(" ");
        }
        return myStringBuilder.toString().trim();

//        for(String words: splitStr) {
//            words = words.substring(0,1).toUpperCase()+words.substring(1).toLowerCase()+" ";
//            words = Character.toUpperCase(words.charAt(0))+words.substring(1).toLowerCase()+" ";
//            myStringBuilder.append(words);
//            Character.is
//        return myStringBuilder.toString().trim();

    }

    public static char giveCapital(char a) {
            return (char) (a-32);
    }
}
