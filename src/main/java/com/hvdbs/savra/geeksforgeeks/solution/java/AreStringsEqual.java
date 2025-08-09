package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        name = "Are Strings Equal",
        url = "https://www.geeksforgeeks.org/problems/are-strings-equal/1?page=1&category=Arrays,Java&difficulty=Basic&status=unsolved&sortBy=accuracy",
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT,
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        difficulty = Difficulty.BASIC
)
public class AreStringsEqual {
    public static boolean areEqual(String s1, String s2) {
        return s1.equals(s2);
    }
}
