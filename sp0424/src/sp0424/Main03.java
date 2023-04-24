package sp0424;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import sp0424.bean.HelloBean;
import sp0424.bean.MyCalc;

public class Main03 {
//	public static void main(String[] args) {
//		//스프링 비 적용코드
//		HelloBean hb = new HelloBean();
//		String msg = hb.sayHello();
//		System.out.println(msg);
//	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// 스프링 적용( 빈적용 )
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//HelloBean hb = (HelloBean) context.getBean("hb");
		MyCalc mc = context.getBean(MyCalc.class); //호환타입여러개있는경우 문제발생
		int r = mc.plus(30,40);
		//int a = mc.minus(50, 40);
		System.out.println(r);
		//System.out.println(a);

	}
}
