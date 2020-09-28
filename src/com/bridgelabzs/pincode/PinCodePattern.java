package com.bridgelabzs.pincode;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PinCodePattern {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to pin code checker system");
		
		System.out.println("Enter the pin code:");
		String content = sc.nextLine();
		
		String newContent = content.replaceAll("\\s+","");			// remove the space from the entered pin code
		System.out.println("Check the PIN code- " + newContent);
		String pattern = "^([0-9]{6})$";
		
		boolean isMatch = Pattern.matches(pattern, newContent);
		
		if (isMatch) {
			System.out.println("The entered code is valid");
		} else {
			System.out.println("The entered code is invalid");
		}
	}
}
