package pl.wojcik.jakub.spring_tutorial.api;

public interface Logger {
	void log(String message);
	void setName(String name);
	void setVersion(int version);
}
