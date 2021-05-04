package com.jj.ps.q14681;

import java.util.Scanner;

public class Problem14681 {
	/**
	 * 문제번호 : 14681
	 * @author laststars
	 * 
	 * 문제 참고 : https://www.acmicpc.net/problem/14681
	 * 
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		
		if(input1 > 0 && input2 > 0) {
			System.out.println("1");
		} else if(input1 < 0 && input2 > 0) {
			System.out.println("2");
		} else if(input1 < 0 && input2 < 0) {
			System.out.println("3");
		} else {
			System.out.println("4");
		}
	}

}
