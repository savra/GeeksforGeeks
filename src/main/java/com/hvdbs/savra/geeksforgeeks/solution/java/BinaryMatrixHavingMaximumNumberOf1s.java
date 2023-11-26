package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.EASY,
        name = "Binary matrix having maximum number of 1s",
        url = "https://practice.geeksforgeeks.org/problems/binary-matrix-having-maximum-number-of-1s--170647/1?page=1&category=Binary%20Search&difficulty=School,Basic,Easy&status=unsolved&sortBy=accuracy")
public class BinaryMatrixHavingMaximumNumberOf1s {
    public int[] findMaxRow(int mat[][], int N) {
        int maxRowNumber = -1;
        int maxOneCount = 0;
        int oneCount = 0;

        for (int i = mat.length - 1; i >= 0; i--) {
            oneCount = 0;

            for (int j = mat[i].length - 1; j >= 0; j--) {
                if (mat[i][j] == 1) {
                    oneCount++;
                } else {
                    break;
                }
            }

            if (oneCount >= maxOneCount) {
                maxOneCount = oneCount;
                maxRowNumber = i;
            }
        }

        return new int[]{maxRowNumber, maxOneCount};
    }
}
