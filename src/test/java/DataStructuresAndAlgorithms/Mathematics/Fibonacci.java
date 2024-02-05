package DataStructuresAndAlgorithms.Mathematics;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number to Find Fibonacci");
        int a = scanner.nextInt();
        fib(a);
    }

    public static void fib(int a){
        int first = 0;
        int second = 1;
        System.out.println(first);
        System.out.println(second);

        for(int i=2;i<a;i++){
            int sum = first+second;
            System.out.println(sum);
            first = second;
            second = sum;
        }
    }
}
