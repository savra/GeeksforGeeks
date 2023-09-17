package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.BASIC,
        name = "Sum of Binary Tree",
        url = "https://practice.geeksforgeeks.org/problems/sum-of-binary-tree/1?page=1&difficulty[]=-1&status[]=unsolved&sortBy=accuracy"
)
public class SumOfBinaryTree {
    static class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = right = null;
        }
    }

    //My Time Complexity: O(n)
    //My Space complexity: O(n)
    static int sumBT(Node head) {
        if (head == null) {
            return 0;
        }

        return head.data + sumBT(head.left) + sumBT(head.right);
    }
}


