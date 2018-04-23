package Xml.XmlBasedHelloWorld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		HelloWorld helloWorldBean = context.getBean("helloWorld", HelloWorld.class);
		helloWorldBean.sayHello();
	}
}