package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.BASIC,
        name = "Modular Node",
        url = "https://practice.geeksforgeeks.org/problems/modular-node/1?page=1&difficulty[]=-1&status[]=unsolved&category[]=Linked%20List&sortBy=accuracy"
)
public class ModularNode {
    class Node {
        int data;
        Node next;

        Node(int key) {
            data = key;
            next = null;
        }
    }

    public static int moduarNode(Node head, int k) {
        int res = -1;
        int i = 1;

        for (Node cur = head; cur != null; cur = cur.next) {
            if (i % k == 0) {
                res = cur.data;
            }

            i++;
        }

        return res;
    }
}
