package com.learn.CollectionPrograms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
public class FrequencyCounter {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,2,4,5,6,2,3,4,5,6,1,6,7,8,3,6,8,9));
		HashMap<Integer,Integer> frequencyMap = new HashMap<Integer,Integer>();
		for (int num: numbers) {
			frequencyMap.put(num ,frequencyMap.getOrDefault(num, 0)+1);
		}
		System.out.println(frequencyMap);
	}
}
