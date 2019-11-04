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
    	boolean bool = false;
    	String str = String.valueOf(ch);
    	for(int i=0,n=str.length();i<n;i++){
			char c = str.charAt(i);
			if(c=='0'|c=='1'|c=='2'|c=='3'|c=='4'|c=='5'|c=='6'|c=='7'|c=='8'|c=='9'|
			   c=='a'|c=='b'|c=='c'|c=='d'|c=='e'|c=='f'|c=='A'|c=='B'|c=='C'|c=='D'|
			   c=='E'|c=='F')
			{
				bool = true;
			}
    	}
    	return bool;   	
    }
}
