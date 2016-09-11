package Programs;
import java.util.*;

public class SampleStringFunctions {

	
	/*
	 * To find the occurrence and the position of occurrence of a character in a given string.
	 */
	public static void findcharinstring(String s , char letter ){
		
		char[] c =(s.toLowerCase()).toCharArray();
		 int length =s.length();
		 int count=0, i=0;
		 String pos = " ";
		 for (char eachchar :c)
		 {
			 i=i+1;
			 if (eachchar==letter)
			 {
				  count =count +1;
				  pos =pos + " "+String.valueOf(i);
			 }
			
			 
		 }
		 System.out.println("positions of occurrence :" + pos);
		 System.out.println("count of occurrence" +count);
	}

	
	
}
