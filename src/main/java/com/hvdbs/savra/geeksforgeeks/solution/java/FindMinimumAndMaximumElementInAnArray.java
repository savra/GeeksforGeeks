package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.BASIC,
        name = "Find minimum and maximum element in an array",
        url = "https://practice.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1?page=1&difficulty[]=-1&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions"
)
public class FindMinimumAndMaximumElementInAnArray {
    //My Time Complexity: O(n)
    //My Space complexity: O(1)

    class Pair
    {
        long first, second;
        public Pair(long first, long second)
        {
            this.first = first;
            this.second = second;
        }
    }
    Pair getMinMax(long a[], long n)  {
        Pair result = new Pair(a[0], a[0]);

        for (int i = 1; i < a.length; i++) {
            if (a[i] < result.first) {
                result.first = a[i];
            }

            if (a[i] > result.second) {
                result.second = a[i];
            }
        }

        return result;
    }
}
