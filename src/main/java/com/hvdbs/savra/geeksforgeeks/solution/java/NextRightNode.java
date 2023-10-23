package com.hvdbs.savra.geeksforgeeks.solution.java;

import java.util.ArrayDeque;
import java.util.Queue;

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
        Node dummy = new Node(-1);

        if (root == null || root.data == key) {
            return dummy;
        }

        Queue<Node> q = new ArrayDeque<>();

        do {
            if (root.left != null) {
                q.offer(root.left);
            }

            if (root.right != null) {
                q.offer(root.right);
            }

            if (!q.isEmpty()) {
                root = q.poll();
                if (root == null) {
                    return dummy;
                }

                if (root.data == key) {
                    return q.poll();
                }
            }
        } while (!q.isEmpty());

        return dummy;
    }

    public static void main(String[] args) {
        nextRight(new Node(1), 1);
    }
}
