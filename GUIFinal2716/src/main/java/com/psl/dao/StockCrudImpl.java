package com.psl.dao;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.psl.bean.Stock;

public class StockCrudImpl implements IStockCrud {

	HibernateTemplate template;  
	public void setTemplate(HibernateTemplate template) {  
	    this.template = template;  
	}  
	
	public void add(Stock s) {
		// TODO Auto-generated method stub
		template.save(s); 
	}

	public void update(String stock_Id) {
		// TODO Auto-generated method stub
		template.update(stock_Id);
	}

	public void delete(String stock_Id) {
		// TODO Auto-generated method stub
		template.delete(stock_Id);
	}

	public Stock retrieve(String stock_Id) {
		// TODO Auto-generated method stub
		 Stock s=(Stock)template.get(Stock.class,stock_Id);  
		    return s; 
	}

}
