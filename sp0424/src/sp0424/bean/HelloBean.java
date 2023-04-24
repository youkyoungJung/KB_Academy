package sp0424.bean;

import org.springframework.stereotype.Component;

import sp0424.logger.MyLogger;

public class HelloBean {

	private String name;
	// ȣ��Ƚ�� ��¿� ��ü
	private MyLogger logger;
	private int count = 0;

	public HelloBean() {
		System.out.println("������ HelloBean()");
	}

	public HelloBean(String name, MyLogger logger) {
		super();
		System.out.println("������ HelloBean()");
		this.name = name;
		this.logger = logger;
	}
	
	public void myInit() {
		System.out.println("myInit()");
	}

	public String sayHello() {
		logger.print("HelloBean, count = " + count++);
		return "Hello " + (name == null ? "" : name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLogger(MyLogger logger) {
		this.logger = logger;
	}
}
