package sp0424.logger;

import org.springframework.stereotype.Component;

@Component
public class MyScreenLogger implements MyLogger{

	public void print(String str) {
		System.out.println(str);
	}

}
