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
         int ch1  = ch;
        if ((int)'0'<=ch1&&ch1<=(int)'9'){
            return true;
        }else if ((int)'A'<=ch1&&ch1<=(int)'F'){
            return true;
        }else if ((int)'a'<=ch1&&ch1<=(int)'f'){
            return true;
        }else{
            return false;
        }
    }
}
