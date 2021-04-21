package Lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/*
 * Exercise 1: Create a method which accepts a hash map and return the values of the map in sorted order as a List.

Method Name getValues 
Method Description Get the values of a map in sorted order 
Argument HashMap 
Return Type List 
Logic Return the values of a hash map in sorted order 
 * 
 * */
public class SortList {

	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<String,String>();

		map.put("C", "Car");
		map.put("A", "Apple");
		map.put("B", "Banana");


		List<String> sortedList = getValues(map);
		for (String str : sortedList) { 		      
			System.out.println(str); 		
		}
	}

	public static List<String> getValues(HashMap<String, String> map) {
		List<String> list = new ArrayList<>(map.values());
		Collections.sort(list);
		return list;
	}
}
