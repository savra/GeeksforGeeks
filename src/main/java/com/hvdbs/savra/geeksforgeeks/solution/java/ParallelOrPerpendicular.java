package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Parallel or Perpendicular?",
        url = "https://practice.geeksforgeeks.org/problems/parallel-or-perpendicular4257/1?page=4&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions"
)
public class ParallelOrPerpendicular {
    public int find(int[] A, int[] B){
        if (A[0] * B[0] + A[1] * B[1] + A[2] * B[2] == 0) {
            return 2;
        }

        int isParallel = (A[1] * B[2] - A[2] * B[1] - (A[0] * B[2] - B[0] * A[2]) + (A[0] * B[1] - A[1] * B[0]));

        if (isParallel == 0) {
            return 1;
        }

        return 0;
    }
}
