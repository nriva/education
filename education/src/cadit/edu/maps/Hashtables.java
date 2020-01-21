package cadit.edu.maps;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class Hashtables {

	public static void main(String[] args) {

		// Dalla versione 2 di java, Hashtable è diventata una map!
		
		Map<String, Long> table = new Hashtable<String, Long>();
		
		table.put("New York", (long) 8398748);
		
		for(Entry<String, Long> pair:table.entrySet())
		{
			System.out.println("The population of " + pair.getKey() + " is " + pair.getValue());
		}
		
		// Questa istruzione provoca una java.lang.NullPointerException
		// Diversamente dalle altre map
		table.put("Beijing", null);

	}

}
