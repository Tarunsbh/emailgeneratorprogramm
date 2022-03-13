package com.application.service;

import java.util.Scanner;

import com.application.model.Employee;

public class DriverClass {

	public static void main(String[] args) {
		Employee employee = new Employee("Tarun", "Sabharwal");

		CredentialService uid = new CredentialService();
		String createEmailid;
		char[] createPass;
		int option = 0;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Please enter the department from the following");
			System.out.println("1. Technical");
			System.out.println("2. Admin");
			System.out.println("3. Human Resource");
			System.out.println("4. Legal");
			option = scanner.nextInt();
			switch (option) {
			case 1:
				createEmailid = uid.createEmail(employee.getFirstName().toLowerCase(),
						employee.getLastName().toLowerCase(), "technical.company.com");
				createPass = uid.createPass();
				uid.display(employee, createEmailid, createPass);
				break;
			case 2:
				createEmailid = uid.createEmail(employee.getFirstName().toLowerCase(),
						employee.getLastName().toLowerCase(), "admin.company.com");
				createPass = uid.createPass();
				uid.display(employee, createEmailid, createPass);
				break;
			case 3:
				createEmailid = uid.createEmail(employee.getFirstName().toLowerCase(),
						employee.getLastName().toLowerCase(), "humanresource.company.com");
				createPass = uid.createPass();
				uid.display(employee, createEmailid, createPass);
				break;
			case 4:
				createEmailid = uid.createEmail(employee.getFirstName().toLowerCase(),
						employee.getLastName().toLowerCase(), "legal.company.com");
				createPass = uid.createPass();
				uid.display(employee, createEmailid, createPass);

				break;
			default:
				System.out.println("Please select the valid option.");
				System.out.println("");
				break;

			}
		} while (option != 0);
		scanner.close();
	}

}