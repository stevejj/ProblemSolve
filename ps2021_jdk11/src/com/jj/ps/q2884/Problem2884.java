package com.jj.ps.q2884;

import java.util.Scanner;

public class Problem2884 {
	/**
	 * 문제번호 : 2884
	 * @author laststars
	 * 
	 * 문제 참고 : https://www.acmicpc.net/problem/2884
	 * 
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		
		if(input2 < 45) {
			input1--;
			input2 = input2 - 45 + 60;
			if(input1 < 0) {
				input1 = 23;
			}
			System.out.println(input1 + " " + input2);
		} else {
			System.out.println(input1 + " " + (input2 - 45));
		}
	}
}
