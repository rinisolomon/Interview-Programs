package Programs;
import java.util.*;

public class replacewithgreaterelement {
	
	public static void replace(int[] a){
		int size=a.length;
        int max=0; 
        for(int i=0;i<size-1;i++)
        {
        	for(int j=i+1;j<=size-1;j++)
        	{       		
        		if(a[j]>max)
        		{
        			max=a[j];
        		}
        		
        	}
        	a[i]=max;
        	max=0;
        }
		for(int i:a)
			System.out.println(i);
	  }
	
	
	public static void simplereplace(int[] a){
		int size=a.length;
		int max= a[size-1];
		
		for(int i=size-2;i>=0;i--)
		{
			if(a[i]>max)
			{	
			
			max=a[i];
			}
			
			a[i]=max;
		}
		for(int i:a)
			System.out.println(i);
	}
}