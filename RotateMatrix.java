package com.vedansh;

import java.util.Arrays;

public class RotateMatrix {
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0; i < n; i++)
            for(int j = i+1; j < n; j++)
                swap(matrix, i, j, j, i);

        for(int i = 0; i < n/2; i++)
            for(int j = 0; j < n; j++)
                swap(matrix, j, i, j, n-i-1);
    }

    private static void swap(int matrix[][], int x1, int y1, int x2, int y2) {
        int temp = matrix[x1][y1];
        matrix[x1][y1] = matrix[x2][y2];
        matrix[x2][y2] = temp;
    }
}
