// Silfra Technologies Internship Interview Round 2 14/Apr/2022 16:50 - 17:30
// answered correctly during the interview

package com.vedansh;

class LinkedList {
    int val;
    LinkedList next;
}

public class InterleaveTwoLinkedList {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        LinkedList list1copy = list1;
        LinkedList list2copy = list2;


        for(int i = 1; i < 3; i++) {
            list1copy.val = i;
            list1copy.next = new LinkedList();
            list1copy = list1copy.next;
        }

        for(int i = 4; i < 8; i++) {
            list2copy.val = i;
            list2copy.next = new LinkedList();
            list2copy = list2copy.next;
        }

        LinkedList temp;
        int counter = 0;
        while(list1.next != null) {
            if(counter%2 == 0) {
                temp = list1.next;
                list1.next = new LinkedList();
                list1.next.val = list2.val;
                list1.next.next = temp;
                list2 = list2.next;
            }
            System.out.print(list1.val+" ");
            list1 = list1.next;
            counter++;
        }

        System.out.println();
        while(list2.next != null) {
            System.out.print(list2.val +" ");
            list2 = list2.next;
        }

    }
}
