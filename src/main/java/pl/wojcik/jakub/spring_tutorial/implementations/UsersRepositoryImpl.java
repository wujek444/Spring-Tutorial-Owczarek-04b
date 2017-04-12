package pl.wojcik.jakub.spring_tutorial.implementations;

import pl.wojcik.jakub.spring_tutorial.api.Logger;
import pl.wojcik.jakub.spring_tutorial.api.UsersRepository;
import pl.wojcik.jakub.spring_tutorial.domain.User;

public class UsersRepositoryImpl implements UsersRepository{
	private Logger logger;
	
	
	public UsersRepositoryImpl(Logger logger, String localization, String dbName) {
		this.logger = logger;
		logger.log("Lokalizacja repozytorium: " + localization + "/" + dbName);
	}

	public User createUser(String name) {
		logger.log("Tworzenie użytkownika " + name);
		return new User(name);
	}
	//metoda setLogger usunięta
	
}
