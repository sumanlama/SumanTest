package com.testng.tests;

import java.util.Scanner;

import org.testng.annotations.Test;

import com.string.testbase.TestBase;

public class UnitTestCases {
	//Creating Scanner object for user Input
	 Scanner scn = new Scanner(System.in);
	
	@Test(priority=0)
	public void testLongestWordLength()
	{
	System.out.println("Please enter the String to the see the ******Length***** of the longest Word");	
	//provide the user input
		String s =scn.nextLine();
		//Calling the static function using classname
		System.out.println(TestBase.lengthLongestWord(s));
		System.out.println("Test completed successfully");
	}
	
	@Test(priority=1)
	public void testLongestWord()
	{
	System.out.println("Plese Enter the String to see the *****longest Word*****");	
	//provide the user input
		String s =scn.nextLine();
		//Calling the static function using classname
		System.out.println(TestBase.longestWord(s));
		System.out.println("Test completed successfully");
	}
	
	@Test(priority=2)
	public void testLongestWordAndLength()
	{
	System.out.println("Please enter the String to the see the *********Length and longest Word********* in the String");	
	//provide the user input
		String s =scn.nextLine();
		//Calling the static function using classname
		System.out.println(TestBase.lengthLongestWord(s));
		System.out.println(TestBase.longestWord(s));
		System.out.println("Test completed successfully");
	}
	
	@Test(priority=3)
	public void testMultipleLongestSameWord()
	{
	System.out.println("Please Enter a two String with ******Same length******");	
	//provide the user input
		String s =scn.nextLine();
		//Calling the static function using classname
		System.out.println(TestBase.longestWord(s));
		System.out.println("Test completed successfully");
	}
	
	@Test(priority=4)
	public void testLongestLenghtWordRegularExpression()
	{
	System.out.println("Please enter the String with *******regular Expression*******");	
	//provide the user input
		String s =scn.nextLine();
		//Calling the static function using classname
		System.out.println(TestBase.lengthLongestWord(s));
		System.out.println("Test completed successfully");
	}
	
	@Test(priority=5)
	public void testLenghtSpace()
	{
	System.out.println("Please enter the String with *******multiple Spaces*******");	
	//provide the user input
		String s =scn.nextLine();
		//Calling the static function using classname
		System.out.println(TestBase.lengthLongestWord(s));
		System.out.println("Test completed successfully");
	}

}