package com.study.level2;

/**
 * 타겟넘버
 * https://programmers.co.kr/learn/courses/30/lessons/43165
 * */
public class Solution21071401 {
	int dfs = 0;
	public int solution(int[] numbers, int target) {
        int answer = dfs(numbers, 0, 0, target);
        return answer;
    }
    
    public int dfs(int[] numbers, int depth, int sum, int target) {
    	System.out.println("dfs 호출 회수 : " + dfs++ + " depth : " + depth + " sum : " + sum);
    	if(depth == numbers.length) {
            if(sum == target) {
                System.out.println("처리 완료");
            	return 1;
            } else {
                return 0;
            }
        }
        return dfs(numbers, depth+1, sum+numbers[depth], target)
            + dfs(numbers, depth+1, sum-numbers[depth], target);
    }
    
    public static void main(String[] args) {
		int[] numbers = {1,1,1};
		int target = 3;
		Solution21071401 so = new Solution21071401();
		int answer = so.solution(numbers, target);
		System.out.println(answer);
	}
	
}

