package com.github.hcsp.calculation;

public class Solution {
    public static void main(String[] args) {
        System.out.println("A是合法的十六进制字符:" + isValidHexCharacter('A'));
        System.out.println("0是合法的十六进制字符:" + isValidHexCharacter('0'));
        System.out.println("G是合法的十六进制字符:" + isValidHexCharacter('G'));
    }

    // 一个合法的十六进制的字符是：字符0-9，以及字符A/a/B/b/C/c/D/d/E/e/F/f （大小写都是合法的）
    // 编写一个方法，给定一个字符，若是合法的十六进制字符，返回true，否则返回false
    public static boolean isValidHexCharacter(char ch) {
        int ascii_ch = (int)ch;
        int ascii_09[] = new int[] {(int)'0', (int)'9'};
        int ascii_af[] = new int[] {(int)'a', (int)'f'};
        int ascii_AF[] = new int[] {(int)'A', (int)'F'};
        if (ascii_ch >= ascii_09[0] && ascii_ch <= ascii_09[1]) {
            return true;
        } else if (ascii_ch >= ascii_af[0] && ascii_ch <= ascii_af[1]) {
            return true;
        } else if (ascii_ch >= ascii_AF[0] && ascii_ch <= ascii_AF[1]) {
            return true;
        } else {
            return false;
        }
    }
}
