/* Write a program to convert Array to List*/
package com.learn.CollectionPrograms;
import java.util.ArrayList;
public class ArrayToList {
	public static void main(String[] args) {
		int arr[] = {45,12,46,25,18,56,48,47,89};
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		for(int x:arr) {
			list1.add(x);
		}
		System.out.println("Array to List are: "+list1);
	}
}
