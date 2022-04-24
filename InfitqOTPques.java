package com.vedansh;

public class InfitqOTPques {
    public static void main(String[] args) {
        otp("123456");
    }
    public static void otp(String s) {
        int n = s.length();
        String output = "";
        for(int i = 0; i < n; i++) {
            int digit = s.charAt(i)-48;
            if(i % 2 != 0)
                output += String.valueOf(digit*digit);
            if(output.length() >= 4) {
                System.out.println(output.substring(0,4));
                break;
            }
        }
    }
}
