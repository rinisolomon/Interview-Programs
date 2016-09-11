package Programs;

public class ExcercisePrograms {
	
	public static void main(String[] args)
	{
		System.out.println("hello world");
		//SampleStringFunctions ssf = new SampleStringFunctions();
		//ssf.findcharinstring("This is a sample program", 's');
	
		replacewithgreaterelement rg = new replacewithgreaterelement();
		int[] b = {6,7,4,3,5,2};
		//rg.replace(b);
		//rg.simplereplace(b);
	
		/*
		 * Fibonacci series
		 */
		 Fibonacci f= new Fibonacci();
		 f.printfib(10);
		 f.fibinloop(10);
		 
		 /*
		  * Factorial
		  */
		 Factorial f1 = new Factorial();
		// System.out.println("The Factorial is :" + f1.fact(5));
	}
	

}
