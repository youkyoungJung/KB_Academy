package sp0424;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import sp0424.bean.HelloBean;

public class Main01 {
//	public static void main(String[] args) {
//		//스프링 비 적용코드
//		HelloBean hb = new HelloBean();
//		String msg = hb.sayHello();
//		System.out.println(msg);
//	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// 스프링 적용( 빈적용 )
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//HelloBean hb = (HelloBean) context.getBean("hb");
		HelloBean hb = context.getBean("hb", HelloBean.class); //호환타입여러개있는경우 문제발생
		String msg = hb.sayHello();
		System.out.println(msg);

	}
}
