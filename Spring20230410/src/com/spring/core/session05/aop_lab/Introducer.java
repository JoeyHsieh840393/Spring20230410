package com.spring.core.session05.aop_lab;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Component
@Aspect // 切面程式：介紹人/經紀人
public class Introducer {
	// 將 Performance 及旗子類別都可以轉 Singer (預設實作：BackSinger)
	@DeclareParents(value ="com.spring.core.session05.aop_lab.Performance+",
							defaultImpl = BackSinger.class)
	public Singer singer;
}
