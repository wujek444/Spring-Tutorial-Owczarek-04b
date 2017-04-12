package pl.wojcik.jakub.spring_tutorial;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pl.wojcik.jakub.spring_tutorial.api.UsersRepository;
import pl.wojcik.jakub.spring_tutorial.domain.User;
import pl.wojcik.jakub.spring_tutorial.implementations.SomeBean;

public class MainSpring {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("konfiguracja.xml");
		SomeBean bean = context.getBean("someBean", SomeBean.class);
	}
}
