package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.BASIC,
        name = "Count Leaves in Binary Tree",
        url = "https://practice.geeksforgeeks.org/problems/count-leaves-in-binary-tree/1?page=1&difficulty[]=-1&status[]=unsolved&sortBy=accuracy"
)
public class CountLeavesInBinaryTree {
    int countLeaves(Node node) {
        if (node == null) {
            return 0;
        }

        int i = 0;

        if (node.left == null && node.right == null) {
            return 1;
        } else {
            i += countLeaves(node.left);
            i += countLeaves(node.right);
        }

        return i;
    }
}

class Node
{
    int data;
    Node left, right;
}
