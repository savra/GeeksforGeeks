package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Stack;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Queue using stack",
        url = "https://practice.geeksforgeeks.org/problems/queue-using-stack/1?page=1&difficulty[]=0&status[]=unsolved&category[]=Queue&sortBy=accuracy"
)
public class QueueUsingStack {
    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();

    /*The method pop which return the element poped out of the stack*/
    int dequeue() {
        while (!input.isEmpty()) {
            output.push(input.pop());
        }

        Integer e = output.pop();

        while (!output.isEmpty()) {
            input.push(output.pop());
        }

        return e;
    }

    /* The method push to push element into the stack */
    void enqueue(int x) {
        input.push(x);
    }
}
