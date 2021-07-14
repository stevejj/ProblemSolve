package com.study.hackerrank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Regex 2 - Duplicate Words
 * https://www.hackerrank.com/challenges/duplicate-word/problem
 * */
public class DuplicateWords {

    public static void main(String[] args) {

        String regex = "\\b(\\w+)(\\W+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) { // find : 패턴 찾는 함수
                System.out.println("m.group() : " + m.group());
                System.out.println("m.group(1) : " + m.group(1));
            	input = input.replaceAll(m.group(), m.group(1));
            	System.out.println("input : " + input);
            }
            
            // Prints the modified sentence.
            System.out.println(input);
        }
        
        in.close();
    }
}