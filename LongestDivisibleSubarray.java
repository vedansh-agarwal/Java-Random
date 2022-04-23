package com.vedansh;

import java.util.ArrayList;
import java.util.List;

public class LongestDivisibleSubarray {
    public static void main(String[] args) {
        int arr[] = {3, 5, 10, 20, 21};
        System.out.println(subarray(arr));
    }

    public static List<Integer> subarray(int arr[]) {
        int n = arr.length;
        List<Integer> list = new ArrayList<>();
        List<Integer> output = new ArrayList<>();;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++)
                if(arr[i] % arr[j] == 0 || arr[j] % arr[i] == 0)
                    list.add(arr[j]);

            if(output.size() < list.size())
                output = list;
            list = new ArrayList<>();
        }
        return output;
    }
}
