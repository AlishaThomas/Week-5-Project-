package week5codingproject;

public class App {

	public static void main(String[] args) {
		
		Logger logger = new AsteriskLogger();
		
		logger.log("This is a string!");
		
		Logger logger2 = new AsteriskLogger();
		
		logger2.error("This is error one!");
		
		Logger logger3 = new SpacedLogger();
		
		logger3.log("This is a string with spaces!");
		
		Logger logger4 = new SpacedLogger();
		
		logger4.error("This is error number two!");
	}

}
