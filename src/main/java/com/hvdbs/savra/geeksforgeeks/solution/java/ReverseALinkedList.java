package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Reverse a linked list",
        url = "https://practice.geeksforgeeks.org/problems/reverse-a-linked-list/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&status[]=unsolved&category[]=Linked%20List&sortBy=accuracy"
)
public class ReverseALinkedList {
    class Node {
        int data;
        Node next;

        Node(int value) {
            this.data = value;
        }
    }

    Node reverseList(Node head) {
        Node cur = head;
        Node prev = null;
        Node next;

        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;
    }
}
