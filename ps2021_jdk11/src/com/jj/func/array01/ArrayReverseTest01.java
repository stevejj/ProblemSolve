package com.jj.func.array01;

public class ArrayReverseTest01 {

	/*
	 * 지정된 배열 내부 값을 역순으로 출력&바꾸기
	 * 
	 * 배열 예시 : 1,2,3,4,5
	 * 출력 예시 : 5,4,3,2,1
	 * 
	 * 조건 : 출력 & 순서 바꾸기
	 * 
	 * */
	public static void main(String[] args) {
		int [] arr = {25,7,33,68,932,123,111};
		
		// 출력 해보기
		System.out.println("[ 출력 ]");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		//순서 바꾸기
		System.out.println("[ 순서 바꾼 후 출력 ]");
		for(int i = 0; i < arr.length/2; i++) {
			int tmp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = tmp;
		}
		
		// 출력
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
	}

}
