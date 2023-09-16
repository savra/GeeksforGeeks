package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Surface Area and Volume of Cuboid",
        url = "https://practice.geeksforgeeks.org/problems/surface-area-and-volume-of-cuboid0522/1?page=3&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions"
)
public class SurfaceAreaAndVolumeOfCuboid {
    public long[] find(int l, int b, int h) {
        return new long[] {2L * ((long)b * h + (long)h * l + (long)l * b) , (long)l * b * h};
    }
}
