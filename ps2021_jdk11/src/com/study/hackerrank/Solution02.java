package com.study.hackerrank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

/**
 * Java Regex
 * https://www.hackerrank.com/challenges/java-regex/problem
 * */
class Solution02 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex {
    String pattern = "\\b([01]?\\d{1,2}|2[0-4]\\d|25[0-5])\\."
        + "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])\\."
        + "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])\\."
        + "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])\\b";
}
