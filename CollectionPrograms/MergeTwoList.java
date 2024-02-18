package com.learn.CollectionPrograms;
import java.util.*;
import java.util.Arrays;
public class MergeTwoList {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,2,4,5,6,2,3,4,5,6,1,6,7,8,3,6,8,9));
		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(15,16,15,14,13,12,15,18,19,23,14,10,11,11,65));
		HashSet<Integer>  mergedSet = new HashSet<Integer>(list1);
		mergedSet.addAll(list2);
		ArrayList<Integer> mergedList = new ArrayList<Integer>(mergedSet);
		System.out.println(mergedList);
	}
}
