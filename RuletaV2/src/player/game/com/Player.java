package player.game.com;

import model.game.com.Bet;
import model.game.com.Table;

public abstract class Player {
	
	int stake;
	int roundsToGo;
	Table table;
	
	public Player(Table table){
		this.table=table;
	}
	
	public int getStake(){
		return this.stake;
	}
	
	public Table getTable_Bets(){
		
	}
	
	public boolean isPlaying(){
		
	}
	
	public void lose(Bet bet){
		this.stake = this.stake - bet.getAmountBet();
	}
	
	abstract void placeBets();
	
	public void setRoundsToGo(int roundsToGo){
		this.roundsToGo = roundsToGo;
	}
	
	public void setStake(int stake){
		this.stake = stake;
	}
	
	public void win(Bet bet){
		this.stake = this.stake + bet.getOutcome().winAmount(bet.getAmountBet()) - bet.getAmountBet();
	}

}
