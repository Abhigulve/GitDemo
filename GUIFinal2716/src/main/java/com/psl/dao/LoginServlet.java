package com.psl.dao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.psl.bean.SignUp;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	HibernateTemplate template;  
	public void setTemplate(HibernateTemplate template) {  
	    this.template = template;  
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("inside servlet");
		String username = request.getParameter("username");
		String password = request.getParameter("password").toString();
		System.out.println(username);
		/*String str = null;
		try{
		System.out.println("inside retrieve");
		
		SignUp s=(SignUp)template.get(SignUp.class,username); 
		System.out.println("abc");
		if(s.getPassword().equals(password)){
			str="Log In successful!!!";
			System.out.println(str);
			
			if(s.getRole().equals("Supplier"))
			{
				// res.sendRedirect("redirecttosupplier.jsp");
				
			}
				
			//return str;
		}
		
		}
		catch(Exception e){
			System.out.println("Log in unsuccessful!!!");
		}
		//return str;
	    
	   
		*/
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
