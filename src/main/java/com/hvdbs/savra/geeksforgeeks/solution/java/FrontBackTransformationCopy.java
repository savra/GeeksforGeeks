package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Front-Back Transformation - copy",
        url = "https://practice.geeksforgeeks.org/problems/front-back-transformation1659/1?page=3&difficulty[]=-2&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions"
)
public class FrontBackTransformationCopy {
    //My Time Complexity: O(n)
    //My Space complexity: O(n)
    String convert(String s) {
        int charPosition;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                charPosition = s.charAt(i) - 'A';
                sb.append((char)('Z' - charPosition));
            } else {
                charPosition = s.charAt(i) - 'a';
                sb.append((char)('z' - charPosition));
            }
        }

        return sb.toString();
    }
}
