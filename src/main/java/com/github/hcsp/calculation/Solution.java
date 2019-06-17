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

       Character[] string = new Character[] {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f','A','B','C','D','E','F'};
;
       boolean result = false;
        for (char element:string) {
            if(element==ch){
                result =true;
            }
        }

        return result;
    }

}
