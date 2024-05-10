package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Stack;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Queue using two Stacks",
        url = "https://practice.geeksforgeeks.org/problems/queue-using-two-stacks/1?page=1&difficulty[]=0&status[]=unsolved&category[]=Queue&sortBy=accuracy"
)
public class QueueUsingTwoStacks {
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    //Function to push an element in queue by using 2 stacks.
    void Push(int x) {
        s1.push(x);
    }


    //Function to pop an element from queue by using 2 stacks.
    int Pop() {
        if (s1.isEmpty() && s2.isEmpty()) {
            return -1;
        }

        if (!s2.isEmpty()) {
            return s2.pop();
        }

        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        return s2.pop();
    }
}
