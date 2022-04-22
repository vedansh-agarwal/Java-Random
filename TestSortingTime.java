package com.vedansh;

public class TestSortingTime {
    public static void main(String[] args) {
        int n = 500;
        int arr[] = new int[n];
        int arr1[] = new int[n];
        long startTime, stopTime;
        for(int i = n; i > 0; i--) {
            arr[n-i] = i;
            arr1[n-i] = i;
        }

        startTime = System.nanoTime();
        new HeapSort(arr1, n);
        stopTime = System.nanoTime();
        System.out.println(/*Arrays.toString(arr)+"\n"+*/"Heap Sort of "+n+" elements: "+(stopTime - startTime)+" nano sec.");

        startTime = System.nanoTime();
        new BubbleSort(arr, n);
        stopTime = System.nanoTime();
        System.out.println(/*Arrays.toString(arr)+"\n"+*/"Bubble Sort of "+n+" elements: "+(stopTime - startTime)+" nano sec.");
    }
}

class HeapSort {
    private static int N;
    swapper obj = new swapper();
    HeapSort(int arr[], int n) {
        sort(arr, n);
    }
    public void sort(int arr[], int n) {
        N = n-1;
        heapify(arr);
        for (int i = N; i > 0; i--) {
            obj.swap(arr, 0, i);
            N = N - 1;
            maxheap(arr, 0);
        }
    }
    public void heapify(int arr[]) {
        for (int i = N / 2; i >= 0; i--)
            maxheap(arr, i);
    }
    public void maxheap(int arr[], int i) {
        int left = 2 * i;
        int right = 2 * i + 1;
        int max = i;
        if (left <= N && arr[left] > arr[i])
            max = left;
        if (right <= N && arr[right] > arr[max])
            max = right;
        if (max != i) {
            obj.swap(arr, i, max);
            maxheap(arr, max);
        }
    }
}

class BubbleSort {
    BubbleSort(int arr[], int n) {
        bubbleSort(arr, n);
    }
    public void bubbleSort(int arr[], int n) {
        swapper obj = new swapper();
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                if (arr[i] > arr[j])
                    obj.swap(arr, i, j);
    }
}

class swapper {
    void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
