package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.BASIC,
        name = "Count nodes of linked list",
        url = "https://practice.geeksforgeeks.org/problems/count-nodes-of-linked-list/1?page=1&difficulty[]=-1&status[]=unsolved&sortBy=accuracy"
)
public class CountNodesOfLinkedList {
    class Node {
        int data;
        Node next;

        Node(int a) {
            data = a;
            next = null;
        }
    }

    //My Time Complexity: O(n)
    //My Space complexity: O(1)
    public static int getCount(Node head) {
        int i = 0;

        for (Node curNode = head; curNode != null; curNode = curNode.next, i++) {}

        return i;
    }
}
