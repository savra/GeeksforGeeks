package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.BASIC,
        name = "Delete Alternate Nodes",
        url = "https://practice.geeksforgeeks.org/problems/delete-alternate-nodes/1?page=1&difficulty[]=-1&status[]=unsolved&category[]=Linked%20List&sortBy=accuracy"
)
public class DeleteAlternateNodes {
    class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }

    public void deleteAlternate (Node head){
        int i = 1;

        for (Node cur = head, prev = null; cur != null; prev = cur, cur = cur.next) {
            if (i % 2 == 0) {
                prev.next = cur.next;
            }

            i++;
        }
    }
}

