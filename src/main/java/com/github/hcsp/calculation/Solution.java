package com.github.hcsp.calculation;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        System.out.println("A是合法的十六进制字符:" + isValidHexCharacter('A'));
        System.out.println("0是合法的十六进制字符:" + isValidHexCharacter('0'));
        System.out.println("G是合法的十六进制字符:" + isValidHexCharacter('G'));
    }

    // 一个合法的十六进制的字符是：字符0-9，以及字符A/a/B/b/C/c/D/d/E/e/F/f （大小写都是合法的）
    // 编写一个方法，给定一个字符，若是合法的十六进制字符，返回true，否则返回false
    public static boolean isValidHexCharacter(char ch) {
        ArrayList<Character> obj = new ArrayList<>();
        obj.add('0');
        obj.add('1');
        obj.add('2');
        obj.add('3');
        obj.add('4');
        obj.add('5');
        obj.add('6');
        obj.add('7');
        obj.add('8');
        obj.add('9');
        obj.add('A');
        obj.add('a');
        obj.add('B');
        obj.add('b');
        obj.add('C');
        obj.add('c');
        obj.add('D');
        obj.add('d');
        obj.add('E');
        obj.add('e');
        obj.add('F');
        obj.add('f');
        return obj.contains(ch);
    }
}
