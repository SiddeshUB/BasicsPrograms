/*Write a program to traverse (or iterate) ArrayList?*/
package com.learn.CollectionPrograms;
import java.util.*;

public class IterateList {
	public static void main(String[] args) {
		TreeSet<Integer> list1 = new TreeSet<Integer>(Arrays.asList(15,16,15,14,13,12,15,18,19,23,14,10,11,11,65));
		Iterator itr = list1.descendingIterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+ " ");
		}
		System.out.println();
		HashSet<Integer>  mergedSet = new HashSet<Integer>(list1);
		Iterator itr2 = mergedSet.iterator();
		while(itr2.hasNext()) {
			System.out.print(itr2.next()+ " ");
		}
	}
}
