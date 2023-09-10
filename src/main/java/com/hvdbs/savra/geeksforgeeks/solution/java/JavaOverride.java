package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Java Override",
        url = "https://practice.geeksforgeeks.org/problems/java-override/1?page=3&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions"
)
public class JavaOverride extends Parent {
    //My Time Complexity: O(1)
    //My Space complexity: O(1)
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