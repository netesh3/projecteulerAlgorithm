package com.code;

import java.util.Scanner;

public class EvenFibonacciNumbers {
    public static void main(String[] args) {
        int range = 4000000;
        long f1 = 0;
        long f2 = 1;
        long f3 = f1+f2;
        int sum = 0;
        while(f3<range){
            f1 = f2;
            f2 = f3;
            f3 = f1+f2;
            if(f3%2 == 0){
                sum+=f3;

            }
        }
        System.out.println(sum);
    }
}
