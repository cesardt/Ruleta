package exceptions.game.com;

public class InvalidBetException extends Exception {
	
	public InvalidBetException(){
		
	}
	
	public String getMessage(){
		return "Invalid bet placed";
	}

}
