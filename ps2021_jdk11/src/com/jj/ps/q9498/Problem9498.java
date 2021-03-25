package com.jj.ps.q9498;

import java.util.Scanner;

public class Problem9498 {
	/**
	 * 문제번호 : 9498
	 * @author laststars
	 * 
	 * 문제 참고 : https://www.acmicpc.net/problem/9498
	 * 
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		
		if(input1 >= 90) {
			System.out.println("A");
		} else if(input1 >= 80) {
			System.out.println("B");
		} else if(input1 >= 70) {
			System.out.println("C");
		} else if(input1 >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}
}
