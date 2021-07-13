package com.study.level2;

import java.util.PriorityQueue;

/**
 * 더 맵게
 * https://programmers.co.kr/learn/courses/30/lessons/42626
 * */
public class Solution21071303 {
	public int solution(int[] scoville, int K) {
        int answer = 0;
        
        // 우선순위 큐
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int num : scoville) {
        	pq.add(num);
        }
        
        while(pq.size() >= 2) {
        	int first = pq.poll();
        	int second = pq.poll();
        	int newInt = first + (second * 2);
        	
        	pq.add(newInt);
        	answer++;
        	
        	if(pq.peek() >= K) {
        		break;
        	}
        	
        	if(pq.peek() <= K && pq.size() == 1) {
        		answer = -1;
        		break;
        	}
        	
        }
        
        return answer;
    }
}
