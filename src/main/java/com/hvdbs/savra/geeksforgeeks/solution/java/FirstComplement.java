package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.SCHOOL,
        name = "1s Complement",
        url = "https://practice.geeksforgeeks.org/problems/1s-complement2819/1?page=3&difficulty[]=-2&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions"
)
public class FirstComplement {
    //My Time Complexity: O(n)
    //My Space complexity: O(n)
    static String onesComplement(String S,int N){
        char[] tmp = new char[N];

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '0') {
                tmp[i] = '1';
            } else {
                tmp[i] = '0';
            }
        }

        return new String(tmp);
    }
}
