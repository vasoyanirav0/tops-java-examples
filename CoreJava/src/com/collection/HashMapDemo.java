package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap map=new HashMap();
		map.put(110, "Yash");
		map.put(10, "Nirav");
		map.put(410, "Mahaz");
		map.put(160, "Brijraj");
		map.put(210, "Aadarsh");
		
		System.out.println(map);
		map.put(110, "Jigar");
		System.out.println(map);
		
		Set set=map.entrySet();
		
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
	}
}
