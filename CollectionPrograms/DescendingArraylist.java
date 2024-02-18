/*Write a program to sort ArrayList in descending order*/
package com.learn.CollectionPrograms;
import java.util.*;
public class DescendingArraylist {
	public static void main(String[] args) {
	ArrayList list1 = new ArrayList(Arrays.asList(45,78,25,47,47,29,25));
	Collections.sort(list1,Collections.reverseOrder());
	System.out.println(list1);
	}
}
