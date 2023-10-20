package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

import java.util.Comparator;

@GeeksForGeeksInfo(
        difficulty = Difficulty.EASY,
        name = "Minimum Cost of ropes",
        url = "https://practice.geeksforgeeks.org/problems/minimum-cost-of-ropes-1587115620/1?page=1&difficulty[]=0&status[]=unsolved&category[]=Queue&sortBy=accuracy"
)
public class MinimumCostOfRopes {
    long minCost(long arr[], int n) {
        if (n == 1) {
            return 0;
        }

        java.util.Arrays.sort(arr);

        java.util.Queue<Long> q = new java.util.PriorityQueue<>(Comparator.naturalOrder());

        for (long i : arr) {
            q.offer(i);
        }

        long res = 0;

        while (!q.isEmpty()) {
            Long c = q.poll();
            c += q.poll();

            res += c;

            if (q.isEmpty()) {
                return res;
            }

            q.offer(c);
        }

        return res;
    }
}
