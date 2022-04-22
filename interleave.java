package com.vedansh;

public class interleave {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "stuvwxyz";
        String s3 = "";
        int i = 0;
        while(i < s1.length() || i < s2.length()) {
            if(i < s1.length())
                s3 += Character.toString(s1.charAt(i));
            if(i < s2.length())
                s3 += Character.toString(s2.charAt(i));
            i++;
        }
        System.out.println(s3);
    }
}
