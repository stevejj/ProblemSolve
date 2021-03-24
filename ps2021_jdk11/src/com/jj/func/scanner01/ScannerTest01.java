package com.jj.func.scanner01;

import java.util.Scanner;

public class ScannerTest01 {

	/*
	 * 입력받은 숫자만 배열에 값을 넣어 생성해보기
	 * */
	public static void main(String[] args) {

		int [][] arr = new int[2][5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				
				if(!sc.hasNextInt()) {
					sc.next();
					System.out.println("숫자만 입력 가능");
				}
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
