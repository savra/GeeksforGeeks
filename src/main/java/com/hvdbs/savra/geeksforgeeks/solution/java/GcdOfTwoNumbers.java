package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.SCHOOL,
        name = "GCD of two numbers",
        url = "https://practice.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1?page=1&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions"
)
public class GcdOfTwoNumbers {
    //My Time Complexity: O(log(min(a, b)))
    //My Space complexity: O(1)
    public int gcd(int A , int B) {
        if (B == 0) {
            return A;
        }

        return gcd(B, A % B);
    }
}
