package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.BASIC,
        name = "Implement Queue using array",
        url = "https://practice.geeksforgeeks.org/problems/implement-queue-using-array/1?page=1&difficulty[]=-1&status[]=unsolved&category[]=Queue&sortBy=accuracy"
)
public class ImplementQueueUsingArray {
    class MyQueue {

        int front, rear;
        int arr[] = new int[100005];
        int size;

        MyQueue() {
            front = 0;
            rear = 0;
            size = 0;
        }

        void push(int x) {
            if (size == 0) {
                arr[rear] = x;
            } else {
                arr[++rear] = x;
            }
            size++;
        }

        int pop() {
            if (size == 0) {
                return -1;
            }

            int tmp = arr[front++];
            size--;

            if (size == 0) {
                front = 0;
                rear = 0;
            }

            return tmp;
        }
    }
}
