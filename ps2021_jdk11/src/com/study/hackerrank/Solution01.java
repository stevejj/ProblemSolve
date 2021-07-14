package com.study.hackerrank;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/**
 * SHA-256
 * https://www.hackerrank.com/challenges/sha-256/problem
 * */
public class Solution01 {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		Scanner input = new Scanner(System.in);
        MessageDigest m = MessageDigest.getInstance("SHA-256");
        m.reset();
        m.update(input.nextLine().getBytes());
        
        for (byte i : m.digest()) {
            System.out.print(String.format("%02x", i));
        }
        
        System.out.println();

	}

}
