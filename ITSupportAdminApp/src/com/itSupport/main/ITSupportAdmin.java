package com.itSupport.main;

import java.util.Scanner;

import com.itSupport.model.Employee;
import com.itSupport.service.CredentialService;

public class ITSupportAdmin {

	public static void main(String[] args) {

		CredentialService supportService = new CredentialService();
		
		Employee emp1 = new Employee("John", "Smith");
		
		// Scanner object to get input from the user
		Scanner sc = new Scanner(System.in);

		int option;
		System.out.println("Please enter the department from the following \n");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");

		option = sc.nextInt();
		String department = "";
		
		 // Passing the department name based on the option given by the user
		switch (option) {
			case 1: {
				department = "tech";
				break;
			}
	
			case 2: {
				department = "admin";
				break;
			}
	
			case 3: {
				department = "hr";
				break;
			}
			case 4: {
				department = "legal";
				break;
			}
	
			default: {
				System.out.println("Enter valid option");
			}
		}
		if (department != "") {
			emp1.setEmail(supportService.generateEmailAddress(emp1.getFirstName(), emp1.getLastName(),
					emp1.getCompanyName(), department));
			emp1.setPassword(supportService.generatePassword());
			supportService.showCredentials(emp1);
		}
		sc.close();
	}
}
