/*Write a program to convert List to Array*/
package com.learn.CollectionPrograms;
import java.util.*;
public class ConvertToArray {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,2,4,5,6,2,3,4,5,6,1,6,7,8,3,6,8,9));
		Integer[] arr =list1.toArray(new Integer[list1.size()]);
		for (int x : arr) {
			System.out.print(x+" ");
		}
	}
}
