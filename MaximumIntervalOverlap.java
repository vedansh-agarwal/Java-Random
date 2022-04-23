package com.vedansh;

import java.util.Arrays;

public class MaximumIntervalOverlap {
    public static void main(String[] args) {
        int intervals[][] = {{1, 8}, {2, 5}, {5, 6}, {3, 7}};     // input
        int intervalsUpperBound = 8;                              // input

        int n = intervals.length;
        int days[] = new int[intervalsUpperBound];
        int counter = 0;
        int currentpos = 0;
        int currentneg = 0;
        int max = 0;

        // Column-Wise Sorting
        for(int i = 0; i < n; i++) {
            int min1 = i;
            int min2 = i;

            for(int j = i+1; j < n; j++) {
                if(intervals[min1][0] > intervals[j][0])
                    min1 = j;
                if(intervals[min2][1] > intervals[j][1])
                    min2 = j;
            }

            swap(intervals, i, min1, 0);
            swap(intervals, i, min2, 1);
        }

        // Storing number of overlapping intervals on each step and finding max overlap
        for(int i = 0; i < intervalsUpperBound; i++) {
            if(currentneg == n && currentpos == n)
                break;

            int x = i;

            if(currentpos < n && i == intervals[currentpos][0]-1) {
                counter++;
                currentpos++;
                x = i-1;
            }
            if(currentneg < n && i == intervals[currentneg][1]) {
                counter--;
                currentneg++;
                x = i-1;
            }

            days[i] = counter;
            if(days[max] < days[i])
                max = i;
            i = x;
        }
//      System.out.println(Arrays.deepToString(intervals));
//      System.out.println(Arrays.toString(days));
        System.out.println(max+1);
    }

    public static void swap(int arr[][], int i, int j, int col) {
        int temp = arr[i][col];
        arr[i][col] = arr[j][col];
        arr[j][col] = temp;
    }
}
