package com.vedansh;
import java.util.Scanner;
public class sortIPv4Addresses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        String arr[] = new String[n];
        System.out.println("Enter "+n+" ip addresses below:");
        for(int i = 0; i < n; i++)
            arr[i] = sc.next();
        sc.close();
        System.out.println("\nSorted IP Addresses:");
        for(int i = 0; i < n; i++) {
            int max = i;
            for(int j = i+1; j < n; j++)
                if(compare(arr[max], arr[j]))
                    max = j;
            String temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;
            System.out.println(temp);
        }
    }

    public static boolean compare(String s1, String s2) {
        s1 += ".";
        s2 += ".";
        int prev = 0;
        int i = s1.indexOf('.');
        int j = s2.indexOf('.');
        while(i != -1 && j != -1) {
            if(i < j)
                return true;
            else if(j < i)
                return false;
            else {
                while(prev < i && s1.charAt(prev) == s2.charAt(prev))
                    prev++;
                if(prev != i)
                    return s1.charAt(prev) < s2.charAt(prev);
            }
            prev = i+1;
            i = s1.indexOf('.',i+1);
            j = s2.indexOf('.', j+1);
        }
        return false;
    }
}
