package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.EASY,
        name = "Occurence of an integer in a Linked List",
        url = "https://practice.geeksforgeeks.org/problems/occurence-of-an-integer-in-a-linked-list/1?page=1&difficulty[]=0&status[]=unsolved&category[]=Linked%20List&sortBy=accuracy"
)
public class OccurenceOfAnIntegerInALinkedList {
    class Node {
        int data;
        Node next;

        Node(int key) {
            data = key;
            next = null;
        }
    }

    public static int count(Node head, int search_for) {
        int count = 0;

        for (Node cur = head; cur != null; cur = cur.next) {
            if (cur.data == search_for) {
                count++;
            }
        }

        return count;
    }
}
