package com.mj.validator;

import java.util.regex.Pattern;
import java.lang.Exception;

public class StudentValidator 
{
	public static boolean validatesId(String sId) throws Exception
	{
		String pattern="(\\d){5}";
		try {if(Pattern.matches(pattern,sId)){
			return true;
		}
		else
	throw new Exception("Please enter valid Student Id");}
		catch (Exception e)
		{
			System.out.println("tested ok");
			return false;
		}
	}
	public static boolean validatesName(String sName)
	{
		String pattern="[a-z]{3,10}";
		try
		{
			if(Pattern.matches(pattern,sName)){
		
			return true;
		}
		else throw new Exception("Enter in the correct format");
		}
		catch (Exception e){
			System.out.println("enter in correct format");
			return false;
		}
	}
	public static boolean validatetName(String tName)
	{
		String pattern="[a-z]{3,10}";
		try
		{
			if(Pattern.matches(pattern,tName)){
		
			return true;
		}
		else throw new Exception("Enter in the correct format");
		}
		catch (Exception e){
			System.out.println("enter in correct format");
			return false;
		}
	}
	public static boolean validatemarks(String marks)
	{
		String pattern="(\\d){1,3}";
		try {if(Pattern.matches(pattern,marks)){
			return true;
		}
		else
	throw new Exception("Please enter valid Student Id");}
		catch (Exception e)
		{
			System.out.println("tested ok");
			return false;
		}
	}
}
