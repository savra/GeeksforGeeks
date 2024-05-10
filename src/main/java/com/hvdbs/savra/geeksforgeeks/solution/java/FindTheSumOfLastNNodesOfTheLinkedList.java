package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.BASIC,
        name = "Find the Sum of Last N nodes of the Linked List",
        url = "https://practice.geeksforgeeks.org/problems/find-the-sum-of-last-n-nodes-of-the-linked-list/1?page=1&difficulty[]=-1&status[]=unsolved&category[]=Linked%20List&sortBy=accuracy",
        timeComplexity = "O(N)",
        spaceComplexity = "O(1)")
public class FindTheSumOfLastNNodesOfTheLinkedList {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public int sum(Node head, int k) {
        Node first = head;
        Node second = head;
        int sum = 0;

        for (int i = 1, j = 0; i < k; i++) {
            second = second.next;

            if (second == null) {
                while (j != i) {
                    sum += first.data;
                    j++;
                }

                return sum;
            }
        }

        while (second.next != null) {
            first = first.next;
            second = second.next;
        }

        while (first != null) {
            sum += first.data;
            first = first.next;
        }

        return sum;
    }
}
