package com.jj.prog.pg03;

public class Problem210421001 {
	
	public static void main(String[] args) {
		int [] nums = {1,2,3,4};
		solution(nums);
	}
	
	public static int solution(int[] nums) {
        int answer = 0;

        for(int a = 0; a < nums.length; a++) {
        	for(int b = a+1; b < nums.length; b++) {
        		for(int c = b+1; c < nums.length; c++) {
        			
        			System.out.println("nums[a : " + a + "] = " + nums[a]);
        			System.out.println("nums[b : " + b + "] = " + nums[b]);
        			System.out.println("nums[c : " + c + "] = " + nums[c]);
        			
        			int sum = nums[a] + nums[b] + nums[c];
        			if(isPrime(sum)) {
        				answer++;
        			}
        		}
        	}
        	System.out.println("a : " + a);
        	System.out.println();
        }
        return answer;
    }
	
	public static boolean isPrime(int sumTemp) {
		for(int i = 2; i < sumTemp; i++) {
			if(sumTemp % i == 0) {
				return false;
			}
		}
		return true;
	}
}
