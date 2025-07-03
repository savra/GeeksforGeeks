package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.LinkedList;

@CodeInfo(
        difficulty = Difficulty.BASIC,
        name = "Are LinkedLists Equal",
        url = "https://www.geeksforgeeks.org/problems/are-linkedlists-equal/1?page=1&category=Arrays,Java&difficulty=Basic&status=unsolved&sortBy=accuracy",
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT)
public class AreLinkedListsEqual {
    public static boolean areEqual(LinkedList<Integer> ll1, LinkedList<Integer> ll2) {
        for (int i = 0; i < ll1.size(); i++) {
            if (!ll1.get(i).equals(ll2.get(i))) {
                return false;
            }
        }

        return true;
    }
}
