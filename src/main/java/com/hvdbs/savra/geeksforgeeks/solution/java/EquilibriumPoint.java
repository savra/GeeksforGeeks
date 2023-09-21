package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.EASY,
        name = "Equilibrium Point",
        url = "https://practice.geeksforgeeks.org/problems/equilibrium-point-1587115620/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article"
)
public class EquilibriumPoint {
    //My Time Complexity: O(n)
    //My Space complexity: O(1)
    public static int equilibriumPoint(long arr[], int n) {
        int res = -1;
        long leftSum = 0;
        long rightSum = 0;

        if (n == 1) {
            return 1;
        }

        boolean needLeftSum = true;
        boolean needRightSum = true;

        for (int i = 0, j = arr.length - 1; i < j;) {
            if (needLeftSum) {
                leftSum += arr[i];
            }

            if (needRightSum) {
                rightSum += arr[j];
            }

            if (leftSum == rightSum) {
                if (j - 2 == i) {
                    res = j - 1;
                    break;
                } else {
                    needRightSum = true;
                    needLeftSum = true;
                    i++;
                    j--;
                }
            } else if (leftSum > rightSum)  {
                j--;
                needLeftSum = false;
                needRightSum = true;
            } else {
                i++;
                needRightSum = false;
                needLeftSum = true;
            }
        }

        return res != -1 ? res + 1 : -1;
    }
}
