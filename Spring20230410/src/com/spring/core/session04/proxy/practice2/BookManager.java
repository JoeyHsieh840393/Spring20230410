package com.spring.core.session04.proxy.practice2;

import java.util.List;

public interface BookManager {
	public abstract void addBook(String title);
	public abstract List<String> queryBooks();
	public abstract void updateBook(String title, int index);
}
