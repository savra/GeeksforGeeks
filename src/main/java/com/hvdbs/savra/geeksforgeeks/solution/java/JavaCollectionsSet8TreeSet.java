package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.TreeSet;

@CodeInfo(
        name = "Java Collections | Set 8 (TreeSet)",
        url = "https://www.geeksforgeeks.org/problems/java-collections-set-8-treeset/1?page=1&category=Arrays,Java&difficulty=Basic&status=unsolved&sortBy=accuracy",
        difficulty = Difficulty.BASIC,
        spaceComplexity = Complexity.ConstantComplexity.LINEAR,
        timeComplexity = Complexity.ConstantComplexity.LINEAR)
public class JavaCollectionsSet8TreeSet {
    void task(TreeSet<String> ts, char a, char b, char c, char d) {
        System.out.println(ts.headSet(String.valueOf(a)));
        System.out.println(ts.tailSet(String.valueOf(b)));
        System.out.println(ts.subSet(String.valueOf(c), String.valueOf(d)));
    }
}
