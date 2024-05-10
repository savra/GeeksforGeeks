package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.BASIC,
        name = "Implement Queue using Linked List",
        url = "https://practice.geeksforgeeks.org/problems/implement-queue-using-linked-list"
)
public class ImplementQueueUsingLinkedList {
    static class QueueNode {
        int data;
        QueueNode next;

        QueueNode(int a) {
            data = a;
            next = null;
        }
    }

    QueueNode head, tail;

    void push(int a) {
        if (head == null) {
            head = new QueueNode(a);
            tail = head;
        } else if (head == tail) {
            tail = new QueueNode(a);
            head.next = tail;
        } else {
            QueueNode qn = new QueueNode(a);
            tail.next = qn;
            tail = qn;
        }
    }

    int pop() {
        if (head == null) {
            return -1;
        }

        if (head == tail) {
            int tmp = head.data;
            head = null;
            tail = null;

            return tmp;
        }

        int tmp = head.data;
        head = head.next;

        return tmp;
    }
}
