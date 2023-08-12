package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        name = "Check String",
        difficulty = Difficulty.SCHOOL,
        url = "https://practice.geeksforgeeks.org/problems/check-string1818/1?page=2&difficulty[]=-2&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions"
)
public class CheckString {
    //Expected Time Complexity: O(|S|)
    //Expected Auxiliary Space: O(1)

    //My Time Complexity: O(|S|)
    //My Auxiliary Space: O(1)
    Boolean check (String s){
        boolean allSame = true;

        if (s.length() == 1) {
            return true;
        }

        char firstChar = s.charAt(0);


        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != firstChar) {
                allSame = false;
                break;
            }
        }

        return allSame;
    }
}
