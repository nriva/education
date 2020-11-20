package nrsoft.edu.maps;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class Hashtables {
	
	private static String[] cities = new String[]  {"New York","Beijing", "Mumbai"};
	private static long[] populations = new long[]  {8398748,21516000,12478447};
	
	private static void populateMap(Map<String, Long> map) {
		for(int i=0;i<cities.length;i++)
			map.put(cities[i],populations[i]);
	}	


	public static void main(String[] args) {

		// Dalla versione 2 di java, Hashtable è diventata una map!
		
		Map<String, Long> table = new Hashtable<String, Long>();
		
		populateMap(table);
		
		for(Entry<String, Long> pair:table.entrySet())
		{
			System.out.println("The population of " + pair.getKey() + " is " + pair.getValue());
		}

		// Diversamente dalle altre map
		// questa istruzione provoca una java.lang.NullPointerException
		//table.put("Paris", null);
		
		
		Long longObject = table.get("Paris");
		System.out.println(longObject);			// Stampa null
		
		long longValue = table.get("Paris");	// Va in eccezione perchè non si può convertire un null ad un valore long
		System.out.println(longValue);

	}

}
