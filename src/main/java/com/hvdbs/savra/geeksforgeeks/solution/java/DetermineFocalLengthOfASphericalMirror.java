package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Determine focal length of a spherical mirror",
        url = "https://practice.geeksforgeeks.org/problems/determine-focal-length-of-a-spherical-mirror5415/1?page=4&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions",
        timeComplexity = "O(1)",
        spaceComplexity = "O(1)")
public class DetermineFocalLengthOfASphericalMirror {
    public static int findFocalLength(float R, String type) {
        return "convex".equals(type) ? (int) Math.floor((double) -R / 2) : (int) Math.floor((double) R / 2);
    }
}
