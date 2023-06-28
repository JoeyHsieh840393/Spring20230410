package com.spring.core.session04.proxy.practice2;

import java.util.ArrayList;
import java.util.List;

public class BookManagerImpl implements BookManager{
	private List<String> books = new ArrayList<String>();

	@Override
	public void addBook(String title) {
		books.add(title);		
	}

	@Override
	public List<String> queryBooks() {
		List<String> books = this.books;
		return books;
	}

	@Override
	public void updateBook(String title, int index) {
		books.set(index, title);
	}
}
