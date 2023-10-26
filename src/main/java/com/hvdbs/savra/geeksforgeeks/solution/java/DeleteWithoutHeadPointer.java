package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.EASY,
        name = "Delete without head pointer",
        url = "https://practice.geeksforgeeks.org/problems/delete-without-head-pointer/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&status[]=unsolved&category[]=Linked%20List&sortBy=accuracy"
)
public class DeleteWithoutHeadPointer {
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    void deleteNode(Node del) {
        del.data = del.next.data;
        del.next = del.next.next;
    }
}
