package emailapp;

import java.util.*;
import java.util.ArrayList;
import java.io.*;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private String email;

	public Email(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("");
		System.out.println("Hi, " + firstName + " " + lastName + "!");
		System.out.println("");
		this.department = setDepartment();
		System.out.println("Department " + this.department + " selected Successfully!");
		System.out.println("");
		this.password = randomPassword(10);
		System.out.println("Your password is " + this.password);
		System.out.println("");
		this.email = firstName.toLowerCase() +"."+lastName.toLowerCase() + ((int)(100*Math.random())) +"@"+department + ".xclry.com";
		System.out.println("Your email is " + email);
		System.out.println("");
	}

	private String setDepartment(){
		System.out.println("Enter your department : \n 1 for Sales \n 2 for Development \n 3 for Account \n 0 for None");
		Scanner inputScanner = new Scanner(System.in);
		int deptChoice = inputScanner.nextInt();
		switch(deptChoice){
			case 1:
				return "sales";
			case 2:
				return "development";
			case 3: 
				return "account";
			default:
				return "none";
		}
	}

	private String randomPassword(int length){
		String passwordSet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890!@#$%^&*()-+=_";
		char[] password = new char[length];
		System.out.println("Choose one of the following generated passwords : ");
		ArrayList<String> passwordMap = new ArrayList<String>();
		for(int  j = 0 ; j < (this.department.length()*10)*Math.random() ; j++){
			for(int i = 0 ; i <length ; i++){
				password[i] = passwordSet.charAt((int)(Math.random() * passwordSet.length()));
			}
			passwordMap.add( new String(password));
			System.out.println(j + " : " + passwordMap.get(j));
		}
		Scanner inputScanner = new Scanner(System.in);
		int passChoice = inputScanner.nextInt();
		return new String(passwordMap.get(passChoice));
	}

	private void setMailboxCapacity(int capacity){
		this.mailboxCapacity = capacity;
	}

	private void setAltEmail(String altEmail){
		this.alternateEmail = altEmail;
	}

	private void changePassword(String password){
		this.password = password;
	}
}