package com.cg.uas.ui;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.cg.uas.dto.Application;
import com.cg.uas.dto.Programs_Scheduled;
import com.cg.uas.exception.UasException;
import com.cg.uas.service.IServiceUas;
import com.cg.uas.service.ServiceUasImpl;

public class ApplicantUI {

	
	
	public static void viewAllPrograms()
	{
		Scanner scan=new Scanner(System.in);
		IServiceUas service = null;
		try {
			service = new ServiceUasImpl();
		} catch (UasException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			List<Programs_Scheduled> list= service.allPrograms();
			System.out.println("The scheduled programs are");
			for(Programs_Scheduled s:list)
				System.out.println(s);
		} catch (UasException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Enter a key to return to main menu");
		scan.nextLine();
		Client.main(null);
		
	}




public static void applyForProgram()
{
	IServiceUas service = null;
	try {
		service = new ServiceUasImpl();
	} catch (UasException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Application applicant=new Application();
	Scanner scan =new Scanner(System.in);
;	for(int i=0;i<90;i++)System.out.println("\n");
	System.out.println("Welcome to the applicant portal");
	System.out.println("Please provide necerssary information");
	System.out.println("Enter Full Name");
   applicant.setFull_Name(scan.nextLine());	
	System.out.println("Enter date of birth(dd/MM/YYYY)");
	String dateofbirth=scan.nextLine();
	DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
	LocalDate dob=LocalDate.parse(dateofbirth,formatter);
	applicant.setDate_Of_Birth(dob);
	System.out.println("Select Highest Qualification");
	System.out.println("1.Btech/Be\n2.BCA\n3.MBA\n4.Mtech/ME\n5.Other degree");
	int flag=scan.nextInt();
	String degree=null;
	if(flag==1) degree="Btech/Be";
	else if(flag==2)degree="BCA";
			else if(flag==3)degree="MBA";
				else if(flag==4)degree="Mtech";
					else if(flag==5){
						System.out.println("Enter the degree");
						scan.nextLine();
						degree=scan.nextLine();}
	applicant.setHighest_Qualification(degree);
	System.out.println("Enter marks obtained");
	applicant.setMarks_Obtained(scan.nextInt());
	System.out.println("Enter your goals in short paragraph of 3-4 sentences");
	scan.nextLine();
	applicant.setGoals(scan.nextLine());
	System.out.println("Enter email ID");
	applicant.setEmail_Id(scan.nextLine());
	System.out.println("Enter Scheduled program ID");
	applicant.setScheduled_Program_Id(scan.nextLine());
	System.out.println("Enter status\n1.Married\n2.Single");
	String status=null;
	flag=scan.nextInt();
	if(flag==1)status="Married";
	else if(flag==2)status="Single";
    applicant.setStatus(status);
	System.out.println("Enter your address");
	scan.nextLine();
	applicant.setAddress(scan.nextLine());

	try {
		int apply=service.apply(applicant);
		System.out.println("Application successfully submitted.Your note the following application number for future reference ");
		System.out.println(apply);
		System.out.println("Enter a key to return to main menu");
		scan.nextLine();
		Client.main(null);
	} catch (UasException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}


public static void viewApplicationStatus()
{
	IServiceUas service = null;
	try {
		service = new ServiceUasImpl();
	} catch (UasException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	Scanner scan =new Scanner(System.in);
   System.out.println("Enter the applicant ID to view status");
   int application_Id=scan.nextInt();
   try {
	String status=service.status(application_Id);
	System.out.println("The status of the application is: "+"status");
	System.out.println("Enter a key to return to main menu");
	scan.nextLine();
	Client.main(null);
} catch (UasException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   
}
}