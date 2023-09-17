package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.BASIC,
        name = "Size of Binary Tree",
        url = "https://practice.geeksforgeeks.org/problems/size-of-binary-tree/1?page=1&difficulty[]=-1&status[]=unsolved&sortBy=accuracy"
)
public class SizeOfBinaryTree {
    public static int getSize(Node root) {
        if (root == null) {
            return 0;
        }

        int nodeCount = 1;

        return nodeCount + getSize(root.left) + getSize(root.right);
    }
}
