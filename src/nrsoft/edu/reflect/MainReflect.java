package nrsoft.edu.reflect;

import java.lang.reflect.*;

import nrsoft.edu.collection.*;

public class MainReflect {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Object o = null;
		Class<Person> _class = Person.class;
		
		System.out.print(Modifier.toString(_class.getModifiers()));
		System.out.print(" ");
		System.out.print(_class.getName());
		System.out.println(" {");
		System.out.println("");
		
		for( Constructor<?> constructor : _class.getConstructors())
		{
			String paramList = "";
			for(Class<?> paramClass : constructor.getParameterTypes())
			{
				paramList += paramClass.getName() + ", ";
			}
			System.out.print("\t");
			System.out.print(Modifier.toString(constructor.getModifiers()));
			System.out.print(" ");
			System.out.print(_class.getName());
			System.out.print("(");
			System.out.print(paramList.substring(0, paramList.length()-2));
			System.out.println(");");
			
			if(constructor.getParameterTypes().length == 4)
			{
				
				try {
					o = constructor.newInstance(new Object[] {"Nicola", "Riva", "Verona", 38});
				} catch (InstantiationException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("");
		System.out.println("}");
		
		if(o!=null)
			System.out.println(o);
		
		
		

	}

}
