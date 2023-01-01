package com.demo.test;

import java.util.Scanner;

import com.demo.Exceptions.WrongCredentialsException;
import com.demo.servicw.LoginService;
import com.demo.servicw.LoginServiceImpl;

public class LoginTest {
	public static void main(String[] args) {
		LoginService loginservice = new LoginServiceImpl();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		while(true) {
			System.out.println("1. add new user\n2. Login\n3. exit");
			System.out.println("choice: ");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				try {
					boolean status = loginservice.addUser();
					if(status) {
						System.out.println("added");
					}
				}catch(WrongCredentialsException e) {
					System.out.println(e.getMessage());
					System.exit(0);
				}
				break;
			case 2:
				for(int i=0; i<=2; i++) {
					try {
						boolean status = loginservice.loginUser();
						if(status) {
							System.out.println("Login successful");
							break;
						}
					}catch(WrongCredentialsException e) {
						if(i==2)
						System.out.println(e.getStackTrace());
					}
				}
				break;
			}
		}
	}
}
