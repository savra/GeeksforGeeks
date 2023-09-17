package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

import java.util.HashMap;
import java.util.Map;

@GeeksForGeeksInfo(
        difficulty = Difficulty.BASIC,
        name = "Magical String[Duplicate Problem]",
        url = "https://practice.geeksforgeeks.org/problems/magical-string3653/1?page=1&difficulty[]=-1&status[]=unsolved&sortBy=accuracy"
)
public class MagicalStringDuplicateProblem {
    static String magicalString(String S) {
        Map<Character, Character> m = new HashMap<>();

        m.put('a', 'z');
        m.put('b', 'y');
        m.put('c', 'x');
        m.put('d', 'w');
        m.put('e', 'v');
        m.put('f', 'u');
        m.put('g', 't');
        m.put('h', 's');
        m.put('i', 'r');
        m.put('j', 'q');
        m.put('k', 'p');
        m.put('l', 'o');
        m.put('m', 'n');
        m.put('n', 'm');
        m.put('o', 'l');
        m.put('p', 'k');
        m.put('q', 'j');
        m.put('r', 'i');
        m.put('s', 'h');
        m.put('t', 'g');
        m.put('u', 'f');
        m.put('v', 'e');
        m.put('w', 'd');
        m.put('x', 'c');
        m.put('y', 'b');
        m.put('z', 'a');

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < S.length(); i++) {
            sb.append(m.get(S.charAt(i)));
        }

        return sb.toString();
    }
}
