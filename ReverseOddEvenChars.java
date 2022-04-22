package com.vedansh;

import java.util.Scanner;

public class ReverseOddEvenChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String: ");
        String s = sc.nextLine();
        System.out.println("Even bits reversed: "+reverseEvenChar(s));
        System.out.println("Odd bits reversed: "+reverseOddChar(s));
    }

    public static String reverseEvenChar(String s) {
        char arr[] = s.toCharArray();
        int n = arr.length - arr.length%2;
        for(int i = 1; i < n/2; i += 2)
            swap(arr, i, n-i);
        return String.valueOf(arr);
    }

    public static String reverseOddChar(String s) {
        char arr[] = s.toCharArray();
        int n = arr.length - (arr.length+1)%2;
        for(int i = 0; i < n/2; i += 2)
            swap(arr, i, n-i-1);
        return String.valueOf(arr);
    }

    private static void swap(char arr[], int x, int y) {
        char temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
