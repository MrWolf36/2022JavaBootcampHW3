package Homework.core;



public class DatabaseLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println(data +" Database tarafından Loglandı ");
		
	}

}
