package com.psl.dao;

import com.psl.bean.Stock;

public interface IStockCrud {
	void add(Stock s);

	void update(String stock_Id);

	void delete(String stock_Id);

	Stock retrieve(String stock_Id);

}
