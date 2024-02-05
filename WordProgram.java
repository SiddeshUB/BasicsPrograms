package com.test.learn;

import java.util.Scanner;
import java.util.TreeMap;

public class WordProgram {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scan.nextLine();
		System.out.println("Enter the number");
		String s1 = str.toLowerCase();
		String arr[]= s1.split(" ");
		TreeMap <String,Integer> tr = new TreeMap <String,Integer>();
		
		for (int j=0;j<arr.length;j++) {
			int count=0;
			for (int i=0;i<arr.length;i++) {
				if(arr[i]==arr[j]) {
					count++;
				}
				tr.put(arr[j],count);
			}
		}
		System.out.println(tr);
	}
}

