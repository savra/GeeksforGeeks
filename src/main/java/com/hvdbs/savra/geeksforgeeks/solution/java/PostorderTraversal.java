package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.List;

@GeeksForGeeksInfo(
        difficulty = Difficulty.BASIC,
        name = "Postorder Traversal",
        url = "https://practice.geeksforgeeks.org/problems/postorder-traversal/1?page=1&difficulty[]=-1&status[]=unsolved&sortBy=accuracy"
)
public class PostorderTraversal {
    ArrayList<Integer> postOrder(Node root) {
        ArrayList<Integer> re = new ArrayList<>();
        traverse(root, re);

        return re;
    }

    void traverse(Node root, List<Integer> result) {
        if (root == null) {
            return;
        }

        traverse(root.left, result);
        traverse(root.right, result);
        result.add(root.data);
    }
}
