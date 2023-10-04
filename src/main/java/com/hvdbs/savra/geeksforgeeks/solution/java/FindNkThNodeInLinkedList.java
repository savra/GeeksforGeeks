package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.BASIC,
        name = "Find n/k th node in Linked list",
        url = "https://practice.geeksforgeeks.org/problems/find-nk-th-node-in-linked-list/1?page=1&difficulty[]=-1&status[]=unsolved&category[]=Linked%20List&sortBy=accuracy"
)
public class FindNkThNodeInLinkedList {
    class Node {
        int data;
        Node next;

        Node(int key) {
            data = key;
            next = null;
        }
    }

    public static int nknode(Node head, int k) {
        int n = 1;

        for (Node cur = head; cur.next != null; cur = cur.next) {
            n++;
        }

        int l = (int) Math.ceil((double) n / k);

        int i = 1;

        for (Node cur = head; cur != null; cur = cur.next) {
            if (i == l) {
                return cur.data;
            }

            i++;
        }

        return -1;
    }
}
