package pl.wojcik.jakub.spring_tutorial;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pl.wojcik.jakub.spring_tutorial.api.UsersRepository;
import pl.wojcik.jakub.spring_tutorial.domain.User;

public class MainSpring {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("konfiguracja.xml");
		UsersRepository usersRepository = context.getBean(
				"repozytoriumUzytkownikow", UsersRepository.class);
		User kuba = usersRepository.createUser("Sylwia");
		User pawel = usersRepository.createUser("Kuba");
	}
}
