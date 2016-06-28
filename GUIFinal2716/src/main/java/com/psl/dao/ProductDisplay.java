package com.psl.dao;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.psl.bean.Product;
import com.psl.bean.Stock;

public class ProductDisplay {
	HibernateTemplate template;  
	public void setTemplate(HibernateTemplate template) {  
	    this.template = template;  
	}  
	
	
}
