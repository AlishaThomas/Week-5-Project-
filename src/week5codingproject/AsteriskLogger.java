package week5codingproject;

public class AsteriskLogger implements Logger{

	@Override
	public void log(String word) {
		
		System.out.println("***"+ word +"***");
	}

	@Override
	public void error(String error) {
		String starError = "***" + error+ "***";  
		String Box = "*".repeat(starError.length());
		System.out.println(Box);
		System.out.println(starError);
		System.out.println(Box);
	}


	

}
