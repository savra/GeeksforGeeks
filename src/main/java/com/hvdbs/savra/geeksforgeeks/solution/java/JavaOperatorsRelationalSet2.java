package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Java Operators(Relational) | Set - 2",
        url = "https://practice.geeksforgeeks.org/problems/java-operatorsrelational-set-22338/1?page=3&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions",
        spaceComplexity = "O(1)",
        timeComplexity = "O(1)")
public class JavaOperatorsRelationalSet2 {
    static void relationalOperators(int A, int B) {
        if (A > B) {
            System.out.println(A + " is greater than " + B);
        } else if (A < B) {
            System.out.println(A + " is less than " + B);
        } else {
            System.out.println(A + " is equal to " + B);
        }
    }
}
