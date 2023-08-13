package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Convert a list of characters into a String",
        url = "https://practice.geeksforgeeks.org/problems/convert-a-list-of-characters-into-a-string5142/1?page=2&difficulty[]=-2&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions"
)
public class ConvertAListOfCharactersIntoAString {
    public String chartostr(char arr[], int N){
        return new String(arr);
    }
}
