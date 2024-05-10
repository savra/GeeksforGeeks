package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.ArrayList;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Common elements",
        url = "https://practice.geeksforgeeks.org/problems/common-elements1132/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article",
        spaceComplexity = "O(N)",
        timeComplexity = "O(N)")
public class CommonElements {
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) {
        int i = 0;
        int j = 0;
        int k = 0;

        ArrayList<Integer> res = new ArrayList<>();

        while (i < n1 && j < n2 && k < n3) {
            if (A[i] < B[j]) {
                i++;
            } else if (A[i] > B[j]) {
                j++;
            } else {
                if (A[i] < C[k]) {
                    i++;
                } else if (A[i] > C[k]) {
                    k++;
                } else {
                    boolean existsInResult = false;

                    for (Integer item : res) {
                        if (item == A[i]) {
                            existsInResult = true;
                            break;
                        }
                    }

                    if (!existsInResult) {
                        res.add(A[i]);
                    }

                    i++;
                    j++;
                    k++;
                }
            }
        }

        return res;
    }
}
