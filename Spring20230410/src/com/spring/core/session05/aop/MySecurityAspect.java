package com.spring.core.session05.aop;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class MySecurityAspect {
	@Pointcut(value = "execution(* com.spring.core.session05.aop.ComputerImpl.*(..))")
	private void pt() {
		
	}
	
	// 環繞通知
	@Around(value = "pt()")
	public Object aroundAdvice(ProceedingJoinPoint joinPoint) {
		// joinpoint 回傳值
		Object result = null;
//		1. 環繞通知 - 前置通知
		String methodName = joinPoint.getSignature().getName();
		Object[] argrs = joinPoint.getArgs();
		System.out.printf("環繞通知-前置通知： 方法名稱： %s 參數列： %s \n", methodName, Arrays.toString(argrs));
		try {
			// 執行 joinpoint 的業務邏輯
			result = joinPoint.proceed();
			//2. 環繞通知 - 返回通知
			System.out.printf("環繞通知-返回通知：result = %s \n", result);
		} catch (Throwable ex) {
			//3. 環繞通知 - 異常通知
			System.err.printf("環繞通知-異常通知：ex = %s \n", ex);
		} finally {
			//4. 環繞通知 - 後置通知
			System.out.println("環繞通知 - 後置通知");
		}
		return result;
	}
}
