package com.company.leetCode;

import com.company.temp.ListNode;

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode node = head;
        while (node != null) {
            length++;
            node = node.next;
        }
        if (length == 1) {
            return null;
        }
        if (length - n == 0) {
            return head.next;
        }
        int count = 1;
        node = head;
        while (count != length - n) {
            node = node.next;
            count++;
        }
        node.next = node.next.next;
        return head;
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/*Given the head of a linked list, remove the nth node from the end of the list and return its head.*/