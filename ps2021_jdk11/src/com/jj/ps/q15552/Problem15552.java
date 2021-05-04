package com.jj.ps.q15552;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem15552 {
	/**
	 * 문제번호 : 15552
	 * @author laststars
	 * 
	 * 문제 참고 : https://www.acmicpc.net/problem/15552
	 * 
	 * */
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int input1, input2;
		
		try {
			int cnt = Integer.parseInt(br.readLine());
			
			for(int i = 0; i < cnt; i++) {
				String txt = br.readLine();
				String [] splitInt = txt.split(" "); 
				input1 = Integer.parseInt(splitInt[0]);
				input2 = Integer.parseInt(splitInt[1]);
				bw.write(input1 + input2 + "\n");
			}
			bw.flush();
			bw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
