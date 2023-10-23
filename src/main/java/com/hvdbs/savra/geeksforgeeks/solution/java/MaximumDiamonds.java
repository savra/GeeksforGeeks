package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

@GeeksForGeeksInfo(
        difficulty = Difficulty.EASY,
        name = "Maximum Diamonds",
        url = "https://practice.geeksforgeeks.org/problems/chinky-and-diamonds3340/1?page=1&difficulty[]=0&status[]=unsolved&category[]=Queue&sortBy=accuracy"
)
public class MaximumDiamonds {
    static long maxDiamonds(int[] a, int n, int k) {
        Queue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i : a) {
            q.offer(i);
        }

        long sum = 0;

        while (k-- > 0) {
            int tmp = q.poll();
            sum += tmp;
            q.offer(tmp / 2);
        }

        return sum;
    }
}
