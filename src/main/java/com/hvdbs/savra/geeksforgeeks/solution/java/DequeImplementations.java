package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

import java.util.ArrayDeque;

@GeeksForGeeksInfo(
        difficulty = Difficulty.EASY,
        name = "Deque Implementations",
        url = "https://practice.geeksforgeeks.org/problems/deque-implementations/1?page=1&difficulty[]=0&status[]=unsolved&category[]=Queue&sortBy=accuracy"
)
public class DequeImplementations {
    // Function to push element x to the back of the deque.
    public static void push_back_pb(ArrayDeque<Integer> dq, int x) {
        dq.offerLast(x);
    }

    // Function to pop element from back of the deque.
    public static void pop_back_ppb(ArrayDeque<Integer> dq) {
        dq.pollLast();
    }

    // Function to return element from front of the deque.
    public static int front_dq(ArrayDeque<Integer> dq) {
        return dq.isEmpty() ? -1 : dq.peekFirst();
    }

    // Function to push element x to the front of the deque.
    public static void push_front_pf(ArrayDeque<Integer> dq, int x) {
        dq.offerFirst(x);
    }
}
