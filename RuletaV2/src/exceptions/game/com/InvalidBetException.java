package exceptions.game.com;

public class InvalidBetException extends Exception {
	String message;
	public InvalidBetException(){
		
	}
	
	public String getMessage(){
		return this.message;
	}

}
