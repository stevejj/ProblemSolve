package com.study.level2;


/**
 * 124 나라의 숫자
 * https://programmers.co.kr/learn/courses/30/lessons/12899
 * */
public class Solution21071302 {
	
	public String solution(int n) {
        String answer = "";
        String[] nums = {"4", "1", "2"};
        
        while(n > 0) {
        	answer = nums[n%3] + answer;
            n = (n - 1) / 3;
        	
        }
        
        return answer;
    }
	
}
