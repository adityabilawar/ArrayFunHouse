	import java.lang.System;
import java.lang.reflect.Array;
import java.lang.Math;
	
	public class ArrayFunHouse
	{
		//instance variables and constructors could be used, but are not really needed
		
		//getSum() will return the sum of the numbers from start to stop, not including stop
		public static int getSum(int[] numArray, int start, int stop)
		{
			int sum = 0;
			
			for (int i = start; i <= stop; i++) {
				sum+=numArray[i];
				
			}
			return sum;
		}
	
		//getCount() will return number of times val is present
		public static int getCount(int[] numArray, int val)
		{
			int count = 0;
			for(int i = 0; i< numArray.length; i++) {
				if (numArray[i] == val) {
					count += 1;
				} 
			}
			return count;
		}
	
		public static int[] removeVal(int[] numArray, int val)
		{
			
			int numVal = 0;  
			for (int i = 0; i < numArray.length; i++) { 
				if(numArray[i] == val) {numVal += 1;} 
			}
	
			int [] copy = new int[numArray.length - numVal ];
			

			
			int offest = 0; 
			
			for (int i = 0; i < copy.length; i++) { 
				if (numArray[i] != val) { 
					copy[i] = numArray[i + offest]; 
				}
				else {
					offest += 1;
					copy[i] = numArray[i + offest];
							}
				
			}
			
			
			return copy;
		
		
			
			
	
		}
		
		 
	}