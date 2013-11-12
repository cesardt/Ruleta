package model.game.com;

import java.util.Iterator;

public class Bin {
	
	java.util.Collection<Outcome> outcomes;
	
	public Bin(){
		this.outcomes.clear();
	}
	
	public Bin(java.util.Collection<Outcome> outcomes){
		this.outcomes = outcomes;
	}
	
	public Bin(Outcome[] outcomes){
		for(int i = 0; i < outcomes.length; i++){
			this.outcomes.add(outcomes[i]);
		}
	}
	
	public void add(Outcome outcome){
		this.outcomes.add(outcome);
	}
	
	public java.util.Set<Outcome> getMySetOutcomes(){
		 java.util.Set<Outcome> outcomeSet = new java.util.HashSet<Outcome>();
		 Iterator<Outcome> iterator = outcomes.iterator();
		 Outcome temp;
		 
		 for(int i = 0; i < this.outcomes.size(); i++){
			 temp = iterator.next();
			 if(outcomeSet.contains(temp)){
				 outcomeSet.add(temp);
			 }
		 }
		 
		 return outcomeSet;
	}
	
	public java.lang.String toString(){
		String var = "";
		Iterator<Outcome> iterator = outcomes.iterator();
		for(int i = 0; i < outcomes.size(); i++){
			var.concat(iterator.next()+"/n");
		}
		return var;
	}

}
