package main.game.com;
import java.util.ListIterator;

import model.game.com.Bet;
import model.game.com.Bin;
import model.game.com.BinBuilder;
import model.game.com.Outcome;
import model.game.com.Table;
import model.game.com.Wheel;
import player.game.com.Martingale;
public class RouletteGame {
	Table table = new Table();
	Martingale p1 = new Martingale(table);
	Wheel wheel = new Wheel();
	BinBuilder bb = new BinBuilder();
	public RouletteGame(){
		bb.buildBins(this.wheel);
	}
	
	public static void main(String[] args){
		RouletteGame rg = new RouletteGame();
		rg.p1.placeBets();
		Bin w = rg.wheel.next();
		ListIterator<Bet> li= rg.table.iterator();
		Bet tmp;
		java.util.Set<Outcome> outcomes=w.getMySetOutcomes();
		while((tmp=li.next())!=null){
			if(outcomes.contains(tmp.getOutcome())){
				rg.p1.win(tmp);
			}
			else {
				rg.p1.lose(tmp);
			}
		}
	}

}
