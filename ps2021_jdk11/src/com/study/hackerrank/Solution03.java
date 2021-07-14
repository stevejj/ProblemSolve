package com.study.hackerrank;

import java.math.BigDecimal;
import java.util.*;

/**
 * BigDecimal
 * https://www.hackerrank.com/challenges/java-bigdecimal/problem
 * */
public class Solution03 {

	public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();

      	// Comparator 인터페이스를 직접 구현하여, 내림차순으로 정렬
        Arrays.sort(s, 0, n, new Comparator<String> () {
        	@Override
        	public int compare(String arg0, String arg1) {
        		BigDecimal b1 = new BigDecimal(arg0);
        		BigDecimal b2 = new BigDecimal(arg1);
        		return b2.compareTo(b1);
        	}
        }); 

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
