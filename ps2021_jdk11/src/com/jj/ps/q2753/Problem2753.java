package com.jj.ps.q2753;

import java.util.Scanner;

public class Problem2753 {
	/**
	 * 문제번호 : 2753
	 * @author laststars
	 * 
	 * 문제 참고 : https://www.acmicpc.net/problem/2753
	 * 
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		
		if((input1 % 4 == 0 && input1 % 100 != 0) || input1 % 400 == 0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}
