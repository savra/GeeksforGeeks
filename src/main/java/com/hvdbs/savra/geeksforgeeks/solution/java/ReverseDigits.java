package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Reverse digits",
        url = "https://practice.geeksforgeeks.org/problems/reverse-digit0316/1?page=1&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions"
)
public class ReverseDigits {
    //My Time Complexity: O(logN)
    //My Space complexity: O(1)
    public long reverse_digit(long n) {
        StringBuilder res = new StringBuilder();

        while (n > 0) {
            res.append(n % 10);
            n /= 10;
        }

        return Long.parseLong(res.toString());
    }
}
