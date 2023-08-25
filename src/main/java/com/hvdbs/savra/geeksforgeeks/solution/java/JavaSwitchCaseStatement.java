package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

import java.util.List;

@GeeksForGeeksInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Java Switch Case statement",
        url = "https://practice.geeksforgeeks.org/problems/java-switch-case-statement3529/1?page=1&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions"
)
public class JavaSwitchCaseStatement {
    //My Time Complexity: O(1)
    //My Space complexity: O(1)
    static double switchCase(int choice, List<Double> arr){
        return arr.size() == 1 ? 3.1415926 * arr.get(0) * arr.get(0) : arr.get(0) * arr.get(1);
    }
}
