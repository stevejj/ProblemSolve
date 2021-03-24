package com.jj.func.string01;

import java.util.Scanner;

public class StringBufferTest01 {
	
	/*
	 * 숫자, 문자가 섞인 문자열을 가지고 숫자만 뽑아내기
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringBuffer strResult = new StringBuffer();
		
		for(int i = 0; i < str.length(); i ++) {
			if( str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				strResult.append(str.charAt(i));
			}
		}
		
		System.out.println(strResult);
	}
}
