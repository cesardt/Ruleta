package model.game.com;
import java.util.LinkedList;
import java.util.ListIterator;

import exceptions.game.com.InvalidBetException;
public class Table {
	private LinkedList<Bet> bets;
	private int limit;
	
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public Table(){
		this.limit = 4;
		this.bets = new LinkedList<Bet>();
		
	}
	
	public void cleanTable(){
		this.bets.clear();
	}
	
	public boolean isValid(Bet bet){
		int l=0;
		for (int i =0; i< bets.size(); i++){
			l+=bets.get(i).getAmountBet();
		}
		l= l+bet.getAmountBet();
		
		if(l>limit){
			
			return false;
		}
		
		return true;
		
	}
	
	
	public void placeBet(Bet bet) throws InvalidBetException{
		if(!isValid(bet)){
			throw new InvalidBetException();
		}
		else{
			bets.add(bet);
		}
		
	}
	
	public java.util.ListIterator<Bet> iterator(){
		ListIterator<Bet> li = (ListIterator<Bet>) this.bets.iterator();
		return li;
	}
	public String toString (){
		String str="";
		for(Bet b:bets){
			str+=b.toString()+"\n";
		}
		return str;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}