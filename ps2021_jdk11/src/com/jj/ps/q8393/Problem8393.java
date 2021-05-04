package com.jj.ps.q8393;

import java.util.Scanner;

public class Problem8393 {
	/**
	 * 문제번호 : 8393
	 * @author laststars
	 * 
	 * 문제 참고 : https://www.acmicpc.net/problem/8393
	 * 
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		int result = 0;
		for(int i = 1; i <= input1; i++) {
			result += i;
		}

		System.out.println(result);
	}

}
