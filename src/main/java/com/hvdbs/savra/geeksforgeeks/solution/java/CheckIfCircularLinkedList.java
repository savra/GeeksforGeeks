package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.BASIC,
        name = "Check If Circular Linked List",
        url = "https://practice.geeksforgeeks.org/problems/circular-linked-list/1?page=1&difficulty[]=-1&status[]=unsolved&category[]=Linked%20List&sortBy=accuracy",
        timeComplexity = "O(N)",
        spaceComplexity = "O(1)")
public class CheckIfCircularLinkedList {
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    boolean isCircular(Node head) {
        if (head == null) {
            return true;
        }

        Node cur = head.next;

        while (cur != null) {
            if (cur == head) {
                return true;
            }

            cur = cur.next;
        }

        return false;
    }
}
