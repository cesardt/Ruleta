package player.game.com;

import exceptions.game.com.InvalidBetException;
import model.game.com.*;

public class Martingale extends Player {
	private int lossCount=0;
	public Martingale(Table table){
		super(table);
	}
	
	public void lose(Bet bet){
		super.lose(bet);
		this.lossCount++;
	}
	
	public void placeBets() throws InvalidBetException{
		
	}
	
	public void setBetMultiple(int betMultiple){
		
	}
	
	public void setLossCount(int lossCount){
		this.lossCount=lossCount;
	}
	
	public void win(Bet bet){
		super.win(bet);
		this.lossCount=0;
	}

}
