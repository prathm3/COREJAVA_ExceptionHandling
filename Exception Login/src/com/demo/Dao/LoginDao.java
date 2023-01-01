package com.demo.Dao;

import com.demo.Exceptions.WrongCredentialsException;

public interface LoginDao {

	boolean add(String name, String pass) throws WrongCredentialsException;

	boolean login(String name, String pass) throws WrongCredentialsException;
	
}
