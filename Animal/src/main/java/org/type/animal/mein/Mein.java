package org.type.animal.mein;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.type.animal.impls.getActions.GetActions;

public class Mein {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		GetActions actionAllAnimal = (GetActions) context.getBean("action");
		actionAllAnimal.eat();
	}

}
