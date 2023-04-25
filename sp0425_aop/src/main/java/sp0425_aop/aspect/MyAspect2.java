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
	//* 리턴타입  패키지명/경로 ..->모든경로 MyCalc.*(..))
	//MyCalc 클래스명 .*(메소드명)
	@Before(value = "execution(* sp0425_aop..MyCalc.*(..))")
	public void printBefore(JoinPoint jp) {
		System.out.println("Before!!!");
		Signature sig = jp.getSignature();/// 호출대상에 대한 정보
		String name = sig.getName();
		System.out.println("Target Name: " + name);
		Object[] args = jp.getArgs();
		System.out.println("Args갯수: " + args.length);
		
	}
//	@After
//	public void printAfter(Object rtn) {
//		System.out.println("** 실행 후 **");
//		System.out.println("반환값= "+ rtn);
//	}

}
