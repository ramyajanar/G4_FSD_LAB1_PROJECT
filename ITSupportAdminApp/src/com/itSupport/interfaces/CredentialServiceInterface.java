package com.itSupport.interfaces;

import com.itSupport.model.Employee;

public interface CredentialServiceInterface {
	public String generatePassword();

	public String generateEmailAddress(String firstName, String lastName, String comapanyName, String department);

	public void showCredentials(Employee employee);
}
