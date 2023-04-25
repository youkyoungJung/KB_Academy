package sp0425_aop.service;

import org.springframework.stereotype.Component;

@Component
public class MyCalc {

	public int plus(int i, int j) {
		return i+j;
	}
	public int minus(int i, int j) {
		return i-j;
	}
	
}
