package edu.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class XmlAspect {
	public void before() {
		System.out.println("before");
	}

	public void afterThrowing() {
		System.out.println("afterThrowing");
	}

	public void after() {
		System.out.println("after");
	}

	public void afterReturning() {
		System.out.println("afterReturning");
	}
}