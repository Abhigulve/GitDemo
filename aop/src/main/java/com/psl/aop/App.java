package com.psl.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.Interface.CustomerBo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext appContext=new ClassPathXmlApplicationContext("spring.xml");
    	CustomerBo customer = (CustomerBo) appContext.getBean("customerBo");
    	customer.addCustomer();
    }
}
