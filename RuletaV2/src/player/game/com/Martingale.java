package player.game.com;

import exceptions.game.com.InvalidBetException;
import model.game.com.Bet;
import model.game.com.Outcome;
import model.game.com.Table;

public class Martingale extends Player {
	private int lossCount=0;
	private int betMultiple = 1;
	private Table table;
	public Martingale(Table table){
		super(table);
		this.table=table;
	}
	
	public void lose(Bet bet){
		super.lose(bet);
		this.lossCount++;
		this.betMultiple=this.betMultiple*2;
	}
	
	public void placeBets(){
		Bet bet = new Bet(2^lossCount, new Outcome("Black",1));
		try {
			this.table.placeBet(bet);
		} catch (InvalidBetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void setBetMultiple(int betMultiple){
		this.betMultiple=betMultiple;
	}
	
	public void setLossCount(int lossCount){
		this.lossCount=lossCount;
	}
	
	public void win(Bet bet){
		super.win(bet);
		this.betMultiple = 1;
	}


}
