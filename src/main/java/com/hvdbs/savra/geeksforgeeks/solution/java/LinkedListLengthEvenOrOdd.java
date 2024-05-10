package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.BASIC,
        name = "Linked List Length Even or Odd?",
        url = "https://practice.geeksforgeeks.org/problems/linked-list-length-even-or-odd/1?page=1&difficulty[]=-1&status[]=unsolved&category[]=Linked%20List&sortBy=accuracy",
        spaceComplexity = "O(1)",
        timeComplexity = "O(N)")
public class LinkedListLengthEvenOrOdd {
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    int isLengthEvenorOdd(Node head1) {
        int i = 0;

        for (Node cur = head1; cur != null; cur = cur.next) {
            i++;
        }

        return i % 2 == 0 ? 0 : 1;
    }
}
