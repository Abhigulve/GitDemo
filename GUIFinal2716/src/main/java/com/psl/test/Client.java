package com.psl.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.bean.SignUp;
import com.psl.bean.Stock;
import com.psl.dao.DriverImpl;
import com.psl.dao.OrderImpl;
import com.psl.dao.ProductImpl;
import com.psl.dao.PurchaserImpl;

import com.psl.dao.SignUpImpl;
import com.psl.dao.StockCrudImpl;
import com.psl.dao.SupplierImpl;

public class Client {

	/*
	 * @Test public void signUpService(SignUp s) {
	 */

	public static void main(String[] args) {
		System.out.println("inside main");
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"app-config.xml");
		StockCrudImpl impl = (StockCrudImpl) appContext.getBean("stock");
		/*SupplierImpl supplier = (SupplierImpl)appContext.getBean("supplier");*/
		
		//ProductImpl product = (ProductImpl) appContext.getBean("product");

		// OrderImpl o = (OrderImpl) appContext.getBean("purchaserorder");
		/*
		 * SignUpImpl signup = (SignUpImpl) appContext.getBean("signup");
		 * System.out.println("inside signup");
		 */
	}

	/*
	 * // Login
	 * 
	 * RegisterImpl register = (RegisterImpl) appContext.getBean("register");
	 * register.login("abc", "123");
	 * 
	 * // Crud Operations on Stock StockCrudImpl impl = (StockCrudImpl)
	 * appContext.getBean("stock"); Stock s = new Stock(); s.setStock_Id("s2");
	 * s.setProduct_Name("Soap"); s.setLocation("Pune");
	 * s.setManager_Name("priya"); s.setQuantity(101); impl.add(s);
	 * System.out.println("Added successfully!!");
	 */

	// DriverImpl driver = (DriverImpl) appContext.getBean("driver");

	// SupplierImpl supplier = (SupplierImpl)
	// appContext.getBean("supplier");
	/*
	 * PurchaserImpl purchaser = (PurchaserImpl)
	 * appContext.getBean("purchaser");
	 */

	// sign up

	// signup.Signup(s);

}

/*
 * @Test public void loginservice(String username,String password) {
 * ApplicationContext appContext = new ClassPathXmlApplicationContext(
 * "app-config.xml");
 * 
 * LogInImpl l = (LogInImpl) appContext.getBean("login");
 * System.out.println("Inside login");
 * 
 * String str=l.retrive(username,password); System.out.println(str); }
 */

