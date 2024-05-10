package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.BASIC,
        name = "Count nodes of linked list",
        url = "https://practice.geeksforgeeks.org/problems/count-nodes-of-linked-list/1?page=1&difficulty[]=-1&status[]=unsolved&sortBy=accuracy",
        timeComplexity = "O(N)",
        spaceComplexity = "O(1)")
public class CountNodesOfLinkedList {
    class Node {
        int data;
        Node next;

        Node(int a) {
            data = a;
            next = null;
        }
    }

    public static int getCount(Node head) {
        int i = 0;

        for (Node curNode = head; curNode != null; curNode = curNode.next, i++) {
        }

        return i;
    }
}
