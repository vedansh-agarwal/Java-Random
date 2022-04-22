package com.vedansh;

public class fibdp {
    static int dp[];
    public static void main(String[] args) {
        int n = 10;
        dp = new int[n];
        dp[0] = 1;
        dp[1] = 1;
        System.out.println(fib(n-1));
    }
    public static int fib(int n) {
        if(dp[n] == 0)
            dp[n] = fib(n-1) + fib(n-2);
        return dp[n];
    }
}
