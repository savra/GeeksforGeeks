package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.List;

@CodeInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Java Switch Case statement",
        url = "https://practice.geeksforgeeks.org/problems/java-switch-case-statement3529/1?page=1&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions",
        spaceComplexity = "O(1)",
        timeComplexity = "O(1)")
public class JavaSwitchCaseStatement {
    static double switchCase(int choice, List<Double> arr) {
        return arr.size() == 1 ? 3.1415926 * arr.get(0) * arr.get(0) : arr.get(0) * arr.get(1);
    }
}
