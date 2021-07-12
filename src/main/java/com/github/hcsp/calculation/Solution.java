package com.github.hcsp.calculation;

import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        System.out.println(IntStream.range('g', 'z')
                .mapToObj(i -> (char) i)
                .noneMatch(Solution::isValidHexCharacter));
        System.out.println("g是合法的十六进制字符:" + isValidHexCharacter('g'));
        System.out.println("g是合法的十六进制字符:" + isValidHexCharacter('h'));
        System.out.println("g是合法的十六进制字符:" + isValidHexCharacter('z'));
        System.out.println("A是合法的十六进制字符:" + isValidHexCharacter('A'));
        System.out.println("0是合法的十六进制字符:" + isValidHexCharacter('0'));
        System.out.println("G是合法的十六进制字符:" + isValidHexCharacter('G'));
    }

    // 一个合法的十六进制的字符是：字符0-9，以及字符A/a/B/b/C/c/D/d/E/e/F/f （大小写都是合法的）
    // 编写一个方法，给定一个字符，若是合法的十六进制字符，返回true，否则返回false
    // 好好读题
    public static boolean isValidHexCharacter(char ch) {
        return (ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'f') || (ch >= 'A' && ch <= 'F');
    }
}
