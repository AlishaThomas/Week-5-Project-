package week5codingproject;

public class SpacedLogger implements Logger {

	@Override
	public void log(String string) {
		
		for(int i = 0;  i < string.length(); i++) {
			System.out.print(string.charAt(i)+" ");
		
		}
		
	}

	@Override
	public void error(String error) {
		System.out.print("\n"+"Error: ");
		for(int i = 0; i < error.length(); i++) {
			System.out.print(error.charAt(i)+" ");
		
	
	}


	}
}
