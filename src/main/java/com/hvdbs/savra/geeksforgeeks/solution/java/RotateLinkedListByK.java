package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.LinkedList;

@CodeInfo(
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT,
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        url = "https://www.geeksforgeeks.org/problems/rotate-linkedlist-by-k/1?page=1&category=Arrays,Java&difficulty=Basic&status=unsolved&sortBy=accuracy",
        difficulty = Difficulty.BASIC,
        name = "Rotate LinkedList By K")
public class RotateLinkedListByK {
    public static void rotateByK(LinkedList<Integer> ll, int k) {
        if (ll == null || ll.isEmpty()) {
            return;
        }

        int i = 0;

        while (i < k) {
            ll.addFirst(ll.removeLast());
            i++;
        }
    }
}
