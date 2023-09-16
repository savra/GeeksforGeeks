package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Full Prime",
        url = "https://practice.geeksforgeeks.org/problems/full-prime2659/1?page=2&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions"
)
public class FullPrime {
    //My Time Complexity: O(LogN)
    //My Space complexity: O(1)
    static int fullPrime(int N){
        if (!isPrime(N)) {
            return 0;
        }

        while (N > 0) {
            if (!isPrime(N % 10)) {
                return 0;
            }

            N /= 10;
        }

        return 1;
    }

    private static boolean isPrime(int n) {
        boolean result = true;

        if (n == 1 || n == 0) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
