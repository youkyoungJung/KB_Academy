package sp0425_aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sp0425_aop.service.HelloService;

public class Main01 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String path = "applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(path);
		HelloService service = context.getBean(HelloService.class);
		System.out.println(service.sayHello());
		System.out.println(service.sayHello("ȫ�浿"));
	}

}
