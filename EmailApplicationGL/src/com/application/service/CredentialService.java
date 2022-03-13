package com.application.service;

import java.util.Random;
import com.application.model.Employee;

public class CredentialService {

	// generating email ID
	// @param firstname
	// @param lastname
	// @param departmet
	// @return email Id

	public String createEmail(String firstName, String lastName, String department) {
		return firstName + lastName + "@" + department;
	}

	// Generating random password
	// @return random password

	public char[] createPass() {
		String cpLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smLetter = "abcdefghijklmnopqrdstuvwxyz";
		String num = "0123456789";
		String spchar = "!@#$%^&*()_+|:'<>,.?/*-+";

		String pass = cpLetter + smLetter + num + spchar;

		Random random = new Random();

		char[] password = new char[8];
		for (int a = 0; a < 8; a++) {
			password[a] = pass.charAt(random.nextInt(pass.length()));
		}
		return password;
	}

	public void display(Employee employee, String createEmail, char[] createPass) {
		System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows.");
		System.out.println("eMail ID: " + createEmail);
		System.out.print("Password: ");
		System.out.println(createPass);
		System.out.println("");
		
	}
	

}
