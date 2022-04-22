package com.vedansh;

import java.util.ArrayList;
import java.util.List;
public class Palindrome {
    public static void main(String[] args) {
        String s = "abcbabcba";
        int n = s.length();
        for(int i = 0; i < n; i++) {
            List<Integer> palindromes = allPalindromes(s, i);
            System.out.println(palindromes);
        }
    }

    public static int biggestPalindrome(String s, int index) {
        if(index > s.length()-1 || index < 0)
            return -1;
        char ch = s.charAt(index);
        int x = s.lastIndexOf(ch);
        for(int i = 1; i < x - index; i++) {
            if(s.charAt(i + index) != s.charAt(x - i)) {
                i = index + 1;
                x = s.lastIndexOf(ch, x - 1);
            }
        }
        return x;
    }

    public static List<Integer> allPalindromes(String s, int index) {
        List<Integer> palindromes = new ArrayList<>();
        char ch = s.charAt(index);
        int x = s.indexOf(ch, index);
        while(x != -1) {
            if(checkPalindrome(s, index, x))
                palindromes.add(x);
            x = s.indexOf(ch, x+1);
        }
        return palindromes;
    }

    public static boolean checkPalindrome(String word, int start, int end) {
        int mid = (end-start)/2;
        for(int i = 0; i < mid; i++)
            if(word.charAt(i+start) != word.charAt(end-i))
                return false;
        return true;
    }
}
