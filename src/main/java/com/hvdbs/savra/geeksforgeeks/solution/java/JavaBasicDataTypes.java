package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;
import java.util.Scanner;

@CodeInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Java Basic Data Types",
        url = "https://practice.geeksforgeeks.org/problems/java-basic-data-types0041/1?page=2&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions"
)
public class JavaBasicDataTypes {
    int javaIntType(Scanner sc) {
        return sc.nextInt();
    }

    String javaStringType(Scanner sc) {
        return sc.next();
    }

    float javaFloatType(Scanner sc) {
        return sc.nextFloat();
    }
}
