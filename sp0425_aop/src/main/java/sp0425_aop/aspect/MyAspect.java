package sp0425_aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;


public class MyAspect {

	public void printBefore(JoinPoint jp) {
		System.out.println("Before!!!");
		Signature sig = jp.getSignature();/// ȣ���� ���� ����
		String name = sig.getName();
		System.out.println("Target Name: " + name);
		Object[] args = jp.getArgs();
		System.out.println("Args����: " + args.length);
		
	}
	public void printAfter(Object rtn) {
		System.out.println("** ���� �� **");
		System.out.println("��ȯ��= "+ rtn);
	}

}
