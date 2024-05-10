package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Java Override",
        url = "https://practice.geeksforgeeks.org/problems/java-override/1?page=3&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions",
        timeComplexity = "O(1)",
        spaceComplexity = "O(1)")
public class JavaOverride extends Parent {
    @Override
    void show(int p) {
        System.out.print(p + " ");
    }

    @Override
    void print(int q) {
        System.out.println(q * q);
    }
}

class Parent {
    void show(int p) {
        System.out.println(p + " ");
    }

    void print(int q) {
        System.out.println(q + " ");
    }
}