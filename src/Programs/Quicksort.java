package Programs;

public class Quicksort {
	
	public int Partition(int[] a, int start, int end)
	{
    int pivot =a[end];
    int pindex =start;
    for(int i=start;i<=end-1;i++)
    {
    	if(a[i]<=pivot)
    	{
    		int temp=a[pindex];
    		a[pindex]=a[i];
    		a[i]=temp;
    		pindex++;
    	}
    	
    }
    
    int temp=a[pindex];
    a[pindex]=a[end];
    a[end]=temp;
	return pindex;
	}
	
	public void quicksort(int[] a, int low, int high)
	{
		int pivot;
		if (high>low)
		{
			pivot=Partition(a, low, high);
			quicksort(a, low,pivot-1);
			quicksort(a, pivot+1, high);
		}
		
	}
	
	public void print(int[] a){
		quicksort(a, 0, a.length-1);
		for (int i :a)
			System.out.println(i);
	}

}
