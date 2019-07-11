package edu.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect // �ڵ� ��ĵ���� �ʱ� ������ bean���� ������࿩��
public class AnnotationAspect {
	@Pointcut("execution(* edu.spring.aop.Emp.getOffWork(..))")
	public void pointCut() {
	}

	@Before("pointCut()")
	public void before() {
		System.out.println("before");
	}

	@AfterThrowing("pointCut()")
	public void afterThrowing() {
		System.out.println("afterThrowing");
	}

	@After("pointCut()")
	public void after() {
		System.out.println("after");
	}

	@AfterReturning("pointCut()")
	public void afterReturning() {
		System.out.println("afterReturning");
	}
}