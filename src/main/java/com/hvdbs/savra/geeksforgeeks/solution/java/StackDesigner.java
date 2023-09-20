package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.Deque;
import java.util.Stack;

@GeeksForGeeksInfo(
        difficulty = Difficulty.BASIC,
        name = "Stack designer",
        url = "https://practice.geeksforgeeks.org/problems/stack-designer/1?page=1&difficulty[]=-1&status[]=unsolved&sortBy=accuracy"
)
public class StackDesigner {
    public static Stack<Integer>_push(ArrayList<Integer> arr,int n) {
        Stack<Integer> s = new Stack();

        for (int i = 0; i < n; i++) {
            s.push(arr.get(i));
        }

        return s;
    }

    public static void _pop(Stack<Integer> s) {
        while(!s.empty()) {
            System.out.print(s.pop() + " ");
        }
    }
}
