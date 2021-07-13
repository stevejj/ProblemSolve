package com.study.level2;

import java.util.Stack;

/**
 * 짝지어 제거하기
 * https://programmers.co.kr/learn/courses/30/lessons/12973
 * */

public class Solution21071301 {
	
	public int solution(String s) {
        int answer = 0;
        
        Stack<Character> st = new Stack<>();
        
        for(int i = 0; i < s.length(); i++) {
        	if(!st.isEmpty() && st.peek() == s.charAt(i)) { // 스택이 비어있지 않고, 다음 글자가 들어있는것과 같으면
        		st.pop(); // 제거
        	} else {
        		st.push(s.charAt(i)); // 들어있는것과 같이 않으면, 스택이 비어있지 않으면
        	}
        }

        answer = st.isEmpty() ? 1 : 0;
        
        return answer;
    }
	
	public static void main(String[] args) {
		
	}
	
}
