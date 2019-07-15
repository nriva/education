package cadit.edu.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MainMaps {

	public static void main(String[] args) {

		Map<String,Long> population = createTreeMap();
		iterate(population);
		

	}

	private static void iterate(Map<String, Long> population) {
		for(Entry<String, Long> pair:population.entrySet())
		{
			System.out.println("The population of " + pair.getKey() + " is " + pair.getValue());
		}

		
	}

	private static Map<String, Long> createHashMap() {
		HashMap<String, Long> hashMap = new HashMap<>();
		
		hashMap.put("New York",(long) 1000);
		hashMap.put("Moscow",(long) 1000);
		hashMap.put("Beijing",(long) 1000);
		
		return hashMap;
	}
	
	private static Map<String, Long> createTreeMap() {
		TreeMap<String, Long> hashMap = new TreeMap<>();
		
		hashMap.put("New York",(long) 1000);
		hashMap.put("Moscow",(long) 1000);
		hashMap.put("Beijing",(long) 1000);
		
		return hashMap;
	}

}
