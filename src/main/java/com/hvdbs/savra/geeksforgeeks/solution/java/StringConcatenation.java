package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.ArrayList;

@CodeInfo(
        url = "https://www.geeksforgeeks.org/problems/string-concatenation/1?page=1&category=Arrays,Java&difficulty=Basic&status=unsolved&sortBy=accuracy",
        difficulty = Difficulty.BASIC,
        spaceComplexity = Complexity.ConstantComplexity.LINEAR,
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        name = "String Concatenation"
)
public class StringConcatenation {
    public static String concatenateStrings(ArrayList<String> arr) {
        return String.join("", arr);
    }
}
