package DataStructuresAndAlgorithms.Mathematics;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check prime or not");
        int a = scanner.nextInt();
        if(isPrime(a)){
            System.out.println(a+" is a Prime number");
        }
        else{
            System.out.println(a+" is not a Prime number");
        }
    }


    static boolean isPrime(int number){
        for(int i=2;i<=number/2;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
}
