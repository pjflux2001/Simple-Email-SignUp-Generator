package emailapp;

import java.util.*;
import java.io.*;

public class EmailApp{
	public static void main(String[] args){
		System.out.println("Welcome to XCLRY's Email Management System");
		System.out.println("");
		System.out.println("Enter your full name : ");
		Scanner strScanner = new Scanner(System.in);
		String firstName, lastName;
		firstName = strScanner.next();
		lastName = strScanner.next();
		Email eml = new Email(firstName,lastName);
	}
}