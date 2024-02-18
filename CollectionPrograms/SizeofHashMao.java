package com.learn.CollectionPrograms;
import java.security.KeyStore.Entry;
import java.util.*;
public class SizeofHashMao {
	public static void main(String[] args) {
		HashMap map = new HashMap<>();
		System.out.println(map.isEmpty());
		map.put(1,"Siddesh");
		map.put(2, "Manoj");
		map.put(3, "Manu");
		map.put(4, "Bhaskar");
		map.put(5, "Arpitha");
		System.out.println("Size of Hashmap is "+map.size());
		
		Set keyset = map.keySet();
		Iterator itr = keyset.iterator();
		while(itr.hasNext()) {
		    int key = (int) itr.next();
			System.out.println("key: "+key+" Value: "+map.get(key));
		}
		
		Set<Map.Entry<Integer, String>> entset= map.entrySet();
		
		for(Map.Entry entry: entset) {
			System.out.println("Key "+entry.getKey()+" value "+entry.getValue());
		}
	}
}
