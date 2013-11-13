package player.game.com;

import javax.swing.JOptionPane;

import model.game.com.Bet;
import model.game.com.Table;

public abstract class Player {
	
	private int stake;
	private int roundsToGo;
	private Table table;
	
	public Player(Table table){
		this.table=table;
	}
	
	public int getStake(){
		return this.stake;
	}
	/*
	public Table getTable_Bets(){
		
	}
	*/
	public boolean isPlaying(){
		return this.roundsToGo>0;
	}
	
	public void lose(Bet bet){
		JOptionPane.showMessageDialog(null, "The bet was not a winner");
	}
	
	abstract void placeBets();
	
	public void setRoundsToGo(int roundsToGo){
		this.roundsToGo = roundsToGo;
	}
	
	public void setStake(int stake){
		this.stake = stake;
	}
	
	public void win(Bet bet){
		JOptionPane.showMessageDialog(null, "The bet was a winner");
		this.stake += bet.getOutcome().winAmount(bet.getAmountBet());
	}

}
