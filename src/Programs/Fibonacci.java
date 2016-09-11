package Programs;

public class Fibonacci {
	public static int fib(int n){
		if(n ==0)
			return 0;
		else if (n==1)
			return 1;
		else
			return fib(n-1) + fib(n-2);
			
	}
	public static void printfib( int n){
		for (int i=0;i<n;i++)
		{
			System.out.println(fib(i));
		}
	}
	
	public static void fibinloop(int n)
	{
		int fibprev=0;
		int fib=1;
		if(n<=1)
			System.out.println(n);
		else
		{
			System.out.println(0);
			System.out.println(1);
			for(int i=2;i<n;i++)
			{
				int temp =fib;
				fib=fib + fibprev;
				fibprev=temp;
				System.out.println(fib);
			}
		}
		
	}

}
