package pl.wojcik.jakub.spring_tutorial.api;

import pl.wojcik.jakub.spring_tutorial.domain.User;

public interface UsersRepository {
	User createUser(String name);
	//metoda setLogger usunięta
}
