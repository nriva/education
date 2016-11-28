package cadit.edu.collection;

import java.util.*;

public class MainCollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		Iterator<Person> iterator = useList(new ArrayList<Person>());
		Iterator<Person> iterator = useSet(new TreeSet<Person>());
		for(;iterator.hasNext();)
		{
			System.out.println(iterator.next());
		}
			
	}
	
	public static Iterator<Person> useSet(Set<Person> set)
	{
		Person person;
		person = new Person("Nicola","Riva","Verona",38);
		set.add(person);
		
		person = new Person("Nicola","Riva","Roma",99);
		if(set.contains(person))
			System.out.println("Elemento già esistente");
		else
			set.add(person);
		
		return set.iterator();
	}

 	public static Iterator<Person> useList(List<Person> list) {
 		
		Person person;
		person = new Person("Nicola","Riva","Verona",38);
		list.add(person);
		person = new Person("Giorgio","Napolitano","Roma",99);
		list.add(person);
		
		return list.iterator();
	}

}
