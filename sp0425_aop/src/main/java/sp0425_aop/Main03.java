package sp0425_aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sp0425_aop.service.HelloService;
import sp0425_aop.service.MyCalc;

public class Main03 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String path = "applicationContext_03.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(path);

		MyCalc mc = context.getBean(MyCalc.class);
		int r = mc.plus(3, 4);
//		System.out.println("result = " + r);
//		System.out.println(mc.getClass().getName());
	}

}
