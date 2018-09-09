package com.code;

import java.util.Scanner;

public class CheckStringIsRotated {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String original = scanner.nextLine();
        String rotated = scanner.nextLine();

        String concatOriginal = original+original;
        if(concatOriginal.contains(rotated)){
            System.out.println("String is rotated");
        }else {
            System.out.println("Not a rotation");
        }
    }
}
