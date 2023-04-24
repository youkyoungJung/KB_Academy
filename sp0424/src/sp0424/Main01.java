package sp0424;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import sp0424.bean.HelloBean;

public class Main01 {
//	public static void main(String[] args) {
//		//������ �� �����ڵ�
//		HelloBean hb = new HelloBean();
//		String msg = hb.sayHello();
//		System.out.println(msg);
//	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// ������ ����( ������ )
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//HelloBean hb = (HelloBean) context.getBean("hb");
		HelloBean hb = context.getBean("hb", HelloBean.class); //ȣȯŸ�Կ������ִ°�� �����߻�
		String msg = hb.sayHello();
		System.out.println(msg);

	}
}
