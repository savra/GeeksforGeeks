package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(name = "Remove Spaces", difficulty = Difficulty.SCHOOL,
        url = "https://practice.geeksforgeeks.org/problems/remove-spaces0128/1?page=1&difficulty[]=-2&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions")
public class RemoveSpaces {
    String modify(String S){
        return S.replace(" ", "");
    }
}
