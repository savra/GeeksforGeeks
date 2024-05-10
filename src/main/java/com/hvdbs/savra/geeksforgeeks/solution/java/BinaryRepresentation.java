package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.SCHOOL,
        name = "Binary representation",
        url = "https://practice.geeksforgeeks.org/problems/binary-representation5003/1?page=3&difficulty[]=-2&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions",
        timeComplexity = "O(N)",
        spaceComplexity = "O(1)")
public class BinaryRepresentation {
    static String getBinaryRep(int N) {
        return String.format("%30s", Integer.toBinaryString(N)).replace(" ", "0");
    }
}
