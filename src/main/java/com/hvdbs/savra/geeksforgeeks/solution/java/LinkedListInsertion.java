package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.BASIC,
        name = "Linked List Insertion",
        url = "https://practice.geeksforgeeks.org/problems/linked-list-insertion-1587115620/1?page=1&difficulty[]=-1&status[]=unsolved&category[]=Linked%20List&sortBy=accuracy"
)
public class LinkedListInsertion {
    class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    Node insertAtBeginning(Node head, int x) {
        Node newNode = new Node(x);

        newNode.next = head;

        return newNode;
    }

    //Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x) {
        if (head == null) {
            return insertAtBeginning(head, x);
        }

        Node cur = head;

        for (; cur.next != null; cur = cur.next) {
        }

        cur.next = new Node(x);

        return head;
    }
}
