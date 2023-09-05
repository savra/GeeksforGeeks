package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Java Classes Introduction",
        url = "https://practice.geeksforgeeks.org/problems/java-classes-introduction/1?page=3&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions"
)
public class JavaClassesIntroduction {
    private int length;
    private int width;
    private int height;

    public void set_length(int l)
    {
        length = l;
    }
    public void set_width(int w)
    {
        width = w;
    }
    public void set_height(int h)
    {
        height = h;
    }
    public void volume()
    {
        System.out.println(length * width * height);
    }
}
