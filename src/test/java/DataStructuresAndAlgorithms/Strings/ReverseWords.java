package DataStructuresAndAlgorithms.Strings;

public class ReverseWords {

    public static void main(String args[]){
        String myString = "    My Name  is Sushant Sharma     ";
        System.out.println(reverseWords(myString));
    }


    public static String reverseWords(String inputString){
        StringBuilder res = new StringBuilder();

        String[] splitString = inputString.split(" ");
        for(int i=splitString.length-1;i>=0;i--){
            res.append(splitString[i]);
            res.append(" ");
        }
        return res.toString().trim();
    }
}
