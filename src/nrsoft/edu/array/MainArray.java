package nrsoft.edu.array;

import nrsoft.edu.math.Factor;

public class MainArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] firstArray = new int[10];
		int[] secondArray; // only declaration
		
		// Fill firstArray
		for(int i=0;i<firstArray.length;i++)
			firstArray[i] = i+1;
		
		// Print the array
		for(int i: firstArray)
			System.out.println(i);
		
		Factor f = new Factor();
		
		// Fill firstArray with factorial
		for(int i=0;i<firstArray.length;i++)
			firstArray[i] = f.calcWhile(firstArray[i]);
		
		// Print the array
		for(int i: firstArray)
			System.out.println(i);
		
		// Create an alias
		secondArray = firstArray;

		// Modify some values
		secondArray[5] = 0;

		// Print the array
		for(int i: firstArray)
			System.out.println(i);

		
		

	}

}
