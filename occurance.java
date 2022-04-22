package com.vedansh;

//import java.lang.reflect.Array;
import java.util.Arrays;
public class occurance {
    public static void main(String[] args) {
        String input = "hello world";
        int n = input.length();
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        int freq[] = new int[26];

        for(int i = 0; i < n; i++) {
            char ch = input.charAt(i);
            int index = alphabets.indexOf(ch);
            if(index != -1)
                freq[index]++;
        }
        for(int i = 0; i < 26; i++) {
            if(freq[i] != 0)
                System.out.println(alphabets.charAt(i)+": "+freq[i]);
        }
//        System.out.println(Arrays.toString(freq));
    }
}
