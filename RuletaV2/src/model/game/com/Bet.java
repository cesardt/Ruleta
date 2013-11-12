package model.game.com;

public class Bet {
	
	private int amount;
	private Outcome outcome;
	
	public Bet(int amount, Outcome outcome){
		this.amount = amount;
		this.outcome = outcome;
		
	}
	
	public int getAmountBet(){
		return this.amount;
	}
	
	public java.lang.String getAmountBetFormatted(int amountToBeFormatted){
		
	}
	
	public Outcome getOutcome(){
		return this.outcome;	
	}
	
	public int loseAmount(){
		return this.amount;
	}
	
	public java.lang.String toString(){
		return "Bet "+amount+" to "+this.outcome;
	}
	
	public int winAmount(){
		return this.outcome.winAmount(this.amount);
	}

}
