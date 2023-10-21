package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.BASIC,
        name = "Implement stack using array",
        url = "https://practice.geeksforgeeks.org/problems/implement-stack-using-array/1?page=1&difficulty[]=-1&status[]=unsolved&category[]=Stack&sortBy=accuracy"
)
public class ImplementStackUsingArray {
    class MyStack {
        int top;
        int[] arr = new int[1000];

        MyStack() {
            top = -1;
        }

        //Function to push an integer into the stack.
        void push(int a) {
            if (top == -1) {
                top = 0;
                arr[top] = a;
            } else {
                arr[++top] = a;
            }
        }

        //Function to remove an item from top of the stack.
        int pop() {
            if (top == -1) {
                return -1;
            } else {
                return arr[top--];
            }
        }
    }
}
