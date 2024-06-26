package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.SCHOOL, name = "Odd or Even",
        url = "https://practice.geeksforgeeks.org/problems/odd-or-even3618/1?page=1&difficulty[]=-2&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions")
public class OddOrEven {
    static String oddEven(int N){
        return N % 2 == 0 ? "even" : "odd";
    }
}
