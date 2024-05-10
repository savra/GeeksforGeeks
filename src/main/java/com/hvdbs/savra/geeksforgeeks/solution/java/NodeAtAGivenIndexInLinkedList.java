package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.BASIC,
        name = "Node at a given index in linked list",
        url = "https://practice.geeksforgeeks.org/problems/node-at-a-given-index-in-linked-list/1?page=1&difficulty[]=-1&status[]=unsolved&category[]=Linked%20List&sortBy=accuracy",
        timeComplexity = "O(N)",
        spaceComplexity = "O(1)")
public class NodeAtAGivenIndexInLinkedList {
    class Node {
        int data;
        Node next;

        Node(int key) {
            data = key;
            next = null;
        }
    }

    public static int getNth(Node node, int ind) {
        int i = 1;

        for (Node cur = node; cur != null; cur = cur.next) {
            if (i == ind) {
                return cur.data;
            }

            i++;
        }

        return -1;
    }
}
