package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Combinational Logic",
        url = "https://practice.geeksforgeeks.org/problems/combinational-logic1908/1?page=3&difficulty[]=-2&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions"
)
public class CombinationalLogic {
    static int logicalOperation(int A,int B,int C,int D,int E,int F){
        return (!(A == 1) & (B == 1)) | ((C == 1) & (D == 1)) | ((E == 1) & !(F == 1))? 1 : 0;
    }
}
