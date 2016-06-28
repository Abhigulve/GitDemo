package com.psl.dao;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.psl.bean.SignUp;
import com.psl.bean.Stock;

public class SignUpImpl implements ISignUp {

	
	HibernateTemplate template;  
	public void setTemplate(HibernateTemplate template) {  
	    this.template = template;  
	}  
	
	
	public void Signup(SignUp s) {
		// TODO Auto-generated method stub
		template.save(s);
	}


	public void Openpage(HttpServletResponse res, String username,
			String password) throws IOException {
		// TODO Auto-generated method stub
		
	}


	

	

}
