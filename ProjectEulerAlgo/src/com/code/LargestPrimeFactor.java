package com.code;

import java.util.Scanner;

public class LargestPrimeFactor {//600851475143
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        long result = findLargestPrimeFactor(num);
        System.out.println(result);
    }

    private static long findLargestPrimeFactor(long num) {
        long maxPrime = -1;
        while (num%2==0){
            maxPrime = 2;
            num>>=2;
        }
        for(int i=3;i<Math.sqrt(num);i+=2){
            while (num%i==0){
                maxPrime = i;
                num = num/i;
            }
        }
        if(num>2){
            maxPrime = num;
        }
        return maxPrime;
    }
}
