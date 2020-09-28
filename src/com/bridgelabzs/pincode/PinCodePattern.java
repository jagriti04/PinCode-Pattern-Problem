package com.bridgelabzs.pincode;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PinCodePattern {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to pin code checker system");
		
		System.out.println("Enter the pin code:");
		String content = sc.nextLine();

		String pattern = "^([0-9]{6})$";
		
		boolean isMatch = Pattern.matches(pattern, content);
		
		if (isMatch) {
			System.out.println("The entered code is valid");
		} else {
			System.out.println("The entered code is invalid");
		}
	}
}
