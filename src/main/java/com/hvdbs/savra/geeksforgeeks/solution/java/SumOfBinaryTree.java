package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.BASIC,
        name = "Sum of Binary Tree",
        url = "https://practice.geeksforgeeks.org/problems/sum-of-binary-tree/1?page=1&difficulty[]=-1&status[]=unsolved&sortBy=accuracy",
        spaceComplexity = "O(N)",
        timeComplexity = "O(N)")
public class SumOfBinaryTree {
    static class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = right = null;
        }
    }

    static int sumBT(Node head) {
        if (head == null) {
            return 0;
        }

        return head.data + sumBT(head.left) + sumBT(head.right);
    }
}


