package com.itSupport.service;

import com.itSupport.interfaces.CredentialServiceInterface;
import com.itSupport.model.Employee;

public class CredentialService implements CredentialServiceInterface {
	
	// Function to generate password
	@Override
	public String generatePassword() {
		String numbers = "0123456789";
		String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCase = "abcdefghijklmnopqrstuvwxyz";
		String specialChar = ".?<>)/!@#$%^&*_=+-";
		String fullString = numbers + upperCase + lowerCase + specialChar;
		String password;
		
		/* First four character of the password, the password should contain atleast one upper case, 
		 * lower case, number and special character.
		 */
		password = getRandomChar(upperCase);
		password = password + getRandomChar(numbers);
		password = password + getRandomChar(lowerCase);
		password = password + getRandomChar(specialChar);
		
		// Next four character of the password, getting next four random characters
		for (int i = 0; i < 4; i++) {
			password = password + getRandomChar(fullString);
		}
		return password;
	}
	
	// Function to return random character from given string
	private String getRandomChar(String input) {
		// generate random index
		int index = (int) (Math.random() * (input.length() - 1));

		// get the character at that index
		char ch = input.charAt(index);
		String s = "";
		return s + ch;

	}

	// Function to generate email address
	@Override
	public String generateEmailAddress(String firstName, String lastName, String comapanyName, String department) {
		// TODO Auto-generated method stub
		return firstName + lastName + "@" + department + "." + comapanyName + ".com";
	}
	
	// Function to show the credentials
	@Override
	public void showCredentials(Employee employee) {

		String displayString = "Dear " + employee.getFirstName() + " your generated credentials are as follows\n"
				+ "Email    --> " + employee.getEmail() + "\n" + "Password --> " + employee.getPassword();

		System.out.println(displayString);

	}

}
