package Programs;

public class countingsort {
	
	public void sort(int[] a, int maxelement)
	{
		int size= a.length;
		int[] result = new int[size];
		
		//create an array with count as maxelement.
		int[] b= new int[maxelement+1];
		for (int i =0;i<=maxelement;i++)
		{
			b[i]=0;
		}
		
		//find the count of elements  in array a and update array b .
		
		for(int i=0;i<size;i++)
		{
			b[a[i]]=b[a[i]] +1;
		}
		
		for(int i=1;i<=maxelement;i++)
		{
			b[i]=b[i-1]+b[i];
			
		}
				
		for(int i =size-1;i>=0;i--)
		{
			
			int temp=a[i];   
			int btemp=b[temp];  
			result[btemp-1]=a[i]; 
			b[temp]=b[temp]-1;
		}
		
		for(int i :result)
			System.out.println(i);
		
		
	}

}
