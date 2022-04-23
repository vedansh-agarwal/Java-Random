package com.vedansh;

class ListNode {
    int val;
    ListNode next;
}
public class MiddleOfLinkedList {
    public static void main(String[] args) {
        ListNode list1 = new ListNode();
        ListNode temp = list1;

        int n = 11;
        for(int i = 1; i <= n; i++) {
            temp.val = i;
            System.out.print(i+" ");
            if(i != n)
                temp.next = new ListNode();
            temp = temp.next;
        }

        System.out.println();

        ListNode slower = list1;
        ListNode faster = list1;
        while(faster != null && faster.next != null) {
            faster = faster.next.next;
            slower = slower.next;
        }
        System.out.println(slower.val);
    }
}
