package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.SCHOOL,
        name = "C++ Operators (Relational) | Set 2",
        url = "https://practice.geeksforgeeks.org/problems/c-operators-relational-set-21407/1?page=2&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions"
)
public class COperatorsRelationalSet2 {
    //My Time Complexity: O(1)
    //My Space complexity: O(1)
    static String compareNum(int A, int B){
        if (A > B) {
            return String.format("%s is greater than %s", A, B);
        } else if (A < B) {
            return String.format("%s is less than %s", A, B);
        } else {
            return String.format("%s is equals to %s", A, B);
        }
    }
}
