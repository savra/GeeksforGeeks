package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Java Abstract keyword",
        url = "https://practice.geeksforgeeks.org/problems/java-abstract-keyword/1?page=4&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions"
)
public class JavaAbstractKeyword extends A {
    //My Time Complexity: O(1)
    //My Space complexity: O(1)
    void m1(int p,int q) {
        prod = p * q;
    }
}

abstract class A {
    int prod;
}