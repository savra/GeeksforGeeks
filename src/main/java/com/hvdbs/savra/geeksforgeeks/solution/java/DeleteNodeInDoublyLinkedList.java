package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.BASIC,
        name = "Delete node in Doubly Linked List",
        url = "https://practice.geeksforgeeks.org/problems/delete-node-in-doubly-linked-list/1?page=1&difficulty[]=-1&status[]=unsolved&category[]=Linked%20List&sortBy=accuracy"
)
public class DeleteNodeInDoublyLinkedList {
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int d) {
            data = d;
            next = prev = null;
        }
    }

    Node deleteNode(Node head, int x) {
        int n = 1;

        for (Node cur = head; cur != null; cur = cur.next) {
            if (x == n) {
                if (cur == head) {
                    if (cur.next != null) {
                        head = cur.next;
                    } else {
                        head = null;
                    }
                } else {
                    if (cur.next == null) {
                        cur.prev.next = null;
                    } else {
                        cur.prev.next = cur.next;
                        cur.next.prev = cur.prev;
                    }
                }

                break;
            }

            n++;
        }

        return head;
    }
}
