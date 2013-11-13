package model.game.com;

public class Outcome implements Comparable {
	
	String name;
	int odds;
	
	public Outcome(java.lang.String name, int odds){
		this.name = name;
		this.odds = odds;
	}
	
	public int compareTo(java.lang.Object o){
		return this.name.compareTo(((Outcome)o).name);
	}
	
	public boolean equals(java.lang.Object obj){
		return this.name == ((Outcome)obj).name;
	}
	
	public java.lang.String getName(){
		return this.name;
	}
	
	public int getOdds(){
		return this.odds;
	}
	
	public int hashCode(){
		return 0;
	}
	
	public void setName(java.lang.String name){
		this.name = name;
	}
	
	public void setOdds(int odds){
		this.odds = odds;
	}
	
	public java.lang.String toString(){
        return name+" ("+odds+":1)";
	}
	
	public int winAmount(int amount){
		return amount * odds;
	}

}
