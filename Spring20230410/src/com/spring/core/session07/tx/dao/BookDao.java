package com.spring.core.session07.tx.dao;

public interface BookDao {
// CRUD ... 略
	Integer getPrice(Integer bookId); // 取讀書本價格
	Integer updateStock(Integer bookId); // 更新書本庫存(目前庫存 - 1)
	Integer updateWallet(String username, Integer price); // 客戶目前餘額(balance)減去書本價格	
}
