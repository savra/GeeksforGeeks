package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.BASIC,
        name = "Minimum element in BST",
        url = "https://www.geeksforgeeks.org/problems/minimum-element-in-bst/1?page=1&category=Tree&difficulty=Basic&status=unsolved&sortBy=submissions",
        spaceComplexity = Complexity.ConstantComplexity.LINEAR,
        timeComplexity = Complexity.ConstantComplexity.LINEAR
)
public class MinimumElementInBST {
    private class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    int minValue(Node root) {
        if (root == null) {
            return -1;
        }

        if (root.left != null) {
            return minValue(root.left);
        }

        return root.data;
    }
}
