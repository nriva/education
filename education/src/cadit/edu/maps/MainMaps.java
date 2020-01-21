package cadit.edu.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MainMaps {
	
	private static String[] cities = new String[]  {"New York","Beijing", "Mumbai"};
	private static long[] populations = new long[]  {8398748,21516000,12478447};
	
	public static void main(String[] args) {
		System.out.println("HashMap Test:");
		
		Map<String,Long> population = createHashMap();
		iterate(population);
		
		System.out.println("\r\nTreeMap Test:");
		population = createTreeMap();
		iterate(population);
		
		System.out.println("\r\nLinkedHashMap Test:");
		population = createLinkedHashMap();
		iterate(population);
		
		System.out.println("\r\nLinkedHashMap Test/2:");
		iterate2((LinkedHashMap<String, Long>)population);
		
		// Questa istrizione non provoca un'eccezione:
		population.put("Beijing", null);
	}

	private static void iterate(Map<String, Long> population) {
		for(Entry<String, Long> pair:population.entrySet())
		{
			System.out.println("The population of " + pair.getKey() + " is " + pair.getValue());
		}
	}
	
	private static void iterate2(LinkedHashMap<String, Long> population) {
		
		Iterator<Entry<String, Long>> iterator = population.entrySet().iterator();
		
		while(iterator.hasNext())
		{
			Entry<String, Long> next = iterator.next();
			System.out.println("The population of " + next.getKey() + " is " + next.getValue());
		}
	}
	

	private static Map<String, Long> createHashMap() {
		HashMap<String, Long> hashMap = new HashMap<>();
		
		populateMap(hashMap);
		
		return hashMap;
	}
	
	private static Map<String, Long> createTreeMap() {
		TreeMap<String, Long> treeMap = new TreeMap<>();
		
		populateMap(treeMap);
		
		return treeMap;
	}
	
	private static Map<String, Long> createLinkedHashMap() {
		LinkedHashMap<String, Long> linkedHashMap = new LinkedHashMap<>();
		
		populateMap(linkedHashMap);
		
		return linkedHashMap;
	}
	
	private static void populateMap(Map<String, Long> map) {
		for(int i=0;i<cities.length;i++)
			map.put(cities[i],populations[i]);
	}	

}
