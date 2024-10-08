package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.ArrayDeque;
import java.util.Queue;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Ticket Counter",
        url = "https://www.geeksforgeeks.org/problems/ticket-counter-2731/1?page=1&category=Queue&difficulty=Easy&status=unsolved&sortBy=accuracy",
        spaceComplexity = Complexity.ConstantComplexity.LINEAR,
        timeComplexity = Complexity.ConstantComplexity.LINEAR
)
public class TicketCounter {
    public static int distributeTicket(int N, int K) {
        Queue<Integer> queue = new ArrayDeque<>();
        boolean offerHead = true;
        int i = 1, j = N;

        while (i <= N && i <= j) {
            int l = 0;

            while (l < K && i <= j) {
                if (offerHead) {
                    queue.offer(i);
                    i++;
                } else {
                    queue.offer(j);
                    j--;
                }
                l++;

            }

            offerHead = !offerHead;
        }

        int lastElement = 0;

        while (!queue.isEmpty()) {
            lastElement = queue.poll();
        }

        return lastElement;
    }

    public static void main(String[] args) {
        System.out.println(distributeTicket(14, 9));
    }
}
