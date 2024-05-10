package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.SCHOOL,
        name = "Java Abstract keyword",
        url = "https://practice.geeksforgeeks.org/problems/java-abstract-keyword/1?page=4&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions",
        timeComplexity = "O(1)",
        spaceComplexity = "O(1)")
public class JavaAbstractKeyword extends A {
    void m1(int p, int q) {
        prod = p * q;
    }
}

abstract class A {
    int prod;
}