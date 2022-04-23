// Silfra Technologies Internship Interview Round 1 9/Apr/2022 9:30 - 10:30
// answered with difficulty during the interview

package com.vedansh;

public class kadaneAlgo {
    public static void main(String[] args) {
        int arr[] = {1,2,-4,2,-1,6};
        int n = arr.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            if(sum < 0)
                sum = arr[i];
            else
                sum += arr[i];
            if(max < sum)
                max = sum;

        }
        if(max < sum)
            max = sum;
        System.out.println(max);
    }
}
