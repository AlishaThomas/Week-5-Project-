package week5codingproject;

public class AsteriskLogger implements Logger{

	@Override
	public void log(String word) {
		
		System.out.println("***"+ word +"***");
	}

	@Override
	public void error(String error) {
		System.out.println("*************************");
		System.out.println("***Error: "+ error + "***");
		System.out.println("*************************");
	}


	

}
