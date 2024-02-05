package DataStructuresAndAlgorithms.Strings;

import java.util.Scanner;

public class ReverseString {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        StringBuilder myString = new StringBuilder(inputString);
        int start = 0;
        int end = myString.length()-1;
        while(start<end){
            char temp = myString.charAt(start);
            myString.setCharAt(start, myString.charAt(end));
            myString.setCharAt(end, temp);
            start++;
            end--;
        }
        inputString = myString.toString();
        System.out.println("Reversed String is "+ inputString);
    }

}
