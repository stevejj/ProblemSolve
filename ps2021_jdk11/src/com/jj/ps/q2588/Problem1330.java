package com.jj.ps.q2588;

import java.util.Scanner;

public class Problem1330 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		
		if((input1 >= -10000 && input1 <= 10000) && (input2 >= -10000 && input2 <= 10000)) {
			if(input1 > input2) {
				System.out.println(">");
			} else if(input1 < input2) {
				System.out.println("<");
			} else {
				System.out.println("==");
			}
		}
	}
}
