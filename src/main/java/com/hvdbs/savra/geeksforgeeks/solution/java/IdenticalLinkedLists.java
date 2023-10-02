package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.BASIC,
        name = "Identical Linked Lists",
        url = "https://practice.geeksforgeeks.org/problems/identical-linked-lists/1?page=1&difficulty[]=-1&status[]=unsolved&category[]=Linked%20List&sortBy=accuracy"
)
public class IdenticalLinkedLists {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public boolean isIdentical(Node head1, Node head2) {
            for (Node c1 = head1, c2 = head2; c1 != null || c2 != null; c1 = c1.next, c2 = c2.next) {
                if (c1 == null || c2 == null || c1.data != c2.data) {
                    return false;
                }
            }

            return true;
        }
    }
}
