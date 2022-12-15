package org.tukorea.aop;

public class WordAspect {

	int i = 0;
	public void afterMethod() {
		i += 1;
		System.out.println("[AOP] Number of times read: " + i);
	}
}
