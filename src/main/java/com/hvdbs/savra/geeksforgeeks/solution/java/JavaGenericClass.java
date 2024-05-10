package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.BASIC,
        name = "Java Generic Class",
        url = "https://practice.geeksforgeeks.org/problems/java-generic-class/1?page=1&difficulty[]=-1&status[]=unsolved&sortBy=accuracy"
)
public class JavaGenericClass<T> {
    private T data;

    JavaGenericClass(T data) {
        this.data = data;
    }

    void showType() {
        if (data instanceof Integer) {
            System.out.println("Integer");
            System.out.println(data);
        } else {
            System.out.println("String");
            System.out.println(data);
        }
    }

    //Add your code here. Make a private data variable, constructor which intialize
    // the data variable and a method showType().
}
