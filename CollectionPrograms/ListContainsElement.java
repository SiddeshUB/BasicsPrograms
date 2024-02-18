/*Given an element write a program to check if element(value) exists in ArrayList?*/

package com.learn.CollectionPrograms;

import java.util.*;

public class ListContainsElement {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,2,4,5,6,2,3,4,5,6,1,6,7,8,3,6,8,9));
		if(list1.contains(10)) {
			System.out.println("10 was found in Arraylists");
		}else {
			System.out.println("10 was not found in Arraylists");
		}
	}
}
