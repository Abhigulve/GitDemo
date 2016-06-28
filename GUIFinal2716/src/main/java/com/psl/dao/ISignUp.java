package com.psl.dao;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import com.psl.bean.SignUp;


public interface ISignUp {
	
	public void Openpage(HttpServletResponse res,String username,String password) throws IOException;
	public void Signup(SignUp s);
}
