package com.jj.ps.q1330;

import java.util.Scanner;

public class Problem2588 {
	/**
	 * 문제번호 : 2588
	 * @author laststars
	 * 
	 * 문제 참고 : https://www.acmicpc.net/problem/2588
	 * 
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		
		System.out.println(input1 * (input2 % 10));
		System.out.println(input1 * ((input2 % 100) / 10));
		System.out.println(input1 * (input2 / 100));
		System.out.println(input1 * input2);
	}
}
