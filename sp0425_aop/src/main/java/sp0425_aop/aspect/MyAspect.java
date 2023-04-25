package sp0425_aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;


public class MyAspect {

	public void printBefore(JoinPoint jp) {
		System.out.println("Before!!!");
		Signature sig = jp.getSignature();/// 호출대상에 대한 정보
		String name = sig.getName();
		System.out.println("Target Name: " + name);
		Object[] args = jp.getArgs();
		System.out.println("Args갯수: " + args.length);
		
	}
	public void printAfter(Object rtn) {
		System.out.println("** 실행 후 **");
		System.out.println("반환값= "+ rtn);
	}

}
