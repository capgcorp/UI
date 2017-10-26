package com.cg.uas.ui;

import java.io.IOException;
import java.util.Scanner;

import com.cg.uas.ui.ApplicantUI; 

public class Client {

	
	//Main function showing the first page of UI
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int opt = 0;
		while(true)
		{
			
		System.out.println("University Admission System");
		System.out.println("---------------------------");
		System.out.println("Choose from the following options");
		System.out.println("1.Applicant");
		System.out.println("2.Members of Admission Committee(MAC)");
		System.out.println("3.Administrators");
		System.out.println("4.Exit");
		
		opt = scan.nextInt();
		switch (opt) {
		case 1:
			applicantfunction();
			break;
		case 2:
			macfunction();
			break;
		case 3:
			adminfunction();
			break;
		case 4:
			System.out.println("Thank you!! Exiting...");
			System.exit(0);
		default:
			System.out.println("Please choose a valid option");
			break;

		}                                             //switch closing
		}                                             //while closing
	}												//main closing
	
	
	
	
	
	
	//The console page showing applicant entry
	public static void applicantfunction()
	{
		Scanner scan = new Scanner(System.in);
		int opt=0;
		for(int i=0;i<90;i++)System.out.println("\n");
		System.out.println("Applicant Interface");
		System.out.println("-------------------");
		System.out.println("Choose from the following options");
		System.out.println("1.View all programs scheduled by the university");
		System.out.println("2.Apply online for a scheduled program");
		System.out.println("3.View the application status");
		System.out.println("4.Return to main menu");
		System.out.println("5.Exit");
		opt = scan.nextInt();
		switch (opt) {
		case 1:
			 ApplicantUI.viewAllPrograms();
			break;
		case 2:
			 ApplicantUI.applyForProgram();
			break;
		case 3:
			 ApplicantUI.viewApplicationStatus();
			break;
		case 4:
			for(int i=0;i<90;i++)System.out.println("\n");
			System.out.println("Thank you!! returning to main menu...");
			main(null);
		case 5:
			System.out.println("Thank you!! Exiting...");
			System.exit(0);
		default:
			System.out.println("Please choose a valid option");
			applicantfunction();

		}                                             //switch closing
		}  												//function closing
		
		
		

	
	
	
	
	
	
	//The console page showing MAC entry
	public static void macfunction()
	
	{
		Scanner scan = new Scanner(System.in);
		int opt=0;
		
		System.out.println("Welcome to Member of Admission Committee Login");
		System.out.println("Please Enter the userID");
		String name=scan.nextLine();
		System.out.println("Please Enter the password");
		String pwd=scan.nextLine();
		if(name.equals("admin")&&pwd.equals("admin"))
		{
		for(int i=0;i<90;i++)System.out.println("\n");
		System.out.println("MAC Interface");
		System.out.println("-------------");
		System.out.println("Choose from the following options");
		System.out.println("1.View applications for a specific program");
		System.out.println("2.Accept/Reject an application");
		System.out.println("3.Update the status of the application post interview");
		System.out.println("4.Return to main menu");
		System.out.println("5.Exit");
		opt = scan.nextInt();
		switch (opt) {
		case 1:
			 MACUI.viewApplications();
			break;
		case 2:
			MACUI.processApplication();
			break;
		case 3:
			MACUI.updateApplicationStatus();
			break;
		case 4:
			for(int i=0;i<90;i++)System.out.println("\n");
			System.out.println("Thank you!! returning to main menu...");
			main(null);
		case 5:
			System.out.println("Thank you!! Exiting...");
			System.exit(0);
		default:
			System.out.println("Please choose a valid option");
			macfunction();

		}    
		}
		
		else
		{
			System.out.println("The userID password combination is wrong.Please enter again");
			macfunction();
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//The console page showing admin entry
	public static void adminfunction(){
		

		Scanner scan = new Scanner(System.in);
		int opt=0;
		
		System.out.println("Welcome to Admin Login");
		System.out.println("Please Enter the userID");
		String name=scan.nextLine();
		System.out.println("Please Enter the password");
		String pwd=scan.nextLine();
		if(name.equals("admin")&&pwd.equals("admin"))
		{
		for(int i=0;i<90;i++)System.out.println("\n");
		System.out.println("Admin Interface");
		System.out.println("---------------");
		System.out.println("Choose from the following options");
		System.out.println("1.Update and manage programs");
		System.out.println("2.Manage schedules of the programs");
		System.out.println("3.Generate reports");
		System.out.println("4.Return to main menu");
		System.out.println("5.Exit");
		opt = scan.nextInt();
		switch (opt) {
		case 1:
			 AdminUI.updatePrograms();
			break;
		case 2:
			AdminUI.manageSchedules();
			break;
		case 3:
			AdminUI.generateReports();
			break;
		case 4:
			for(int i=0;i<90;i++)System.out.println("\n");
			System.out.println("Thank you!! returning to main menu...");
			main(null);
		case 5:
			System.out.println("Thank you!! Exiting...");
			System.exit(0);
		default:
			System.out.println("Please choose a valid option");
			adminfunction();

		}    
		}
		
		else
		{
			System.out.println("The userID password combination is wrong.Please enter again");
			adminfunction();
		}
		
		
		
		
	}
	

}
