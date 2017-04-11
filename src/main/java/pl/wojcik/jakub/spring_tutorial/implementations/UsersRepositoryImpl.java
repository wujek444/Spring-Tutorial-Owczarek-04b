package pl.wojcik.jakub.spring_tutorial.implementations;

import pl.wojcik.jakub.spring_tutorial.api.Logger;
import pl.wojcik.jakub.spring_tutorial.api.UsersRepository;
import pl.wojcik.jakub.spring_tutorial.domain.User;

public class UsersRepositoryImpl implements UsersRepository{
	private Logger logger;

	public User createUser(String name) {
		logger.log("Tworzenie użytkownika " + name);
		return new User(name);
	}

	public void setLogger(Logger logger) {
		this.logger = logger;
		
	}
	
}
