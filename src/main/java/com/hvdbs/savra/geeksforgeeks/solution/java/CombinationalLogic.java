package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.SCHOOL,
        name = "Combinational Logic",
        url = "https://practice.geeksforgeeks.org/problems/combinational-logic1908/1?page=3&difficulty[]=-2&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions",
        timeComplexity = "O(1)",
        spaceComplexity = "O(1)")
public class CombinationalLogic {
    static int logicalOperation(int A, int B, int C, int D, int E, int F) {
        return (!(A == 1) & (B == 1)) | ((C == 1) & (D == 1)) | ((E == 1) & !(F == 1)) ? 1 : 0;
    }
}
