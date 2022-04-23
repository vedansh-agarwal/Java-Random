package com.vedansh;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PermutationsOfInt {
    static int digits;
    static Set<Integer> permutations;
    public static void main(String[] args) {
        permutations = new HashSet<>();
        digits = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        digits = String.valueOf(number).length();

        permute(number, 0);
        System.out.println("Permutations: ");
        System.out.println(permutations);
    }

    public static void permute(int n, int k) {
        if(k == digits-1)
            permutations.add(n);
        else
            for(int i = k; i < digits; i++) {
                n = swap(n, i, k);
                permute(n, k+1);
                n = swap(n, k, i);
            }

    }

    public static int swap(int n, int i, int j) {
        if(i == j)
            return n;

        int output = 0;
        int digit1 = 0;
        int digit2 = 0;

        for(int counter = 0; counter < digits; counter++) {
            if(counter == i)
                digit1 = n%10;
            else if(counter == j)
                digit2 = n%10;
            else
                output += n%10 * Math.pow(10, counter);
            n = n/10;
        }

        output += digit1 * Math.pow(10, j);
        output += digit2 * Math.pow(10, i);
        return output;
    }
}
