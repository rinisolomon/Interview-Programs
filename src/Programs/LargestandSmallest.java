
package Programs;
import java.util.*;

public class LargestandSmallest {
	
	public void LargeandSmall(int[] a){
		/*
		 * Implementing Insertion Sort.
		 *  _______________
		 * |5|7|3|3|11|2|9|
		 * |_|_|_|_|__|_|_|
		 * 0  1 2 3 4  5 6
		 */
		int value=0,pos=0;
		int size=a.length;
		
		for(int i =1;i<size;i++)
		{
		value=a[i];
		pos=i;
			for(int j=i;j>=1;j--)
			{				
				if(value<a[j-1])
				{
					a[j]=a[j-1];
					pos--;
				}
			}
			
			a[pos]=value;
		}
		
		for(int i: a)
			System.out.println(i);
			
		
	}
	
	
}
