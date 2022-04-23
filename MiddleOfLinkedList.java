// Silfra Technologies Internship Interview Round 1 9/Apr/2022 9:30 - 10:30
// my first answer was traversing fully to find length of linked list and then traversing to the middle
// also had trouble creating the linked list
// answered correctly only after suggestion from interviewer during the interview

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
