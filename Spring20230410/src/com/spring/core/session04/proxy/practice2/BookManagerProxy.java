package com.spring.core.session04.proxy.practice2;

import java.util.List;

public class BookManagerProxy implements BookManager{
	BookManager bookManager;

	public BookManagerProxy() {
		super();
		this.bookManager = new BookManagerImpl();
	}

	@Override
	public void addBook(String title) {
		bookManager.addBook(title);
		System.out.println("新增圖書成功");		
	}

	@Override
	public List<String> queryBooks() {
		System.out.println("查詢圖書成功");
		return bookManager.queryBooks();
	}

	@Override
	public void updateBook(String title, int index) {
		bookManager.updateBook(title, index);
		System.out.println("更新圖書成功");
	}
	
}
