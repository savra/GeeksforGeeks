package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

import java.util.LinkedList;
import java.util.Queue;

@GeeksForGeeksInfo(
        difficulty = Difficulty.EASY,
        name = "Stack using two queues",
        url = "https://practice.geeksforgeeks.org/problems/stack-using-two-queues/1?page=1&difficulty[]=0&status[]=unsolved&category[]=Queue&sortBy=accuracy"
)
public class StackUsingTwoQueues {
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();

    //Function to push an element into stack using two queues.
    void push(int a) {
        q1.offer(a);
    }

    //Function to pop an element from stack using two queues.
    int pop() {
        while (q1.peek() != null) {
            Integer tmp = q1.poll();

            if (q1.peek() != null) {
                q2.offer(tmp);
            } else {
                return tmp;
            }
        }

        while (q2.peek() != null) {
            Integer tmp = q2.poll();

            if (q2.peek() != null) {
                q1.offer(tmp);
            } else {
                return tmp;
            }
        }

        return -1;
    }
}
