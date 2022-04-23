// Remote State Internship Interview question for Rahul Joshi Round 2 20/Apr/2022 13:00 - 20:00

package com.vedansh;

import java.util.HashSet;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = {0,1,0,1,1,2,2,3,4,3,5};
        var all = new HashSet<Integer>();
        var duplicate = new HashSet<Integer>();
        for(int ele: arr) {
            if(all.contains(ele))
                duplicate.add(ele);
            else
                all.add(ele);
        }
        all.removeAll(duplicate);
        System.out.println(all);
    }
}
