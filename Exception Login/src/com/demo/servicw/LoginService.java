package com.demo.servicw;

import com.demo.Exceptions.WrongCredentialsException;

public interface LoginService {

	boolean addUser() throws WrongCredentialsException;

	boolean loginUser() throws WrongCredentialsException;

}
