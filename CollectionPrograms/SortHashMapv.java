package com.learn.CollectionPrograms;
import java.util.*;
public class SortHashMapv {
	public static void main(String[] args) {
		HashMap map = new HashMap<>();
		map.put(44,"Siddesh");
		map.put(88, "Manoj");
		map.put(33, "Manu");
		map.put(78, "Bhaskar");
		map.put(95, "Arpitha");
		System.out.println(map);
		System.out.println("Before Sorting");
		Set entry = map.entrySet();
		Iterator itrSet = entry.iterator();
		while(itrSet.hasNext()) {
			Map.Entry pair = (Map.Entry) itrSet.next();
			System.out.println("Key "+pair.getKey()+" value: "+pair.getValue());
		}
		ArrayList<Map.Entry<Integer,String>> list = new ArrayList<>(map.entrySet());
		Collections.sort(list,Map.Entry.comparingByValue());
		System.out.println("After Sorting");
		System.out.println(list);
//		Map map2  = new LinkedHashMap(map.entrySet());
//		Set entry2 = map2.entrySet();
//		Iterator itrSet2 = entry2.iterator();
//		while(itrSet2.hasNext()) {
//			Map.Entry pair = (Map.Entry) itrSet2.next();
//			System.out.println("Key "+pair.getKey()+" value: "+pair.getValue());
//		}
	}
}
