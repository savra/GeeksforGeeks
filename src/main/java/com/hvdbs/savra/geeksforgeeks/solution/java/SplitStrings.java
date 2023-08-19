package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.List;

@GeeksForGeeksInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Split Strings",
        url = "https://practice.geeksforgeeks.org/problems/split-strings5211/1?page=3&difficulty[]=-2&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions"
)
public class SplitStrings {
    //My Time Complexity: O(n)
    //My Space complexity: O(n)
    static List<String> splitString(String S) {
        List<String> result = new ArrayList<>();

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();

        for (int i = 0; i < S.length(); i++) {
            char currentChar = S.charAt(i);

            if ((currentChar >= 65 && currentChar <= 90)
                    || (currentChar >= 97 && currentChar <= 122)) {
                sb1.append(currentChar);
            } else if (currentChar >= 48 && currentChar <= 57) {
                sb2.append(currentChar);
            } else {
                sb3.append(currentChar);
            }
        }

        String str1 = sb1.toString();
        String str2 = sb2.toString();
        String str3 = sb3.toString();

        result.add(str1.isEmpty() ? "-1" : str1);
        result.add(str2.isEmpty() ? "-1" : str2);
        result.add(str3.isEmpty() ? "-1" : str3);

        return result;
    }
}
