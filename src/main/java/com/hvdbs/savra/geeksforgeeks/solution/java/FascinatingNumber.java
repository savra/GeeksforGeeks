package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(difficulty = Difficulty.SCHOOL, name = "Fascinating Number",
        url = "https://practice.geeksforgeeks.org/problems/fascinating-number3751/1?page=2&difficulty[]=-2&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions")
public class FascinatingNumber {
    //Expected Time Complexity: O(1) Expected Auxiliary Space: O(1)
    // My Time Complexity: O(1) My Auxiliary Space: O(1)

    boolean fascinating(long n) {
        long multiplyTwo = n * 2;
        long multiplyThree = n * 3;
        char[] numbs = new char[] {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
        char[] result = (String.valueOf(n) + multiplyTwo + multiplyThree).toCharArray();

        if (result.length != 9) {
            return false;
        }

        int k = 0;

        for (char numb : numbs) {
            for (char c : result) {
                if (c == numb) {
                    k++;
                    break;
                }
            }
        }

        return k == 9;
    }
}
