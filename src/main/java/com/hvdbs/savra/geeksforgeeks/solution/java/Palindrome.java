package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Palindrome",
        url = "https://practice.geeksforgeeks.org/problems/palindrome0746/1?page=1&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions"
)
public class Palindrome {
    //My Time Complexity: O(n)
    //My Space complexity: O(n)
    public String is_palindrome(int n) {
        String tmp = String.valueOf(n);
        StringBuilder sb = new StringBuilder();

        while(n > 0) {
            sb.append(n % 10);

            n /= 10;
        }

        return tmp.equals(sb.toString()) ? "Yes" : "No";
    }
}
