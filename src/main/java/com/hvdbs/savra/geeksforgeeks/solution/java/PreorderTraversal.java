package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

@CodeInfo(
        difficulty = Difficulty.BASIC,
        name = "Preorder Traversal",
        url = "https://practice.geeksforgeeks.org/problems/preorder-traversal/1?page=1&difficulty[]=-1&status[]=unsolved&category[]=Stack&sortBy=accuracy"
)
public class PreorderTraversal {
    class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = right = null;
        }
    }

    //iterative
    static ArrayList<Integer> preorder(Node root) {
        ArrayList<Integer> res = new ArrayList<>();
        Deque<Node> s = new ArrayDeque<>();

        while (root != null || !s.isEmpty()) {
            if (!s.isEmpty()) {
                root = s.pollFirst();
            }

            while (root != null) {
                res.add(root.data);

                if (root.right != null) {
                    s.offerFirst(root.right);
                }

                root = root.left;
            }
        }

        return res;
    }

    //recursive
  /*  static ArrayList<Integer> preorder(Node root) {
        ArrayList<Integer> res = new ArrayList<>();
        traverse(root, res);

        return res;
    }*/

 /*   static void traverse(Node root, List<Integer> res) {
        if (root == null) {
            return;
        }

        res.add(root.data);
        traverse(root.left, res);
        traverse(root.right, res);
    }*/
}
