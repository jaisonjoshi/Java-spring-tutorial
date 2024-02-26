package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static ApplicationContext context;
	
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("beans.xml");
		
		Hello hello = (Hello) context.getBean("Hello");
		hello.sayHello();
	}

}
