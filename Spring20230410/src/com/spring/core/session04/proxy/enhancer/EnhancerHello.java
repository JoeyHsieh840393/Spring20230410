package com.spring.core.session04.proxy.enhancer;

// 子類別：增強的意思
public class EnhancerHello extends Hello{

	@Override // 覆寫有攔截的意思( Interceptor )
	public String sayHello(String str) {
		// 公用方法
		System.out.println("請出示實聯簡訊證明 !");
		return super.sayHello(str); // 調用父類別的商業方法
	}
	
}
