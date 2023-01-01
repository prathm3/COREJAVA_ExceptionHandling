package com.demo.servicw;

import java.util.Scanner;

import com.demo.Dao.LoginDao;
import com.demo.Dao.LoginDaoImpl;
import com.demo.Exceptions.WrongCredentialsException;

public class LoginServiceImpl implements LoginService {
	private LoginDao ldao;

	public LoginServiceImpl() {
		ldao = new LoginDaoImpl();
	}

	@Override
	public boolean addUser() throws WrongCredentialsException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter pass");
		String pass = sc.next();
		return ldao.add(name, pass);
	}

	@Override
	public boolean loginUser() throws WrongCredentialsException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter pass");
		String pass = sc.next();
		return ldao.login(name, pass);
	}
	
	
}	
