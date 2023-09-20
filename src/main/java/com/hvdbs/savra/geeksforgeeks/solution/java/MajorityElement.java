package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;
import java.util.Map;

@GeeksForGeeksInfo(
        difficulty = Difficulty.MEDIUM,
        name = "Majority Element",
        url = "https://practice.geeksforgeeks.org/problems/majority-element-1587115620/1?utm_source=geeksforgeeks&utm_medium=ml_article_practice_tab&utm_campaign=article_practice_tab"
)
public class MajorityElement {
    static int majorityElement(int a[], int size) {
        java.util.Map<Integer, Integer> res = new java.util.HashMap<>();

        for (int i = 0; i < size; i++) {
            res.put(a[i], res.getOrDefault(a[i], 0) + 1);
        }

        Map.Entry<Integer, Integer> max = res.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get();

        return max.getValue() > size / 2 ? max.getKey() : -1;
    }

    public static void main(String[] args) {
        majorityElement(new int[] {3, 1, 3, 3, 2}, 5);
    }
}
