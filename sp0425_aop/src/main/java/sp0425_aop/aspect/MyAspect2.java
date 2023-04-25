package sp0425_aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect2 {
	//* sp0425_aop..MyCalc.*(..)
	//* ����Ÿ��  ��Ű����/��� ..->����� MyCalc.*(..))
	//MyCalc Ŭ������ .*(�޼ҵ��)
	@Before(value = "execution(* sp0425_aop..MyCalc.*(..))")
	public void printBefore(JoinPoint jp) {
		System.out.println("Before!!!");
		Signature sig = jp.getSignature();/// ȣ���� ���� ����
		String name = sig.getName();
		System.out.println("Target Name: " + name);
		Object[] args = jp.getArgs();
		System.out.println("Args����: " + args.length);
		
	}
//	@After
//	public void printAfter(Object rtn) {
//		System.out.println("** ���� �� **");
//		System.out.println("��ȯ��= "+ rtn);
//	}

}
