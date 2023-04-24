package sp0424.bean;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import sp0424.logger.MyLogger;

@Component
public class MyCalc {
//	@Autowired
//	@Qualifier(value = "myFileLogger")
	@Resource(name="myFileLogger")
	private MyLogger logger;

	public int plus(int i, int j) {
		logger.print(i+"+"+j);
		return i+j;
	}
	public int minus(int i, int j) {
		// TODO Auto-generated method stubhttps://github.com/youkyoungJung/KB_Academy.git
		return i-j;
	}
	public int multi(int i, int j) {
		// TODO Auto-generated method stub
		return i*j;
	}
	public int div(int i, int j) {
		// TODO Auto-generated method stub
		return i/j;
	}
}
