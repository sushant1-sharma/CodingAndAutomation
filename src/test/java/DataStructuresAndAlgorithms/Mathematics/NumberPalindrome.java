package DataStructuresAndAlgorithms.Mathematics;

import java.util.Scanner;

public class NumberPalindrome {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check Palindrome or not");
        int a = scanner.nextInt();
        if(isPalindrome(a)==true){
            System.out.println(a+" is a Palindrome number");
        }
        else{
            System.out.println(a+" is not a Palindrome number");
        }
    }

    static boolean isPalindrome(int number){

        int remainder;
        int temp = number;
        int reversedNumber = 0;

        while(temp>0){
           remainder = temp%10;
           reversedNumber = (reversedNumber*10) + remainder;
           temp = temp/10;
        }

        return reversedNumber==number;
    }


}
