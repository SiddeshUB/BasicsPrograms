package com.learn.CollectionPrograms;
import java.util.Arrays;
import java.util.HashSet;
public class CommonElement {
	public static void main(String[] args) {
		HashSet<Integer>  set1 = new HashSet<Integer>(Arrays.asList(10,11,12,13,14,15,20));
		HashSet<Integer>  set2 = new HashSet<Integer>(Arrays.asList(20,8,9,10,11,12));
		set1.retainAll(set2);
		System.out.println("Common elements B/W two sets are :"+set1);
	}
}
