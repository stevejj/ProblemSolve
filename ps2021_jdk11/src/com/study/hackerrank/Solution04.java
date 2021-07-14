package com.study.hackerrank;

import java.util.*;

/**
 * Java 1D Array (Part 2)
 * https://www.hackerrank.com/challenges/java-1d-array/problem
 * */
public class Solution04 {
	public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        return canWin(leap, game, 0);
    }
    public static boolean canWin(int leap, int[] game, int pos) {
    	if( pos < 0 ) return false;					// index의 현재 위치가 0보다 작을 경우
        if( game[pos] == 1 ) return false;			// 현재 지나온 위치 체크 후, 새로 재귀함수 실행될 때, 되돌아가는 것 방지
        if( pos+leap >= game.length ) return true;
        if( pos+1 >= game.length ) return true;
        game[pos] = 1;
        return canWin(leap, game, pos+leap)
            || canWin(leap, game, pos+1)
            || canWin(leap, game, pos-1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }
            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}	
