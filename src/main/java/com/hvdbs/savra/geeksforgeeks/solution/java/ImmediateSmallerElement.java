package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.BASIC,
        name = "Immediate Smaller Element",
        url = "https://practice.geeksforgeeks.org/problems/immediate-smaller-element1142/1?page=1&difficulty[]=-1&status[]=unsolved&category[]=Stack&sortBy=accuracy"
)
public class ImmediateSmallerElement {
    void immediateSmaller(int arr[], int n) {
        /*
        //TC: O(N), SC: O(1)

        if(n == 1) {
            arr[0] = -1;
        }

        Deque<Integer> s = new ArrayDeque<>();

        s.offerFirst(arr[0]);

        Integer current;
        Integer head;

        for (int i = 1; i < arr.length; i++) {
            current = arr[i];
            head = s.pollFirst();

            if (current < head) {
               arr[i - 1] = arr[i];
            } else {
               arr[i - 1] = -1;
            }

            s.offerFirst(current);
        }

        arr[arr.length - 1] = -1;*/

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                arr[i] = arr[i + 1];
            } else {
                arr[i] = -1;
            }
        }

        arr[n - 1] = -1;
    }
}
