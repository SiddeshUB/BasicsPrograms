package com.learn.CollectionPrograms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
public class RemoveDuplicates {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,2,4,5,6,2,3,4,5,6,6,7));
		HashSet<Integer> uniquesNums = new HashSet<Integer>(numbers);
		numbers.clear();
		numbers.addAll(uniquesNums);
		System.out.println(numbers);
	}
}
