package com.demo.Dao;

import java.util.HashMap;
import java.util.Map;

import com.demo.Exceptions.WrongCredentialsException;

public class LoginDaoImpl implements LoginDao{
	static Map<String, String> deatils;
	static {
		deatils = new HashMap<>();
	}
	@Override
	public boolean add(String name, String pass) throws WrongCredentialsException {
		
			if(!deatils.containsKey(name)) {
				deatils.put(name, pass);
				return true;
			}
			throw new WrongCredentialsException("Wrong Credentials");
		
		
	}
	@Override
	public boolean login(String name, String pass) throws WrongCredentialsException {
		if(name != null && pass.equals(deatils.get(name))) {
			return true;
		}
		throw new WrongCredentialsException("Wrong Pass");
		
	}
}
