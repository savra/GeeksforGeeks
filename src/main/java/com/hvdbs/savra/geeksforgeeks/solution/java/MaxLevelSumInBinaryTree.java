package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

import java.util.ArrayDeque;
import java.util.Queue;

@GeeksForGeeksInfo(
        name = "Max Level Sum in Binary Tree",
        difficulty = Difficulty.EASY,
        url = "https://practice.geeksforgeeks.org/problems/max-level-sum-in-binary-tree--170647/1?page=1&category=Binary%20Search&difficulty=School,Basic,Easy&status=unsolved&sortBy=accuracy")
public class MaxLevelSumInBinaryTree {
    public int maxLevelSum(Node root) {
        if (root == null) {
            return 0;
        }

        int result = 0x80000000;

        Queue<Node> q = new ArrayDeque<>();

        q.offer(root);

        while (!q.isEmpty()) {
            int levelSize = q.size();
            int levelSum = 0;

            for (int i = 0; i < levelSize; i++) {
                Node cur = q.poll();

                if (cur.left != null) {
                    q.offer(cur.left);
                }
                if (cur.right != null) {
                    q.offer(cur.right);
                }

                levelSum += cur.data;
            }

            if (result < levelSum) {
                result = levelSum;
            }
        }

        return result;
    }
}
