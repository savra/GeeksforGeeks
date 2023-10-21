package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

@GeeksForGeeksInfo(
        difficulty = Difficulty.EASY,
        name = "Insert an Element at the Bottom of a Stack",
        url = "https://practice.geeksforgeeks.org/problems/insert-an-element-at-the-bottom-of-a-stack/1?page=1&difficulty[]=0&status[]=unsolved&category[]=Stack&sortBy=accuracy"
)
public class InsertAnElementAtTheBottomOfAStack {
    public Stack<Integer> insertAtBottom(Stack<Integer> s, int x) {
        Deque<Integer> s2 = new ArrayDeque<>();

        while (!s.isEmpty()) {
            s2.offerFirst(s.pop());
        }

        s.push(x);

        while (!s2.isEmpty()) {
            s.push(s2.pollFirst());
        }

        return s;
    }
}
