package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.math.BigInteger;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "BigInteger Multiply",
        url = "https://practice.geeksforgeeks.org/problems/biginteger-multiply/1?page=1&status[]=unsolved&sortBy=accuracy"
)
public class BigIntegerMultiply {
    static BigInteger mul(BigInteger x, BigInteger y){
        return x.multiply(y);
    }
}
