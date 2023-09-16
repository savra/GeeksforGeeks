package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Java Inheritance",
        url = "https://practice.geeksforgeeks.org/problems/java-inheritance/1?page=2&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions"
)
public class JavaInheritance {
    class cls1
    {
        void add(int p,int q)
        {
            System.out.println(p*q);
        }
    }

    class cls2 extends cls1
    {
        void mul(int p,int q)
        {
            System.out.println(p*q);
        }
        void task(int p,int q)
        {
            System.out.println((p * p) + (q * q));
        }
    }
}
