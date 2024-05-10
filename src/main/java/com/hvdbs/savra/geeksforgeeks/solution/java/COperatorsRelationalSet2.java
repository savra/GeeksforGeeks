package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.SCHOOL,
        name = "C++ Operators (Relational) | Set 2",
        url = "https://practice.geeksforgeeks.org/problems/c-operators-relational-set-21407/1?page=2&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions",
        spaceComplexity = "O(1)",
        timeComplexity = "O(1)")
public class COperatorsRelationalSet2 {
    static String compareNum(int A, int B) {
        if (A > B) {
            return String.format("%s is greater than %s", A, B);
        } else if (A < B) {
            return String.format("%s is less than %s", A, B);
        } else {
            return String.format("%s is equals to %s", A, B);
        }
    }
}
