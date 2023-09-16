package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

import java.util.ArrayList;

@GeeksForGeeksInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Java loops | Set 1",
        url = "https://practice.geeksforgeeks.org/problems/java-loops-set-11726/1?page=2&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions"
)
public class JavaLoopsSet1 {
    //My Time Complexity: O(n)
    //My Space complexity: O(n)
    static ArrayList<Integer> getSum(int N){
        ArrayList<Integer> result = new ArrayList<>();
        int sumEven = 0;
        int sumOdd = 0;

        for(int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }

        result.add(sumEven);
        result.add(sumOdd);

        return result;
    }
}
