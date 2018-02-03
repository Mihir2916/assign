package com.mj.UI;

import java.util.Scanner;

import com.cg.helper.Validator;
import com.mj.collectionHelper.*;

public class StudentUI {
	
	private Validator validate;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch=0;
		Scanner sc=new Scanner(System.in);
		StudentUI ui=new StudentUI();
		try
		{
			while(true)
			{System.out.println(" 1.Enter Student Id:\n 2.Enter Student Name:\n 3.Enter Teacher's Name\n 4.Enter Marks\n Enter Your Option:");
			ch=sc.nextInt();
			
			switch(ch)
			{
			case 1: System.out.println("Enter Student Id");
					ui.addDetails();
					break;
			case 2: System.out.println("Enter Student Name");
					break;
			case 3: System.out.println("Enter Teacher's Name");
					break;
			case 4: System.out.println("Enter Marks");
					break;
			default: System.exit(0);			
			}
			}
	}
		catch(Exception e)
		{
			System.out.println("Enter correct choice format");
		}
	}

	public void addDetails() throws Exception
	{
		Scanner scan=new Scanner(System.in);
		setValidate(new Validator());
		CollectionHelper CollectionHelper=new CollectionHelper();
		
		String sId;
		String sName,tName;
		double marks;
		System.out.println("enter Student ID:");
		sId=scan.next();
		
		if (Validator.validateID(sId))
		{
			CollectionHelper.addsId(Integer.parseInt(sId));
			System.out.println("Enter Student name:");
			sName=scan.next();
			
			if(Validator.validateName(sName))
			{
				CollectionHelper.addsName(sName);
				System.out.println("Enter Teacher's Name:");
				tName=scan.next();
			
				if(Validator.validateName(tName))
				{
					CollectionHelper.addtName((tName));
					System.out.println("Enter Teacher's Name:");
					marks=scan.nextDouble();
					
					if(Validator.validatemarks(marks))
					{
						CollectionHelper.addmarks(marks);
						System.out.println("Enter Marks:");
					
					}
				}
			}
		}
	}

	public Validator getValidate() {
		return validate;
	}

	public void setValidate(Validator validate) {
		this.validate = validate;
	}
}
