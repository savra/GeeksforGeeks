package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.BASIC,
        name = "Implement Stack using Linked List",
        url = "https://practice.geeksforgeeks.org/problems/implement-stack-using-linked-list/1?page=1&difficulty[]=-1&status[]=unsolved&category[]=Linked%20List&sortBy=accuracy"
)
public class ImplementStackUsingLinkedList {
    static class StackNode {
        int data;
        StackNode next;
        StackNode(int a) {
            data = a;
            next = null;
        }
    }
    StackNode top;

    //Function to push an integer into the stack.
    void push(int a) {
        StackNode newNode = new StackNode(a);

        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    //Function to remove an item from top of the stack.
    int pop() {
        if (top == null) {
            return -1;
        } else {
            int res = top.data;

            if (top.next == null) {
                top = null;
            } else {
                top = top.next;
            }

            return res;
        }
    }
}
