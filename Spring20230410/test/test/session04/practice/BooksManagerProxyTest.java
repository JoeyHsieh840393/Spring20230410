package test.session04.practice;

import com.spring.core.session04.proxy.practice2.BookManager;
import com.spring.core.session04.proxy.practice2.BookManagerProxy;

public class BooksManagerProxyTest {
	public static void main(String[] args) {
		BookManager bookManager = new BookManagerProxy();
		
		bookManager.addBook("Java教學");
		System.out.println(bookManager.queryBooks());
		bookManager.updateBook("C++教學", 0);
		System.out.println(bookManager.queryBooks());
	}

}
