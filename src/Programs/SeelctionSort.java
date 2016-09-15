package Programs;
/*
 * Implementation of Selection sort
 */
public class SeelctionSort {
	
	public void Selectsort(int[] a)
	{
		int min=0;
		for (int i=0;i<a.length-1;i++)
		{
			//finding the smallest element 
			for (int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[min])
					min=j;
			}
			
			//swap current element with the smallest element.
			int temp = a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		
		//printing the sorted array.
		for(int i:a)
			System.out.println(i);
	}

}
