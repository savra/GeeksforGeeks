package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Binary representation",
        url = "https://practice.geeksforgeeks.org/problems/binary-representation5003/1?page=3&difficulty[]=-2&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions"
)
public class BinaryRepresentation {
    //Expected Time Complexity: O(LogN)
    //Expected Auxiliary Space: O(1)

    //My Time Complexity: O(n)
    //My Space complexity: O(1)
    static String getBinaryRep(int N){
        return String.format("%30s", Integer.toBinaryString(N)).replace(" ", "0");
    }
}
