package com.spring.core.session04.proxy.dyn;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// 動態代理
public class DynProxy {
	
	// 被代理對象
	private Object object;

	public DynProxy(Object object) {
		super();
		this.object = object;
	}
	
	// 取得代理對象
	public Object getProxy() {
		Object proxyObj = null;
		// 1. 被代理對象的類別載入器
		ClassLoader loader = object.getClass().getClassLoader();  // 被代理物件是什麼類別
		// 2. 被代理對象所實作的介面
		Class<?>[] interfaces = object.getClass().getInterfaces(); // 
		// 處理代理的實現
		InvocationHandler handler = (Object proxy, Method method, Object[] args) -> {
			MyLogger myLogger = new MyLogger();
			// 公用邏輯-Before: 前置通知
			myLogger.before(method, args);
			
			Object resultObj = null;
			try {
				// 調用業務邏輯
				resultObj = method.invoke(object, args);
			} catch(Exception e) {
				// 公用邏輯-Exception: 異常通知
				myLogger.throwing(e);
			} finally {
				// 公用邏輯-End: 後置通知
				myLogger.end(resultObj);				
			}

			return resultObj;
		}; // 
		proxyObj = Proxy.newProxyInstance(loader, interfaces, handler);
		return proxyObj;
	}

}
