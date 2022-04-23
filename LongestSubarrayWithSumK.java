// Remote State Internship Pen and Paper Coding Round 13/Apr/2022 13:00 - 14:00
// brute force method
// answered correctly in the time allotted

package com.vedansh;

import java.util.*;

public class LongestSubarrayWithSumK {
    public static void main(String[] args) {
        int arr[] = {4, 5, 2, 3, 4, 1, 2, 3, 3};
        int k = 9;
        System.out.println(subarray(arr, k));
    }

    public static List<Integer> subarray(int arr[], int k) {
        int n = arr.length;
        List<Integer> list = new ArrayList<>();
        List<Integer> output = new ArrayList<>();;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum > k)
                    break;
                list.add(arr[j]);
                if (sum == k && output.size() < list.size())
                    output = list;
            }
            list = new ArrayList<>();
        }
        return output;
    }
}
