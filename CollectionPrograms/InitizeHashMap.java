/*Write a program to initialize a HashMap in java */
package com.learn.CollectionPrograms;

import java.util.*;

public class InitizeHashMap {
	public static void main(String[] args) {
		TreeMap<Integer, String> map =new  TreeMap<Integer, String>();
		
		map.put(101,"Siddesh");
		map.put(102,"Ajay");
		map.put(103,"Akash");
		map.put(104,"Anand");
		map.put(105,"Arpitha");
		System.out.println(map.getClass());
		System.out.println(map);
	}
}
