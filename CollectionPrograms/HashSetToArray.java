/*Write a program to convert HashSet to Array*/
package com.learn.CollectionPrograms;
import java.awt.Window.Type;
import java.util.*;
public class HashSetToArray {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>(Arrays.asList(45,78,25,47,47,29,25));
		System.out.println(set);
		Integer[] arr=set.toArray(new Integer[set.size()]);
		for(int x: arr) {
			System.out.println(x+" ");
		}
	}
}
