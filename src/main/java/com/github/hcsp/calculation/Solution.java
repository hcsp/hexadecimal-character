package com.github.hcsp.calculation;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println("A是合法的十六进制字符:" + isValidHexCharacter('A'));
        System.out.println("0是合法的十六进制字符:" + isValidHexCharacter('0'));
        System.out.println("G是合法的十六进制字符:" + isValidHexCharacter('G'));
    }

    // 一个合法的十六进制的字符是：字符0-9，以及字符A/a/B/b/C/c/D/d/E/e/F/f （大小写都是合法的）
    // 编写一个方法，给定一个字符，若是合法的十六进制字符，返回true，否则返回false
    public static boolean isValidHexCharacter(char ch) {
        String ch1 = String.valueOf(ch);    //基本数据类型char转为String
        //创建String数组
        String str[] = {"0","1","2","3","4","5","6","7","8","9","A","a","B","b","C","c","D","d","E","e","F","f","G","g"};
        //将String数组转为List
        List<String> list= Arrays.asList(str);
        //通过contains来判断
        if(list.contains(ch1)){
            return true;
        }else {
            return false;
        }

    }
}
