package Programs;

public class Merge {

	public static int[] MergeSort(int[] b)
	{
		if(b.length <=1)
		{
			return b;
		}
		int midpoint = b.length/2;
		int[] left = new int[midpoint];
		int[]right = new int[b.length-midpoint];
		int[] result = new int[b.length];
		
		for(int i=0;i<midpoint;i++)
		{
			left[i]=b[i];
		}
		int k=0;
		for(int j =midpoint;j<b.length;j++,k++)
		{
			right[k]=b[j];
		}
		
		left= MergeSort(left);
		right =MergeSort(right);
		result= merge(left,right);
		return result;
		
		
	}
	
	
	public static int[] merge(int[] left, int[] right)
	{
		int length = left.length+right.length;
		
		int[] result =new int[length];
		int indexl=0, indexr=0, indexresult=0;
		
		while(indexl<left.length || indexr<right.length)
		{
			if(indexl<left.length && indexr<right.length)
			{
				if(left[indexl]<=right[indexr])
				{
					result[indexresult]= left[indexl];
					indexl++;
					indexresult++;
				}
				else
				{
					result[indexresult]= right[indexr];
					indexr++;
					indexresult++;
				}
			}
			else if (indexl<left.length)
			{
				result[indexresult]= left[indexl];
				indexl++;
				indexresult++;
			}
			else if(indexr<right.length)
			{
				result[indexresult]= right[indexr];
				indexr++;
				indexresult++;
			}
		}
		return result;
	}
	
	
}