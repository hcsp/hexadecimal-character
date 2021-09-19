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
        if ( ch == 'A' ) {
            return true;
        } else if ( ch == 'a' ){
            return true;
        } else if ( ch == 'B' ){
            return true;
        } else if ( ch == 'b' ){
            return true;
        } else if ( ch == 'C' ){
            return true;
        } else if ( ch == 'c' ){
            return true;
        } else if ( ch == 'D' ){
            return true;
        } else if ( ch == 'd' ){
            return true;
        } else if ( ch == 'E' ){
            return true;
        } else if ( ch == 'e' ){
            return true;
        } else if ( ch == 'F' ){
            return true;
        } else if ( ch == 'f' ){
            return true;
        } else if ( ch == '0' ){
            return true;
        } else if ( ch == '1' ){
            return true;
        } else if ( ch == '2' ){
            return true;
        } else if ( ch == '3' ){
            return true;
        } else if ( ch == '4' ){
            return true;
        } else if ( ch == '5' ){
            return true;
        } else if ( ch == '6' ){
            return true;
        } else if ( ch == '7' ){
            return true;
        } else if ( ch == '8' ){
            return true;
        } else if ( ch == '9' ){
            return true;
        }
        return false;

    }
}
