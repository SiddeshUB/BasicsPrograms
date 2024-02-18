/*Write a program to convert LinkedList to ArrayList?*/
package com.learn.CollectionPrograms;
import java.util.*;
public class LinkedListToArrayList {
	public static void main(String[] args) {
		LinkedList list1 = new LinkedList(Arrays.asList(45,78,25,47,47,29,25));
		System.out.println(list1.getClass());
		ArrayList list2 = new ArrayList(list1);
		System.out.println(list2.getClass());
		System.out.println(list2);
	}
}
