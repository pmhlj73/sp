package org.kg.myapp;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TimeTracer {

	// bean(helloController)
	// within(org.kg.myapp.HelloController)				3줄이 같은 코드
	@Around(value="execution(* org..HelloController.*(..))")
	public Object trace(ProceedingJoinPoint joinPoint) throws Throwable {
		//Signature method = joinPoint.getSignature(); // signature는 메서드
		//String methodName = method.getName();
		//System.out.println(methodName + " 시작. 시작 시간 : " + new java.util.Date());
		long start = System.currentTimeMillis(); // 운영체제 기준 시간
		//System.nanoTime(); // 1900년 기준
		Object result = joinPoint.proceed();
		long end = System.currentTimeMillis();
		//System.out.println(methodName + " 종료. 종료 시간 : " + new java.util.Date());
		System.out.println("실행 시간 : " +(end-start));
		return result;
	}
	
	
	
}
