package com.string.testbase;

public class TestBase {
	
	//public static generic function which accepts String argument and return int type.
	public static int lengthLongestWord(String s)
	{
		//String s will be split into String Array using space delimiter
		String []str = s.split(" ");
		//initializing variable big with value 0
		int big=0;
		//iterating through the every element in String array
		for(int i=0; i<str.length;i++ )
		{
			//Comparing the first element length with big variable
			if(str[i].length()>big)
			{
				// if first element length is bigger than big then reassign  big variable to current String element length.
				big=str[i].length();
			}
		}
		//returning the big
		return big;
	}
	////public static generic function which accepts String argument and return String type.
	public static String longestWord(String s)
	{
		//String s will be split into String Array using space delimiter
		String []str = s.split(" ");
		//initializing variable index with value 0
		int index=0;
		// Storing 1st String Object to variable to element
		int element =str[0].length();
		//iterating through the every element in String array
		for(int i=1; i<str.length;i++)
		{
			//Comparing the first element length with element variable
			if(str[i].length()>element)
			{
				//Reassign index to i
				index=i;
				//Reassign element to current String object
				element = str[i].length();
				
			}
		}
		//return the String with longest word length
		return str[index];
		
	}
	
}