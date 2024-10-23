package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Next Right Node",
        url = "https://www.geeksforgeeks.org/problems/next-right-node/1?page=1&category=Queue&difficulty=Easy&status=unsolved&sortBy=accuracy",
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        spaceComplexity = Complexity.ConstantComplexity.LINEAR
)
public class NextRightNode {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    static Node nextRight(Node root, int key) {
        List<List<Node>> levels = traverseTree(root, key);

        for (int i = 0; i < levels.size(); i++) {
            List<Node> level = levels.get(i);

            for (int j = 0; j < level.size(); j++) {
                if (level.get(j).data == key && j < level.size() - 1) {
                    return level.get(j + 1);
                }
            }
        }

        return new Node(-1);
    }

    static List<List<Node>> traverseTree(Node root, int key) {
        Queue<Node> q = new ArrayDeque<>();
        List<List<Node>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        q.offer(root);
        boolean wasMatch = false;

        while (!q.isEmpty()) {
            int levelSize = q.size();
            List<Node> currLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                Node currNode = q.poll();
                currLevel.add(currNode);

                if (currNode.left != null) {
                    q.offer(currNode.left);
                }

                if (currNode.right != null) {
                    q.offer(currNode.right);
                }

                if (currNode.data == key) {
                    wasMatch = true;
                }
            }

            result.add(currLevel);

            if (wasMatch) {
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(1);
        root.right = new Node(5);
        root.left.right = new Node(3);
        root.left.right.left = new Node(2);
        root.right.right = new Node(8);
        root.right.right.left = new Node(6);
        nextRight(root, 3);
    }
}
