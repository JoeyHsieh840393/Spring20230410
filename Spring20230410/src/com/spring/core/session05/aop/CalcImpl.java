package com.spring.core.session05.aop;

import org.springframework.stereotype.Component;

@Component // 可以被 Spring 管理
public class CalcImpl implements Calc{

	@Override
	public Integer add(Integer x, Integer y) {
		// TODO Auto-generated method stub
		return x + y;
	}

	@Override
	public Integer div(Integer x, Integer y) {
		// TODO Auto-generated method stub
		return x / y;
	}
	
}
