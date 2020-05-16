package com.github.hcsp.calculation;

public class Solution {
    public static void main(String[] args) {
        System.out.println("A是合法的十六进制字符:" + isValidHexCharacter('a'));
        System.out.println("0是合法的十六进制字符:" + isValidHexCharacter('0'));
        System.out.println("G是合法的十六进制字符:" + isValidHexCharacter('G'));
    }

    // 一个合法的十六进制的字符是：字符0-9，以及字符A/a/B/b/C/c/D/d/E/e/F/f （大小写都是合法的）
    // 编写一个方法，给定一个字符，若是合法的十六进制字符，返回true，否则返回false
    public static boolean isValidHexCharacter(char ch) {
//        48-57 , 65-70 ,97-102
        int n = (int)ch;
        return (n >= 48 && n <= 57) || (n >= 65 && n <= 70) || (n >= 97 && n <= 102);
    }
}
