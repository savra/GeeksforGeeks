package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Determine focal length of a spherical mirror",
        url = "https://practice.geeksforgeeks.org/problems/determine-focal-length-of-a-spherical-mirror5415/1?page=4&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions"
)
public class DetermineFocalLengthOfASphericalMirror {
    //My Time Complexity: O(1)
    //My Space complexity: O(1)
    public static int findFocalLength(float R, String type) {
        return "convex".equals(type) ? (int)Math.floor((double)-R / 2) : (int)Math.floor((double)R / 2);
    }
}
