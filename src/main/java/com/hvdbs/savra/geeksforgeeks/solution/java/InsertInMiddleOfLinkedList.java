package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.BASIC,
        name = "Insert in Middle of Linked List",
        url = "https://practice.geeksforgeeks.org/problems/insert-in-middle-of-linked-list/1?page=1&difficulty[]=-1&status[]=unsolved&category[]=Linked%20List&sortBy=accuracy"
)
public class InsertInMiddleOfLinkedList {
    class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node insertInMid(Node head, int data) {
        Node slow = head;
        Node fast = head;

        for (; fast.next != null && fast.next.next != null; slow = slow.next, fast = fast.next.next) { }

        Node newNode = new Node(data);
        newNode.next = slow.next;
        slow.next = newNode;

        return head;
    }
}
